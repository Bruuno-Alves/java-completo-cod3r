package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private final int LINHA;
	private final int COLUNA;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();
	
	Campo(int linha, int coluna) {
		this.LINHA = linha;
		this.COLUNA = coluna;
	}
	
	public void registrarObservador(CampoObservador observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream().forEach(o -> o.eventoOcorreu(this, evento));
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = this.LINHA != vizinho.LINHA;
		boolean colunaDiferente = this.COLUNA != vizinho.COLUNA;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(this.LINHA - vizinho.LINHA);
		int deltaColuna = Math.abs(this.COLUNA - vizinho.COLUNA);
		int deltaTotal = deltaLinha + deltaColuna;
		
		if(deltaTotal == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if(deltaTotal == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}
	
	public void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
			
			if(marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			} else {
				notificarObservadores(CampoEvento.DESMARCAR);
			}
		}
	}
	
	public boolean abrir() {
		
		if(!aberto && !marcado) {
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}
			
			setAberto(true);
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	void minar() {
		this.minado = true;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isMarcado() {
		return this.marcado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);
		}
	}

	public boolean isAberto() {
		return this.aberto;
	}
	
	public boolean isFechado() {
		return !this.isAberto();
	}

	public int getLINHA() {
		return LINHA;
	}

	public int getCOLUNA() {
		return COLUNA;
	}
	
	public boolean objetivoAlcancado() {
		boolean desvendado = !this.minado && this.aberto;
		boolean protegido = this.minado && this.marcado;
		return desvendado || protegido;
	}
	
	public int minasNaVizinhanca() {
		return (int) vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		this.aberto = false;
		this.minado = false;
		this.marcado = false;
		notificarObservadores(CampoEvento.REINICIAR);
	}
	
}
