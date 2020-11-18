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
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		switch (request.getParameter("action")) {
		case "listUsuarios":
			listUsuarios(request, response);
			break;
		case "cadUsuarios":
			cadUsuario(request, response);
			break;

		default:
			break;
		}

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
		
		RequestDispatcher rd = request.getRequestDispatcher("listUsuarios.jsp");
        rd.forward(request, response);
	}
	
	protected void cadUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Buscar dados do banco
		
		RequestDispatcher rd = request.getRequestDispatcher("cadUsuario.jsp");
        rd.forward(request, response);
	}
	
	
	

}
