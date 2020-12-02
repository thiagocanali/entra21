package br.com.socialbook.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.socialbook.beans.Usuario;
import br.com.socialbook.model.UsuarioModel;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if("login".equals(action)) {
			loginAction(request,response);
		} else {
			logoutAction(request, response);
		}
	}

	private void logoutAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("usuarioLogado", null);
		session.setAttribute("nome", null);
		session.setAttribute("login", null);
		response.sendRedirect("/");
	}

	private void loginAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Usuario usuario = UsuarioModel.getLogin(login, senha);
		
		if(usuario != null) {
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogado", "1");
			session.setAttribute("nome", usuario.getNome());
			session.setAttribute("login", usuario.getLogin());
			response.sendRedirect("social");
		} else {
			response.sendRedirect("/");
		}
	}

}