package br.com.projetoweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.model.PessoaModel;

/**
 * Servlet implementation class PessoaController
 */
@WebServlet("/pessoa")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PessoaModel pessoaModel = new PessoaModel();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		switch (request.getParameter("action")) {
		case "listPessoas":
			listaPessoasAction(request, response);
			break;
		case "cadPessoa":
			cadPessoaAction(request, response);
			break;
		case "verPessoa":
			verPessoaAction(request, response);

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		String dataNascimento = request.getParameter("dataNascimento");
		String sexo = request.getParameter("sexo");
		
		Pessoa pessoaSubmit = new Pessoa();
		pessoaSubmit.setNome(nome);
		pessoaSubmit.setDtNascimento(dataNascimento);
		pessoaSubmit.setSexo(sexo.charAt(0));
		
		int retorno = PessoaModel.cadastraPessoa(pessoaSubmit);
		PrintWriter out = response.getWriter();
		
		if (retorno > 0) {
			out.println("<body>");
			out.println("<b>Pessoa de nome: " + nome + " foi cadastrada com sucesso!</b>");
			out.println("<a href='pessoa?action=      'widow.history.back();'>Voltar</a>");
			out.println("</body>");
		}else {
			
		}
		
		

	}

	protected void listaPessoasAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Buscar dados do banco
		ArrayList<Pessoa> objListaPessoa = new ArrayList<Pessoa>();
		objListaPessoa = pessoaModel.listaPessoas();

		request.setAttribute("listaPessoas", objListaPessoa);
		RequestDispatcher rd = request.getRequestDispatcher("listaPessoasAction.jsp");
		rd.forward(request, response);
	}

	protected void cadPessoaAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Buscar dados do banco

		RequestDispatcher rd = request.getRequestDispatcher("cadPessoaAction.jsp");
		rd.forward(request, response);
	}

	private void verPessoaAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Pessoa pessoa = pessoaModel.getPessoaById(id);
		
		request.setAttribute("objPessoa", pessoa);
		RequestDispatcher rd = request.getRequestDispatcher("cadPessoaAction.jsp");
		rd.forward(request, response);
	}
	
	private void delPessoaAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Pessoa pessoa = pessoaModel.getPessoaById(id);
		
		request.setAttribute("objPessoa", pessoa);
		RequestDispatcher rd = request.getRequestDispatcher("delPessoaAction.jsp");
		rd.forward(request, response);
	}
	
	private void editPessoaAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Pessoa pessoa = pessoaModel.getPessoaById(id);
		
		request.setAttribute("objPessoa", pessoa);
		RequestDispatcher rd = request.getRequestDispatcher("editPessoaAction.jsp");
		rd.forward(request, response);
	}
	
	
	
	
	

}
