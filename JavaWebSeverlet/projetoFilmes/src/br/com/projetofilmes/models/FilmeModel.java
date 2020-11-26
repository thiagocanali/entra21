package br.com.projetofilmes.models;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.projetofilmes.beans.Filme;
import br.com.projetofilmes.dao.FilmeDAO;

public class FilmeModel implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	public ArrayList<Filme> listaFilmes(){
			return FilmeDAO.listaFilmes();
	}
	
	public Filme getFilmeByID(int id) {
		return FilmeDAO.getFilmeById(id);
	}
	
	public static int cadastraFilme(Filme filmeSubmit) {
		return FilmeDAO.cadastrarFilme(filmeSubmit);
	}

	public static int UpdateFilme (Filme filmeSubmit) {
		return FilmeDAO.updateFilme(filmeSubmit);
	}
	
	public static int delFilme (int id) {
		return FilmeDAO.delFilmes(id);
	}
}
