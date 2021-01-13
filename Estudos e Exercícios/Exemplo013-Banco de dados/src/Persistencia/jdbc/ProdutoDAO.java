package Persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidade.Cliente;
import Entidade.Produto;

public class ProdutoDAO {
	
private Connection conexao = ConexaoFactory.getConnection();
	
	public boolean insert(Produto produto) {
		
		String sql = "insert into produto (cod, nomeProduto, tipo, preco, qtd) values (?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setInt(1, produto.getCod());
			comandoSql.setString(2, produto.getNomeProduto());
			comandoSql.setString(3, produto.getTipo());
			comandoSql.setFloat(4, produto.getPreco());
			comandoSql.setInt(5, produto.getQtd());
			comandoSql.execute();
			
			comandoSql.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}
	
	public boolean update(Produto produto) {
		
		String sql = "Update produto set qtd = ?, nomeProduto = ?, tipo = ?, preco = ? where cod = ?";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setInt(1, produto.getQtd());
			comandoSql.setString(2, produto.getNomeProduto());
			comandoSql.setString(3, produto.getTipo());
			comandoSql.setFloat(4, produto.getPreco());
			comandoSql.setInt(5, produto.getCod());
			
			comandoSql.execute();
			
			comandoSql.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean delete(int cod) {
		
		String sql = "Delete from produto where cod = ?";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setInt(1, cod);
			
			comandoSql.execute();
			
			comandoSql.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public Produto buscarPorCod(int cod) {
		
		Produto produto = new Produto();
		
		String sql = "select * from produto where cod = ?";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setInt(1, cod);
			
			ResultSet resulSet = comandoSql.executeQuery();
			
			if (resulSet.next()) {
				produto.setCod(resulSet.getInt(1));
				produto.setNomeProduto(resulSet.getString(2));
				produto.setTipo(resulSet.getString(3));
				produto.setPreco(resulSet.getFloat(4));
				produto.setQtd(resulSet.getInt(5));
				comandoSql.close();
				return produto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public List<Produto> buscarTodos() {
		
		List<Produto> lista = new ArrayList<Produto>();
		
		String sql = "select * from produto";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			ResultSet resulSet = comandoSql.executeQuery();
			comandoSql.close();	
			
			while (resulSet.next()) {
				Produto produto = new Produto();
				
				produto.setCod(resulSet.getInt(1));
				produto.setNomeProduto(resulSet.getString(2));
				produto.setTipo(resulSet.getString(3));
				produto.setPreco(resulSet.getFloat(4));
				produto.setQtd(resulSet.getInt(5));
				lista.add(produto); 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return lista;
	}

}
