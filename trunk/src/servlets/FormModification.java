package servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import beansUtilisation.ODBC_onur;
import beans.*;

public class FormModification extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nom=request.getParameter("enseignant");
		
		// connection a la base de donn�es
		String login="";
		String password="";
		String url="";
		Connection connection = ODBC_onur.getConnectiontoDB(login, password, url);
		
		Enseignant ens= ODBC_onur.getEnseignant(connection, nom);
		
		
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// Nous invoquons la m�thode doGet avec les param�tres re�u par la
		// m�thode doPost
		doGet(request, response);
	}
}
