package br.com.projetoweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/usuario")
public class UsuarioController extends HttpServlet {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void listUsuarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Buscar dados do banco
		
		RequestDispatcher rd = request.getRequestDispatcher("listaUsuariosAction.jsp");
        rd.forward(request, response);
	}
	
	protected void cadUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Buscar dados do banco
		
		RequestDispatcher rd = request.getRequestDispatcher("cadUsuarioAction.jsp");
        rd.forward(request, response);
	}

}
