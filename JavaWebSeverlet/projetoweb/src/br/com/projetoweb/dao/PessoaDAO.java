package br.com.projetoweb.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.cnn.ConnectionFactory;

public class PessoaDAO {

	public static ArrayList<Pessoa> listaPessoas() {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "select * from pessoa";
		ArrayList<Pessoa> arPessoas = new ArrayList();

		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsPessoas = pStm.executeQuery();

			while (rsPessoas.next()) {
				Pessoa pes = new Pessoa(rsPessoas.getLong("id"), rsPessoas.getString("nome"),
						rsPessoas.getString("dt_nascimento"), rsPessoas.getString("cpf"),
						rsPessoas.getString("sexo").charAt(0));
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
	
	public static int cadastrarPessoa(Pessoa objPessoa) {
		
		return 1;
	}

	public static Pessoa getPessoaById(int id) {
		Pessoa pessoaRetorno = new Pessoa();
		String query = "SELECT * FROM pessoa WHERE id = ?";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, id);
			
			ResultSet rsPessoa = pStmt.executeQuery();
			while(rsPessoa.next()) {
				pessoaRetorno.setId(id);
				pessoaRetorno.setNome(rsPessoa.getString("nome"));
				pessoaRetorno.setDtNascimento(rsPessoa.getString("dt_nascimento"));
				pessoaRetorno.setSexo(rsPessoa.getString("sexo").charAt(0));
			}
			rsPessoa.close();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoaRetorno;
	}

	public static int cadastraPessoa(Pessoa pessoaSubmit) {
		String query = "INSERT INTO pessoa(nome, dt_nascimento, sexo) values (?, ?, ?)";
		Connection cnn = ConnectionFactory.getConnection();
		String sexo = Character.toString(pessoaSubmit.getSexo());
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, pessoaSubmit.getNome());
			pStmt.setString(2, pessoaSubmit.getDtNascimento());
			pStmt.setString(3, sexo);
			linhasAfetadas = pStmt.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

	public static int updatePessoa(Pessoa pessoaSubmit) {
		String query = "UPDATE pessoa SET nome = ?, dt_nascimento = ? WHERE id= ?";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, pessoaSubmit.getNome());
			pStmt.setString(2, pessoaSubmit.getDtNascimento());
			pStmt.setLong(3, pessoaSubmit.getId());
			linhasAfetadas = pStmt.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

	public static int delPessoa(int id) {
		String query = "DELETE FROM pessoa WHERE id= ?";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, id);
			linhasAfetadas = pStmt.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
}
