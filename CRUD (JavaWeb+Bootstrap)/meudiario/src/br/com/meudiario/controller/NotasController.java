package br.com.meudiario.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import br.com.meudiario.beans.Nota;
import br.com.meudiario.model.NotasModel;

@WebServlet("/notas")
public class NotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		HttpSession session = request.getSession();

		if (session.getAttribute("usuarioLogado") != null && session.getAttribute("usuarioLogado").equals("1")) {
			request.setAttribute("usuarioName", session.getAttribute("login"));
			switch (action) {
			case "list":
				listAction(request, response);
				break;
			case "cad":
				cadAction(request, response);
				break;
			case "edit":
				editAction(request, response);
				break;
			case "del":
				delAction(request, response);
				break;
			case "ver":
				verAction(request, response);
				break;

			default:
				notFoundAction(request, response);
				break;
			}
		} else {
			response.sendRedirect("/meudiario");
		}
	}

	private void verAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = (request.getParameter("id") != null) ? Integer.parseInt(request.getParameter("id")) : 0;
		Nota nota = new Nota();

		if (id > 0) {
			nota = NotasModel.getNotaById(id);
		}
		
		request.setAttribute("nota", nota);
		RequestDispatcher rd = request.getRequestDispatcher("verNota.jsp");
		rd.forward(request, response);
	}

	private void delAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = (request.getParameter("id") != null) ? Integer.parseInt(request.getParameter("id")) : 0;
		int retorno;
		String textoResponse = "Ocorreu um Erro ao Apagar a Nota";

		if (id > 0) {
			retorno = NotasModel.delNota(id);
			if (retorno > 0) {
				textoResponse = "Nota Apagada com Sucesso!";
			}
		}

		request.setAttribute("mensagem", textoResponse);
		RequestDispatcher rd = request.getRequestDispatcher("pageSuccess.jsp");
		rd.forward(request, response);
	}

	private void editAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = (request.getParameter("id") != null) ? Integer.parseInt(request.getParameter("id")) : 0;
		Nota nota = new Nota();

		if (id > 0) {
			nota = NotasModel.getNotaById(id);
		}

		Gson gson = new Gson();
		response.getWriter().print(gson.toJson(nota));

	}

	private void cadAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("cadNotas.jsp");
		rd.forward(request, response);
	}

	private void listAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Nota> listaNotas = NotasModel.getListNotas();

		request.setAttribute("listaNotas", listaNotas);
		request.setAttribute("listSize", listaNotas.size());
		RequestDispatcher rd = request.getRequestDispatcher("listNotas.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd;
		String assunto = request.getParameter("assunto");
		String dtNota = request.getParameter("dt_notas");
		String texto = request.getParameter("texto");
		int id = (request.getParameter("id") != null) ? Integer.parseInt(request.getParameter("id")) : 0;
		int retorno = 0;

		try {

			if (id > 0) {
				retorno = NotasModel.editNota(id, assunto, dtNota, texto);
			} else {
				retorno = NotasModel.cadNota(assunto, dtNota, texto);
			}

			if (retorno > 0) {
				request.setAttribute("mensagem", "Registro Salvo Com Sucesso!");
				rd = request.getRequestDispatcher("pageSuccess.jsp");
			} else {
				request.setAttribute("mensagem", "Erro ao Salvar o Registro!");
				rd = request.getRequestDispatcher("pageError.jsp");
			}
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void notFoundAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Página Não Encontrada</h1>");
		out.println("</html></body>");
	}

}
