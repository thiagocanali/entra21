package br.com.series.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.series.bean.Serie;
import br.com.series.cnn.ConnectionFactory;

public class SeriesDAO {

	public static List<Serie> getListSeries() {
		List<Serie> listaRetorno = new ArrayList<Serie>();
		String query = "SELECT * FROM series";
		try {
			Connection cnn = ConnectionFactory.GetConnection();
			PreparedStatement pStm = cnn.prepareStatement(query);
			
			ResultSet rsSeries = pStm.executeQuery();
			
			while (rsSeries.next()) {
				Serie serie = new Serie(rsSeries.getInt("id"), rsSeries.getString("nome"), rsSeries.getInt("votos"));
				listaRetorno.add(serie);
			}
			rsSeries.close();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
