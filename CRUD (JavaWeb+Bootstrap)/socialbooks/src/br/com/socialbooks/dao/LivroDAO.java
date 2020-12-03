package br.com.socialbooks.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.socialbooks.beans.Categoria;
import br.com.socialbooks.beans.Livro;
import br.com.socialbooks.cnn.ConnectionFactory;

public class LivroDAO {

	public static List<Livro> getListLivros() {
		List<Livro> listaRetorno = new ArrayList<Livro>();
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT l.id, l.titulo, l.autor, c.titulo categoria FROM livro l, categoria c WHERE l.categoria_id = c.id";
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsLivros = pStm.executeQuery();
			
			while(rsLivros.next()) {
				Categoria categoria = new Categoria(rsLivros.getInt("id_categoria"), 
													rsLivros.getString("categoria"));
													
				Livro livro = new Livro(rsLivros.getInt("id"), 
										categoria,
										rsLivros.getString("titulo"), 
										rsLivros.getString("autor"));
				
				listaRetorno.add(livro);
			}
			rsLivros.close();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaRetorno;
	}

	public static int cadLivro(Livro livro) {
		Connection cnn = ConnectionFactory.getConnection();
		String sql = "INSERT INTO livros(titulo, autor) VALUES"
				   + "(?, ?)";
		int retorno = 0;
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(sql);
			pStm.setString(1, livro.getTitulo());
			pStm.setString(2, livro.getAutor());
			
			retorno = pStm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}

	public static int editLivro(Livro livro) {
		Connection cnn = ConnectionFactory.getConnection();
		String sql = "UPDATE livros SET titulo = ?, autor = ? WHERE id = ?";
		int retorno = 0;
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(sql);
			pStm.setString(1, livro.getTitulo());
			pStm.setString(2, livro.getAutor());
			pStm.setLong(3, livro.getId());
			
			retorno = pStm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}

	public static Livro getLivroById(int id) {
		Livro livro = new Livro();
		String query = "SELECT * FROM livros WHERE id = ?";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement pSmt =cnn.prepareStatement(query);
			pSmt.setInt(1, id);
			
			ResultSet rsLivro = pSmt.executeQuery();
					
			while(rsLivro.next()) {
				livro.setId(id);
				livro.setTitulo(rsLivro.getString("titulo"));
				livro.setAutor("autor");
			}
			
;		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return livro;
	}

	public static int delLivro(int id) {
		String query = "DELETE FROM livros WHERE id = ?";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pSmt = cnn.prepareStatement(query);
			pSmt.setInt(1, id);
			linhasAfetadas = pSmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}

}
