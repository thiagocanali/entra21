package br.com.projetofilmes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.projetofilmes.beans.Filme;
import br.com.projetofilmes.cnn.ConnectionFactory;

public class FilmeDAO {

	public static ArrayList<Filme> listaFilmes() {
		Connection cnn = ConnectionFactory.GetConnection();
		String query = "select * from filme";
		ArrayList<Filme> arFilmes = new ArrayList();

		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsFilmes = pStm.executeQuery();

			while (rsFilmes.next()) {
				Filme filme = new Filme(rsFilmes.getLong("id"), rsFilmes.getString("titulo"),
						rsFilmes.getInt("classificacao"), rsFilmes.getString("genero"));
				arFilmes.add(filme);
			}
			cnn.close();
			rsFilmes.close();
			return arFilmes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Filme getFilmeById(int id) {
		Filme filmeRetorno = new Filme();
		String query = "SELECT * FROM filme WHERE id = ?";
		Connection cnn = ConnectionFactory.GetConnection();

		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, id);

			ResultSet rsFilmes = pStmt.executeQuery();
			while (rsFilmes.next()) {
				filmeRetorno.setId(id);
				filmeRetorno.setTitulo(rsFilmes.getString("titulo"));
				filmeRetorno.setClassificacao(rsFilmes.getInt("classificacao"));
				filmeRetorno.setGenero(rsFilmes.getString("genero"));
			}
			rsFilmes.close();
			cnn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return filmeRetorno;
	}

	public static int cadastrarFilme(Filme filmeSubmit) {
		String query = "INSERT INTO filme (titulo, classificacao, genero) VALUES (?, ?, ?)";
		Connection cnn = ConnectionFactory.GetConnection();
		int linhasAfetadas = 0;

		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, filmeSubmit.getTitulo());
			pStmt.setInt(2, filmeSubmit.getClassificacao());
			pStmt.setString(3, filmeSubmit.getGenero());
			linhasAfetadas = pStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static int updateFilme(Filme filmeSubmit) {
		String query = "UPDATE filme SET titulo = ?, classificacao ? WHERE = id= ?";
		Connection cnn = ConnectionFactory.GetConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, filmeSubmit.getTitulo());
			pStmt.setInt(2, filmeSubmit.getClassificacao());
			pStmt.setLong(3, filmeSubmit.getId());
			linhasAfetadas = pStmt.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

	public static int delFilmes(int id) {
		String query = "DELETE FROM filme WHERE id = ?";
		Connection cnn = ConnectionFactory.GetConnection();
		int linhasAfetadas = 0;

		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, id);
			linhasAfetadas = pStmt.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

}
