package br.com.meudiario.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("/meudiario");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
	
		if("ramon".equals(login) && "senha".equals(senha)) {
			HttpSession session = request.getSession();
			session.setAttribute("login", login);
			session.setAttribute("usuarioLogado", "1");
			response.sendRedirect("/meudiario/notas?action=list");
		} else {
			response.sendRedirect("/meudiario");
		}
	}

}
