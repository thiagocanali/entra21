package br.com.projetoweb.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.cnn.ConnectionFactory;

public class PessoaDAO {

	public static ArrayList<Pessoa> listaPessoas(){
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM PESSOA";
		ArrayList<Pessoa> arPessoas = new ArrayList();
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsPessoas = pStm.executeQuery();
			
			while(rsPessoas.next()) {
				Pessoa pes = new Pessoa(rsPessoas.getLong("id"), rsPessoas.getString("nome"), rsPessoas.getString("dt_nascimento"), rsPessoas.getString("sexo").charAt(0));
				arPessoas.add(pes);
			}
			cnn.close();
			rsPessoas.close();
			return arPessoas;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int cadastraPessoa(Pessoa pessoaSubmit) {
		String query = "INSERT INTO pessoa(nome, dt_nascimento, sexo) values (?, ?, ?)";
		Connection cnn = ConnectionFactory.getConnection();
		String sexo = Character.toString(pessoaSubmit.getSexo());
		int linhasAfetadas = 0;
		
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, pessoaSubmit.getNome());
			pStmt.setString(1, pessoaSubmit.getDtNascimento());
			pStmt.setString(1, sexo);
			linhasAfetadas = pStmt.executeUpdate();
			cnn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

	public static Pessoa getPessoaById(int id) {
		// TODO Auto-generated method stub
		Pessoa pessoaRetorno = new Pessoa();
		String query = "SELECT * FROM pessoa WHERE id = ?";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rsPessoa = pStmt.executeQuery();
			while (rsPessoa.next()) {
				pessoaRetorno.setId(id);
				pessoaRetorno.setNome(rsPessoa.getString("nome"));
				pessoaRetorno.setDtNascimento(rsPessoa.getString("dt_nascimento"));
				pessoaRetorno.setSexo(rsPessoa.getString("sexo").charAt(0));
			}
			rsPessoa.close();
			cnn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
}
