package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {
	
	private Double valorDaBolsa;
	
	public AlunoBolsista() {

	}

	public AlunoBolsista(Long matricula, String nome, Double valorDaBolsa) {
		super(matricula, nome);
		this.valorDaBolsa = valorDaBolsa;
	}

	public Double getValorDaBolsa() {
		return valorDaBolsa;
	}

	public void setValorDaBolsa(Double valorDaBolsa) {
		this.valorDaBolsa = valorDaBolsa;
	}
	
	

}
