package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		String sqlSelect = "SELECT * FROM pessoas";
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sqlSelect);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
		}
		stmt.close();
		
		System.out.print("\nInforme um código para exclusão: ");
		int codExclusao = scan.nextInt();
		
		String sqlDelete = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmtDel = conexao.prepareStatement(sqlDelete);
		stmtDel.setInt(1, codExclusao);
		
		if(stmtDel.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		} else {
			System.out.println("Falha na exclusão.");
		}
		
		conexao.close();
		scan.close();
	}

}
