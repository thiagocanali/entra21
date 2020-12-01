package br.com.meudiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.meudiario.beans.Nota;
import br.com.meudiario.cnn.ConnectionFactory;

public class NotasDAO {

	public static List<Nota> getListNotas() {
		List<Nota> listaRetorno = new ArrayList<Nota>();
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM notas";
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsNotas = pStm.executeQuery();
			while(rsNotas.next()) {
				Nota nt = new Nota(rsNotas.getInt("id"),rsNotas.getString("assunto"),rsNotas.getString("dt_nota"),rsNotas.getString("texto"));
				listaRetorno.add(nt);
			}
			rsNotas.close();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaRetorno;
	}

	public static int cadNota(Nota nt) {
		Connection cnn = ConnectionFactory.getConnection();
		String sql = "INSERT INTO notas(assunto, dt_nota, texto) values" +
					 " (?, ?, ?)";
		int retorno=0;
		try {
			PreparedStatement pStm = cnn.prepareStatement(sql);
			pStm.setString(1, nt.getAssunto());
			pStm.setString(2, nt.getDtNota());
			pStm.setString(3, nt.getTexto());
			
			retorno = pStm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}

	public static int editNota(Nota nt) {
		Connection cnn = ConnectionFactory.getConnection();
		String sql = "UPDATE notas SET assunto = ?, dt_nota = ?, texto =? " +
					 " WHERE id =?";
		int retorno=0;
		try {
			PreparedStatement pStm = cnn.prepareStatement(sql);
			pStm.setString(1, nt.getAssunto());
			pStm.setString(2, nt.getDtNota());
			pStm.setString(3, nt.getTexto());
			pStm.setInt(4, nt.getId());
			
			retorno = pStm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}

	public static Nota getNotaById(int id) {
		Nota notaRetorno = new Nota();
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM notas WHERE id = ?";
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			pStm.setInt(1, id);
			ResultSet rsNotas = pStm.executeQuery();
			while(rsNotas.next()) {
				notaRetorno = new Nota(rsNotas.getInt("id"),rsNotas.getString("assunto"),rsNotas.getString("dt_nota"),rsNotas.getString("texto"));
			}
			rsNotas.close();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notaRetorno;
	}

	public static int delNota(int id) {
		Connection cnn = ConnectionFactory.getConnection();
		String sql = "DELETE FROM notas WHERE id= ?";
		int retorno=0;
		try {
			PreparedStatement pStm = cnn.prepareStatement(sql);
			pStm.setInt(1, id);
			
			retorno = pStm.executeUpdate();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}

}
