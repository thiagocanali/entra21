package br.com.projetoweb.model;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.dao.PessoaDAO;

public class PessoaModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static ArrayList<Pessoa> listaPessoas() {
			return PessoaDAO.listaPessoas();
	}

	public Pessoa getPessoaById(int id) {
		// TODO Auto-generated method stub
		return PessoaDAO.getPessoaById(id);
	}

	public static int cadastraPessoa(Pessoa pessoaSubmit) {
		// TODO Auto-generated method stub
		return PessoaDAO.cadastraPessoa(objPessoa);
	}
}
 