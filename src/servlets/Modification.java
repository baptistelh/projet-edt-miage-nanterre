package servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import testdao.EnseignantDAO;

import beans.*;

public class Modification extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nom=request.getParameter("enseignant");
		
		// connection a la base de données
		String login="";
		String password="";
		String url="";
//		Connection connection = ODBC_onur.getConnectiontoDB(login, password, url);
		
		EnseignantDAO ed = new EnseignantDAO();
		
		//1 = id de l'enseignant
		Enseignant ens= ed.find(1);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// Nous invoquons la méthode doGet avec les paramètres reçu par la
		// méthode doPost
		doGet(request, response);
	}
}
