package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beansutilisation.ModeleCreneau;

public class ControllerPrincipal extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 224621653755442533L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {    
		doGet(req,res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {   
		String action = req.getParameter("action");

		if(action.equals("pageCreationCreneau")){
			req.setAttribute("listEnseignants", ModeleCreneau.getAllEnseignants());
			req.setAttribute("listEC", ModeleCreneau.getAllEC());
			req.setAttribute("listSalles", ModeleCreneau.getAllSalle());
			req.setAttribute("listFormations", ModeleCreneau.getAllFormation());
			req.setAttribute("listTypes", ModeleCreneau.getAllTypes());
			
			req.getRequestDispatcher("creation.jsp").forward(req, res);
		} else
			if(action.equals("pageModificationCreneau")){
				req.setAttribute("listEnseignants", ModeleCreneau.getAllEnseignants());
				req.setAttribute("listEC", ModeleCreneau.getAllEC());
				req.setAttribute("listSalles", ModeleCreneau.getAllSalle());
				req.setAttribute("listFormations", ModeleCreneau.getAllFormation());
				req.setAttribute("listTypes", ModeleCreneau.getAllTypes());
				
				req.getRequestDispatcher("modification.jsp").forward(req, res);
			} else
				if(action.equals("pageModificationSelectionCreneau")){
					req.setAttribute("listEnseignants", ModeleCreneau.getAllEnseignants());
					req.setAttribute("listEC", ModeleCreneau.getAllEC());
					req.setAttribute("listSalles", ModeleCreneau.getAllSalle());
					req.setAttribute("listFormations", ModeleCreneau.getAllFormation());
					req.setAttribute("listTypes", ModeleCreneau.getAllTypes());
					
					req.getRequestDispatcher("modificationSelection.jsp").forward(req, res);
				} else
					if(action.equals("pageSuppressionCreneau")){
						req.setAttribute("listEnseignants", ModeleCreneau.getAllEnseignants());
						req.setAttribute("listEC", ModeleCreneau.getAllEC());
						req.setAttribute("listSalles", ModeleCreneau.getAllSalle());
						req.setAttribute("listFormations", ModeleCreneau.getAllFormation());
						req.setAttribute("listTypes", ModeleCreneau.getAllTypes());
						
						req.getRequestDispatcher("suppression.jsp").forward(req, res);
					} else
						if(action.equals("ajouterCreneau")){
							Integer idEnseignant  = Integer.parseInt(req.getParameter("nom_enseignant"));
							Integer idSalle       = Integer.parseInt(req.getParameter("salle"));
							Integer idEc          = Integer.parseInt(req.getParameter("EC"));
							Integer idType        = Integer.parseInt(req.getParameter("type"));
							Integer idPromo       = Integer.parseInt(req.getParameter("promo"));
							String date           = req.getParameter("date");
							String horaire        = req.getParameter("horaire");
							String duree          = req.getParameter("duree");
							
							ModeleCreneau.creation(idEnseignant, idSalle, idEc, idType, idPromo, date, horaire, duree);
						} else 
							if(action.equals("supprimerCreneau")){
								Integer idEnseignant  = Integer.parseInt(req.getParameter("nom_enseignant"));
								Integer idSalle       = Integer.parseInt(req.getParameter("salle"));
								Integer idEc          = Integer.parseInt(req.getParameter("EC"));
								Integer idType        = Integer.parseInt(req.getParameter("type"));
								String date           = req.getParameter("date");
								String horaire        = req.getParameter("horaire");
								String duree          = req.getParameter("duree");
								
								ModeleCreneau.suppression(idEnseignant, idSalle, idEc, idType, date);
							} else 
								if(action.equals("MAJCreneau")){
									Integer idEnseignant  = Integer.parseInt(req.getParameter("nom_enseignant"));
									Integer idSalle       = Integer.parseInt(req.getParameter("salle"));
									Integer idEc          = Integer.parseInt(req.getParameter("EC"));
									Integer idType        = Integer.parseInt(req.getParameter("type"));
									Integer idPromo       = Integer.parseInt(req.getParameter("promo"));
									String date           = req.getParameter("date");
									String horaire        = req.getParameter("horaire");
									String duree          = req.getParameter("duree");
									
									ModeleCreneau.modification(idEnseignant, idSalle, idEc, idType, idPromo, date, horaire, duree);
								}
	}
}
