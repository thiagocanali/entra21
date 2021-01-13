package Persistencia.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidade.Compra;

public class CompraDAO {

	private Connection conexao = ConexaoFactory.getConnection();
	
	public boolean insert(Compra compra) {
		
		String sql = "insert into compra (cod, dataCompra, valorCompra, cod_cli) values (?, ?, ?, ?)";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setInt(1, compra.getCod());
			comandoSql.setDate(2, (Date) compra.getDataCompra());
			comandoSql.setDouble(3, compra.getValorCompra());
			comandoSql.setInt(4, compra.getCod_cli());
			comandoSql.execute();
			
			comandoSql.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public boolean update(Compra compra) {
		
		String sql = "Update compra set dataCompra = ?, valorCompra = ?, cod_cli = ? where cod = ?";
		
		try {
			PreparedStatement comandoSql = conexao.prepareStatement(sql);
			
			comandoSql.setDate(1, (Date) compra.getDataCompra());
			comandoSql.setDouble(2, compra.getValorCompra());
			comandoSql.setInt(3, compra.getCod_cli());
			comandoSql.setInt(4, compra.getCod());
			comandoSql.execute();
			
			comandoSql.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}


	public boolean delete(int cod) {
	
		String sql = "Delete from compra where cod = ?";
		
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
	
	
	public Compra buscarPorCod(int cod) {
			
			Compra compra = new Compra();
			
			String sql = "select * from produto where cod = ?";
			
			try {
				PreparedStatement comandoSql = conexao.prepareStatement(sql);
				
				comandoSql.setInt(1, cod);
				
				ResultSet resulSet = comandoSql.executeQuery();
				
				if (resulSet.next()) {
					compra.setCod(resulSet.getInt(1));
					compra.setDataCompra(resulSet.getDate(2));
					compra.setValorCompra(resulSet.getDouble(3));
					compra.setCod_cli(resulSet.getInt(4));
					comandoSql.close();
					return compra;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			return null;
		}
	
	public List<Compra> buscarTodos() {
			
			List<Compra> lista = new ArrayList<Compra>();
			
			String sql = "select * from compra";
			
			try {
				PreparedStatement comandoSql = conexao.prepareStatement(sql);
				
				ResultSet resulSet = comandoSql.executeQuery();
				comandoSql.close();	
				
				while (resulSet.next()) {
					Compra compra = new Compra();
					
					compra.setCod(resulSet.getInt(1));
					compra.setDataCompra(resulSet.getDate(2));
					compra.setValorCompra(resulSet.getDouble(3));
					compra.setCod_cli(resulSet.getInt(4));
					lista.add(compra); 
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			return lista;
		}

}