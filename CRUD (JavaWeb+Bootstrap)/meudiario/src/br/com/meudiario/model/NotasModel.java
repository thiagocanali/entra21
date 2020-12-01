package br.com.meudiario.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.meudiario.beans.Nota;
import br.com.meudiario.dao.NotasDAO;

public class NotasModel {

	public static List<Nota> getListNotas() {
		return NotasDAO.getListNotas();
	}

	public static int cadNota(String assunto, String dtNota, String texto) throws ParseException {
		Nota nt = new Nota();
		nt.setAssunto(assunto);
		nt.setTexto(texto);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date data = format.parse(dtNota);
		String dtFormatada = format.format(data);
		nt.setDtNota(dtFormatada);
				
		return NotasDAO.cadNota(nt);
	}

	public static int editNota(int id, String assunto, String dtNota, String texto) throws ParseException {
		Nota nt = new Nota();
		nt.setId(id);
		nt.setAssunto(assunto);
		nt.setTexto(texto);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date data = format.parse(dtNota);
		String dtFormatada = format.format(data);
		nt.setDtNota(dtFormatada);
				
		return NotasDAO.editNota(nt);
	}

	public static Nota getNotaById(int id) {
		// TODO Auto-generated method stub
		return NotasDAO.getNotaById(id);
	}

	public static int delNota(int id) {
		// TODO Auto-generated method stub
		return NotasDAO.delNota(id);
	}

}
