package Persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

	private static Connection conexao = null;
	
	public static Connection getConnection() {
		try {
			
			Class.forName("org.postgresql.Driver"); //Força carregamento do driver postgresql
			
			//padrão singleton 
			if (conexao == null) {
				conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DBfloricultura", "postgres", "adm123");
			}
			return conexao;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
}
