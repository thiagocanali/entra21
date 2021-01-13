package Persistencia.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidade.Cliente;

public class ClienteDAO {

	private Connection conexao = ConexaoFactory.getConnection();
	
	public boolean insert(Cliente cliente) {
		
		String sql = "insert into cliente (cod, rg, nome, cpf, sexo) values (?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setInt(1, cliente.getCod());
			comandoSql.setString(2, cliente.getRg());
			comandoSql.setString(3, cliente.getNome());
			comandoSql.setString(4, cliente.getCpf());
			comandoSql.setString(5, cliente.getSexo());
			
			comandoSql.equals(sql);
			
			comandoSql.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}
	
	public boolean update(Cliente cliente) {
		
		String sql = "Update cliente set rg = ?, nome = ?, cpf = ?, sexo = ? where cod = ?";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setString(1, cliente.getRg());
			comandoSql.setString(2, cliente.getNome());
			comandoSql.setString(3, cliente.getCpf());
			comandoSql.setString(4, cliente.getSexo());
			comandoSql.setInt(5, cliente.getCod());
			
			comandoSql.execute();
			
			comandoSql.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}
	
	public boolean delete(int cod) {
		
		String sql = "Delete from cliente where cod = ?";
		
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
	
	public Cliente buscarPorCod(int cod) {
		
		Cliente cliente = new Cliente();
		
		String sql = "select * from cliente where cod = ?";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setInt(1, cod);
			
			ResultSet resulSet = comandoSql.executeQuery();
			
			if (resulSet.next()) {
				cliente.setCod(resulSet.getInt(1));
				cliente.setRg(resulSet.getString(2));
				cliente.setNome(resulSet.getString(3));
				cliente.setCpf(resulSet.getString(4));
				cliente.setSexo(resulSet.getString(5));
				comandoSql.close();
				return cliente;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	
	public List<Cliente> buscarTodos() {
		
		List<Cliente> lista = new ArrayList<Cliente>();
		
		String sql = "select * from cliente";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			ResultSet resulSet = comandoSql.executeQuery();
			
			while (resulSet.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setCod(resulSet.getInt(1));
				cliente.setRg(resulSet.getString(2));
				cliente.setNome(resulSet.getString(3));
				cliente.setCpf(resulSet.getString(4));
				cliente.setSexo(resulSet.getString(5));
				lista.add(cliente); //adiciona o cliente na lista
			}
			comandoSql.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		return lista;
	}
	
	
	
}
