package br.com.projetofilmes.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetofilmes.beans.Filme;
import br.com.projetofilmes.models.FilmeModel;

/**
 * Servlet implementation class FilmeController
 */
@WebServlet("/filme")
public class FilmeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmeModel filmeModel = new FilmeModel();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch (request.getParameter("action")) {
		case "listaFilmes":
			listaFilmesAction(request, response);
			break;

		case "cadFilme":
			cadFilmeAction(request, response);
			break;

		case "verFilme":
			verFilmeAction(request, response);
			break;

		case "editFilme":
			editFilmeAction(request, response);
			break;

		case "delFilme":
			delFilmeAction(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		Integer id = 0;
		int classificacao = Integer.parseInt(request.getParameter("classificacao"));
		String genero = request.getParameter("genero");
		if (request.getParameter("id") != null) {
			id = Integer.parseInt(request.getParameter("id"));
		}
		
		int retorno = 0;
		Filme filmeSubmit = new Filme();
		filmeSubmit.setTitulo(titulo);
		filmeSubmit.setClassificacao(classificacao);
		filmeSubmit.setGenero(genero);
		if (id > 0) {
			filmeSubmit.setId(id);
			retorno = FilmeModel.UpdateFilme(filmeSubmit);
		} else {
			retorno = FilmeModel.cadastraFilme(filmeSubmit);
		}

		PrintWriter out = response.getWriter();
		if (retorno > 0) {
			out.println("<body>");
			out.println("<b>Filme " + titulo + " Criado/Alterado com Sucesso!</b>");
			out.println("<a href='filme?action=listaFilmes'>Voltar</a>");
			out.println("</body>");
		} else {
			out.println("<body>");
			out.println("<b>Ocorreu um erro, não foi possível alterar/Cadastrar o filme!</b>");
			out.println("<a href='filme?action=listaFilmes'>Voltar</a>");
			out.println("</body>");
		}
	}

	protected void listaFilmesAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(filmeModel.listaFilmes().get(0).getTitulo());
		List<Filme> objListaFilme = new ArrayList<Filme>();
		objListaFilme = filmeModel.listaFilmes();
		request.setAttribute("listaFilmes", objListaFilme);
		RequestDispatcher rd = request.getRequestDispatcher("listaFilmesAction.jsp");
		rd.forward(request, response);
	}

	protected void cadFilmeAction(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("cadFilmeAction.jsp");
		rd.forward(request, response);
	}

	protected void verFilmeAction(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Filme filme = filmeModel.getFilmeByID(id);
		request.setAttribute("objFilme", filme);
		RequestDispatcher rd = request.getRequestDispatcher("verFilmeAction.jsp");
		rd.forward(request, response);
	}

	private void delFilmeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		if (FilmeModel.delFilme(id) > 0) {
			response.getWriter().print("OK");
		} else {
			response.getWriter().print("ERRO");
		}
	}

	private void editFilmeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Filme filme = filmeModel.getFilmeByID(id);
		request.setAttribute("objFilme", filme);
		RequestDispatcher rd = request.getRequestDispatcher("editFilmeAction.jsp");
		rd.forward(request, response);
	}
}
