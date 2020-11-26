package br.com.projetoweb.model;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.dao.PessoaDAO;

public class PessoaModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public ArrayList<Pessoa> listaPessoas() {
			return PessoaDAO.listaPessoas();
	}

	public Pessoa getPessoaById(int id) {
		return PessoaDAO.getPessoaById(id);
	}

	public static int cadastraPessoa(Pessoa pessoaSubmit) {
		// TODO Auto-generated method stub
		return PessoaDAO.cadastraPessoa(pessoaSubmit);
	}

	public static int updatePessoa(Pessoa pessoaSubmit) {
		return PessoaDAO.updatePessoa(pessoaSubmit);
	}

	public static int delPessoa(int id) {
		return PessoaDAO.delPessoa(id);
	}
}
