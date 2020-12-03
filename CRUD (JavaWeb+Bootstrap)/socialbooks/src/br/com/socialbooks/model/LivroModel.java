package br.com.socialbooks.model;

import java.text.ParseException;
import java.util.List;

import br.com.socialbooks.beans.Livro;
import br.com.socialbooks.dao.LivroDAO;

public class LivroModel {
	
	public static List<Livro> getListLivros() {
		return LivroDAO.getListLivros();
	}
	
	public static int cadLivro(String titulo, String autor) throws ParseException {
		Livro livro = new Livro();
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		
		return LivroDAO.cadLivro(livro);
	}
	
	public static int editLivro(int id, String titulo, String autor) throws ParseException {
		Livro livro = new Livro();
		livro.setId(id);
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		
		return LivroDAO.editLivro(livro);
	}
	
	public static Livro getLivroById(int id) {
		return LivroDAO.getLivroById(id);
	}
	
	public static int delLivro(int id) {
		return LivroDAO.delLivro(id);
	}
}
