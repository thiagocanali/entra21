package Persistencia.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidade.Endereco;


public class EnderecoDAO {
	
private Connection conexao = ConexaoFactory.getConnection();
	
	public boolean insert(Endereco endereco) {
		
		String sql = "insert into endereco (cod, rua, cidade, bairro, estado, cod_cli ) values (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setInt(1, endereco.getCod());
			comandoSql.setString(2, endereco.getRua());
			comandoSql.setString(3, endereco.getCidade());
			comandoSql.setString(4, endereco.getBairro());
			comandoSql.setString(5, endereco.getEstado());
			comandoSql.setInt(6, endereco.getCod_cli());
			comandoSql.execute();
			
			comandoSql.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public boolean update(Endereco endereco) {
		
		String sql = "Update endereco set rua = ?, cidade = ?, bairro = ?, estado = ?, cod_cli = ? where cod = ?";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setString(1, endereco.getRua());
			comandoSql.setString(2, endereco.getCidade());
			comandoSql.setString(3, endereco.getBairro());
			comandoSql.setString(4, endereco.getEstado());
			comandoSql.setInt(5, endereco.getCod_cli());
			comandoSql.setInt(6, endereco.getCod());
			comandoSql.execute();
			
			comandoSql.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}


	public boolean delete(int cod) {
	
		String sql = "Delete from endereco where cod = ?";
		
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
	
	
	public Endereco buscarPorCod(int cod) {
			
			Endereco endereco = new Endereco();
			
			String sql = "select * from endereco where cod = ?";
			
			try {
				PreparedStatement comandoSql = conexao.prepareStatement(sql);
				
				comandoSql.setInt(1, cod);
				
				ResultSet resulSet = comandoSql.executeQuery();
				
				if (resulSet.next()) {
					endereco.setCod(resulSet.getInt(1));
					endereco.setRua(resulSet.getString(2));
					endereco.setCidade(resulSet.getString(3));
					endereco.setBairro(resulSet.getString(4));
					endereco.setEstado(resulSet.getString(5));
					endereco.setCod_cli(resulSet.getInt(6));
					comandoSql.close();
					return endereco;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			return null;
		}
	
	public List<Endereco> buscarTodos() {
			
			List<Endereco> lista = new ArrayList<Endereco>();
			
			String sql = "select * from endereco";
			
			try {
				PreparedStatement comandoSql = conexao.prepareStatement(sql);
				
				ResultSet resulSet = comandoSql.executeQuery();
				comandoSql.close();	
				
				while (resulSet.next()) {
					Endereco endereco = new Endereco();
					//cod, rua, cidade, bairro, estado, cod_cli 
					endereco.setCod(resulSet.getInt(1));
					endereco.setRua(resulSet.getString(2));
					endereco.setCidade(resulSet.getString(3));
					endereco.setBairro(resulSet.getString(4));
					endereco.setEstado(resulSet.getString(5));
					endereco.setCod_cli(resulSet.getInt(6));
					lista.add(endereco); 
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			return lista;
		}



}
