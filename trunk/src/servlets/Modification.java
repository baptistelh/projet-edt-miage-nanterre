package servlets;


import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import testdao.EnseignantDAO;

import beans.*;

public class Modification extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("text/html");
		response.getWriter();
		request.getParameter("enseignant");
		
		// connection a la base de donn�es
//		String login="";
//		String password="";
//		String url="";
//		Connection connection = ODBC_onur.getConnectiontoDB(login, password, url);
		
		EnseignantDAO ed = new EnseignantDAO();
		
		//1 = id de l'enseignant
		Enseignant ens= ed.find(1);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// Nous invoquons la m�thode doGet avec les param�tres re�u par la
		// m�thode doPost
		doGet(request, response);
	}
}
