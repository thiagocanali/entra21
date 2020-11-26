package br.com.series.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.series.bean.Serie;
import br.com.series.model.SeriesModel;

/**
 * Servlet implementation class SeriesController
 */
@WebServlet("/")
public class SeriesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = (null == request.getParameter("action")) ? "" : request.getParameter("action");
		
		switch (action) {
		case "list":
			listAction(request, response);
			break;

		default:
			listAction(request, response);
			break;
		}
		
	}

	private void listAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Serie> listSeries = SeriesModel.getListSeries();
		
		RequestDispatcher rd = request.getRequestDispatcher("listSeries.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
