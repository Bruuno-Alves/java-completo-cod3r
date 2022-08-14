package jdbc;

public class DAOTeste {

	public static void main(String[] args) {

		DAO dao = new DAO();
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		
		System.out.println(dao.incluir(sql, "Carla Moraes", 1004));
		System.out.println(dao.incluir(sql, "V�nia Cristina", 1005));
		System.out.println(dao.incluir(sql, "Camilla Morgado", 1006));
	}

}
