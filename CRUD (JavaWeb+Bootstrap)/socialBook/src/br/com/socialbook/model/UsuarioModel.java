package br.com.socialbook.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.socialbook.beans.Usuario;
import br.com.socialbook.dao.UsuarioDAO;

public class UsuarioModel {

	public static Usuario getLogin(String login, String senha) throws ParseException {
		String senhaCript = senha;
		
		return UsuarioDAO.getLogin();
	}

}
