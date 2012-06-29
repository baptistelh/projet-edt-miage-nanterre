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
		String action =(String) req.getParameter("action");
		
		String nomEnseignant = "nom_enseignant";
		String salle = "salle";
		String type = "type";
		String d = "date";
		
		if(action == null) {
			req.getRequestDispatcher("jsp/index.jsp").forward(req, res);
		}

		if(action.equals("Creation de creneau")){
			envoyerListesJsp(req);			
			req.getRequestDispatcher("jsp/creation.jsp").forward(req, res);
		} else
			if(action.equals("Afficher le calendrier")){
				req.getRequestDispatcher("index.html").forward(req, res);
			}
			if(action.equals("Modification de Creneau")){
				envoyerListesJsp(req);				
				req.getRequestDispatcher("jsp/modification.jsp").forward(req, res);
			} else
				if(action.equals("pageModificationSelectionCreneau")){
					envoyerListesJsp(req);
					
					Integer idEnseignant  = Integer.parseInt(req.getParameter(nomEnseignant));
					String idSalle        = req.getParameter(salle);
					Integer idEc          = Integer.parseInt(req.getParameter("EC"));
					Integer idType        = Integer.parseInt(req.getParameter(type));
					String date           = req.getParameter(d);
					
					req.setAttribute("monCreneau", ModeleCreneau.getCreneau(idEnseignant, idSalle, idEc, idType, date));
					
					req.getRequestDispatcher("jsp/modificationSelection.jsp").forward(req, res);
				} else
					if(action.equals("Suppression de Creneau")){
						envoyerListesJsp(req);						
						req.getRequestDispatcher("jsp/suppression.jsp").forward(req, res);
					} else
						if(action.equals("ajouterCreneau")){
							Integer idEnseignant  = Integer.parseInt(req.getParameter(nomEnseignant));
							String idSalle       = req.getParameter(salle);
							Integer idEc          = Integer.parseInt(req.getParameter("EC"));
							Integer idType        = Integer.parseInt(req.getParameter(type));
							Integer idPromo       = 1;
							String date           = req.getParameter(d);
							String horaire        = req.getParameter("horaire");
							int duree          = Integer.parseInt(req.getParameter("duree"));
							
							if (ModeleCreneau.creation(idEnseignant, idSalle, idEc, idType, idPromo, date, horaire, duree))
								req.getRequestDispatcher("jsp/actionReussie.jsp").forward(req, res);
							else
								req.getRequestDispatcher("jsp/actionEchouee.jsp").forward(req, res);
						} else 
							if(action.equals("supprimerCreneau")){
								Integer idEnseignant  = Integer.parseInt(req.getParameter(nomEnseignant));
								String idSalle       = req.getParameter(salle);
								Integer idEc          = Integer.parseInt(req.getParameter("EC"));
								Integer idType        = Integer.parseInt(req.getParameter(type));
								String date           = req.getParameter(d);
								
								if(ModeleCreneau.suppression(idEnseignant, idSalle, idEc, idType, date))
									req.getRequestDispatcher("jsp/actionReussie.jsp").forward(req, res);
								else
									req.getRequestDispatcher("jsp/actionEchouee.jsp").forward(req, res);
								
							} else 
								if(action.equals("MAJCreneau")){
									Integer idEnseignant  = Integer.parseInt(req.getParameter(nomEnseignant));
									String idSalle       = req.getParameter(salle);
									Integer idEc          = Integer.parseInt(req.getParameter("EC"));
									Integer idType        = Integer.parseInt(req.getParameter(type));
									Integer idPromo       = 1;
									String date           = req.getParameter(d);
									String horaire        = req.getParameter("horaire");
									int duree          = Integer.parseInt(req.getParameter("duree"));
									
									if(ModeleCreneau.modification(idEnseignant, idSalle, idEc, idType, idPromo, date, horaire, duree))
										req.getRequestDispatcher("jsp/actionReussie.jsp").forward(req, res);
									else
										req.getRequestDispatcher("jsp/actionEchouee.jsp").forward(req, res);
								} 
	}
	
	public void envoyerListesJsp(HttpServletRequest req){
		req.setAttribute("listEnseignants", ModeleCreneau.getAllEnseignants());
		req.setAttribute("listEC", ModeleCreneau.getAllEC());
		req.setAttribute("listSalles", ModeleCreneau.getAllSalle());
		req.setAttribute("listFormations", ModeleCreneau.getAllFormation());
		req.setAttribute("listTypes", ModeleCreneau.getAllTypes());
	}
}
