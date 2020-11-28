package br.com.projetofilmes.cnn;

import java.sql.*;

public class ConnectionFactory {

	public static Connection GetConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/filmes?useTimezone=true&serverTimezone=UTC&useSSL=false", "root", "root");
			return cnn;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			// TODO: handle exception
			cnf.printStackTrace();
		}
		return null;
	}
}
