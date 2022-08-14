package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarCadastro {

	public static void main(String[] args) throws SQLException {

		Connection conexao = FabricaConexao.getConexao();
		Scanner scan = new Scanner(System.in);
		
		String sqlSelect = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		System.out.print("Informe o código da pessoa: ");
		int codigo = scan.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual da pessoa é: " + pessoa.getNome());
			scan.nextLine();
			
			System.out.print("Informe o novo nome da pessoa: ");
			String novoNome = scan.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(sqlUpdate);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Nome alterado com sucesso!");
		} else {
			System.out.println("Usuário não encontrado");
		}
		
		scan.close();
		conexao.close();
		
	}

}
