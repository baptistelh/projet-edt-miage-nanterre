package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerPrincipal extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {    
		doAction(req,res);
	}
	
	public void doAction(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {   
		String action = req.getParameter("action");
		
		if(action.equals("ajouterCreneau")){
			req.getParameter("");
			//creation(int idEns, int idSalle, int idEc, int typearg,int idPromo, String date, String horaire, String duree)
		} else 
			if(action.equals("supprimerCreneau")){
				
			} else 
				if(action.equals("MAJCreneau")){
					
				}
	}
}
