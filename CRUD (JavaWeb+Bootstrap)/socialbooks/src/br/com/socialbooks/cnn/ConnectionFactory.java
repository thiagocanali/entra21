package br.com.socialbooks.cnn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection()  {
		try {
		String url = "jdbc:mysql://localhost:3306/socialbooks?useTimezone=true&serverTimezone=UTC&useSSL=false";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnn = DriverManager.getConnection(url, "root", "root");
	
		return cnn;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}