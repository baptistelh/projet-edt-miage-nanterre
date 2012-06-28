package beansutilisation;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import beans.Creneau;
import beans.EC;
import beans.Enseignant;
import beans.Formation;
import beans.Jours;
import beans.Promotion;
import beans.Salle;
import beans.Type;
/*import dao.CreneauDAO;
 import dao.DAO;
 import dao.ECDAO;
 import dao.EnseignantDAO;
 import dao.FormationDAO;
 import dao.JoursDAO;
 import dao.PromotionDAO;
 import dao.SalleDAO;
 import dao.TypeDAO;
 */
import testdao.*;

public class ModeleCreneau {

	public static boolean creation(int idEns, String idSalle, int idEc, int typearg,
			int idPromo, String date, String horaire, String duree) {

		// utilisation des bouchons pour les DAO
		SalleDAO.loadMesSalles();
		ECDAO.loadMesEC();
		FormationDAO.loadMesFormations();
		TypeDAO.loadMesTypes();
		EnseignantDAO.loadMesEnseignants();

		EnseignantDAO ensDAO = new EnseignantDAO();
		Enseignant ens = ensDAO.find(idEns);

		SalleDAO salleDAO = new SalleDAO();
		Salle salle = salleDAO.find(idSalle);

		ECDAO EcDAO = new ECDAO();
		EC ec = EcDAO.find(idEc);

		TypeDAO typeDAO = new TypeDAO();
		Type type = typeDAO.find(typearg);

		PromotionDAO promDAO = new PromotionDAO();
		Promotion prom = promDAO.find(idPromo);

		int d = Integer.parseInt(date.substring(0, 2));
		int m = Integer.parseInt(date.substring(3, 5));
		int y = Integer.parseInt(date.substring(6));
		GregorianCalendar gcDate = new GregorianCalendar(y, m-1, d);

		JoursDAO jourDAO = new JoursDAO();
		Jours jour = jourDAO.find(gcDate);

		int dureInt = Integer.parseInt(duree);

		// Creation d'un bean creneau selon les arguments re�us
		Creneau newCreneau = new Creneau(ens, salle, ec, type, jour, horaire,
				dureInt);
		ArrayList<Creneau> newCreneaux = new ArrayList<Creneau>();
		newCreneaux.add(newCreneau);

		try {
			EnseignantEDT.TestEnseignant(newCreneaux, ens);
			VerificationPromoSalle.verifSalle(newCreneaux, salle);
			VerificationPromoSalle.verifPromo(newCreneaux, prom);
			VerificationEC.verificationTempsEC(ec, type);
		} catch (VerificationException e) {
			System.err.println(e.getMessage());
			return false;
		}

		// cr�ation du cr�neau
		CreneauDAO creDao = new CreneauDAO();
		creDao.create(newCreneau);

		// update de l'enseignant - PEUT ETRE A ENLEVER CAR PAS DE CHANGEMENT
		// NORMALEMENT
		ArrayList<Creneau> newCreneauxEns = new ArrayList<Creneau>();
		newCreneauxEns.addAll(ens.getMesCreneaux());
		newCreneauxEns.addAll(newCreneaux);
		ens.setMesCreneaux(newCreneauxEns);
		ensDAO.update(ens);

		// update de la salle PEUT ETRE A ENLEVER CAR PAS DE CHANGEMENT
		// NORMALEMENT
		ArrayList<Creneau> newCreneauxsalle = new ArrayList<Creneau>();
		newCreneauxsalle.addAll(salle.getMesCreneaux());
		newCreneauxsalle.addAll(newCreneaux);
		salle.setMesCreneaux(newCreneauxsalle);
		salleDAO.update(salle);
		return true;

	}

	public static boolean modification(int idEns, String idSalle, int idEc,
			int typearg, int idPromo, String date, String horaire, String duree) {
		// utilisation des bouchons pour les DAO - Y A CEUX QUI GERENT ET CEUX
		// QUI GERENT PAS. NOUS, ON GERE!
		SalleDAO.loadMesSalles();
		ECDAO.loadMesEC();
		FormationDAO.loadMesFormations();
		TypeDAO.loadMesTypes();
		EnseignantDAO.loadMesEnseignants();

		EnseignantDAO ensDAO = new EnseignantDAO();
		Enseignant ens = ensDAO.find(idEns);

		SalleDAO salleDAO = new SalleDAO();
		Salle salle = salleDAO.find(idSalle);

		ECDAO EcDAO = new ECDAO();
		EC ec = EcDAO.find(idEc);

		TypeDAO typeDAO = new TypeDAO();
		Type type = typeDAO.find(typearg);

		PromotionDAO promDAO = new PromotionDAO();
		Promotion prom = promDAO.find(idPromo);

		int d = Integer.parseInt(date.substring(0, 2));
		int m = Integer.parseInt(date.substring(3, 5));
		int y = Integer.parseInt(date.substring(6));
		GregorianCalendar gcDate = new GregorianCalendar(y, m-1, d);

		int dureInt = Integer.parseInt(duree);

		// Creation d'un bean creneau selon les arguments re�us

		CreneauDAO creDao = new CreneauDAO();
		Creneau finded = creDao.find(ens.getNumeroEnseignant(), salle
				.getNumeroSalle(), ec.getNumeroEC(), ec.getMonUE()
				.getNumeroUE(), ec.getMonUE().getMaFormation()
				.getNumeroFormation(), type.getNumeroType(), gcDate);
		finded.setDuree(dureInt);
		
		ArrayList<Creneau> newCreneaux = new ArrayList<Creneau>();
		newCreneaux.add(finded);

		try {
			EnseignantEDT.TestEnseignant(newCreneaux, ens);
			VerificationPromoSalle.verifSalle(newCreneaux, salle);
			VerificationPromoSalle.verifPromo(newCreneaux, prom);
			VerificationEC.verificationTempsEC(ec, type);
		} catch (VerificationException e) {
			System.err.println(e.getMessage());
			return false;
		}
		creDao.update(finded);
		return true;
	}

	public static boolean suppression(int idEns, String idSalle, int idEc,
			int typearg, String date) {
		
		// utilisation des bouchons pour les DAO
		SalleDAO.loadMesSalles();
		ECDAO.loadMesEC();
		FormationDAO.loadMesFormations();
		TypeDAO.loadMesTypes();
		EnseignantDAO.loadMesEnseignants();

		EnseignantDAO ensDAO = new EnseignantDAO();
		Enseignant ens = ensDAO.find(idEns);

		SalleDAO salleDAO = new SalleDAO();
		Salle salle = salleDAO.find(idSalle);

		ECDAO EcDAO = new ECDAO();
		EC ec = EcDAO.find(idEc);

		TypeDAO typeDAO = new TypeDAO();
		Type type = typeDAO.find(typearg);



		int d = Integer.parseInt(date.substring(0, 2));
		int m = Integer.parseInt(date.substring(3, 5));
		int y = Integer.parseInt(date.substring(6));
		GregorianCalendar gcDate = new GregorianCalendar(y, m-1, d);

		// Creation d'un bean creneau selon les arguments re�us

		CreneauDAO creDao = new CreneauDAO();
		Creneau finded = creDao.find(ens.getNumeroEnseignant(), salle
				.getNumeroSalle(), ec.getNumeroEC(), ec.getMonUE()
				.getNumeroUE(), ec.getMonUE().getMaFormation()
				.getNumeroFormation(), type.getNumeroType(), gcDate);
		
		 creDao.delete(finded);
		 return true;
	}
	
	public static Creneau getCreneau(int noEnseignant, String noSalle,
			int noEc, int noType,
			String date) {
		
		ECDAO.loadMesEC();
		
		int d = Integer.parseInt(date.substring(0, 2));
		int m = Integer.parseInt(date.substring(3, 5));
		int y = Integer.parseInt(date.substring(6));
		GregorianCalendar gcDate = new GregorianCalendar(y, m-1, d);
		
		ECDAO EcDAO = new ECDAO();
		EC ec = EcDAO.find(noEc);
		
		
		CreneauDAO creDao = new CreneauDAO();
		return creDao.find(noEnseignant, noSalle, noEc, ec.getMonUE().getNumeroUE(), ec.getMonUE().getMaFormation().getNumeroFormation(),
				noType, gcDate);

	}

	public static ArrayList<Enseignant> getAllEnseignants() {

		EnseignantDAO DAOens = new EnseignantDAO();
		ArrayList<Enseignant> ens = (ArrayList<Enseignant>) DAOens.findAll();
		return ens;
	}

	public static ArrayList<Salle> getAllSalle() {

		SalleDAO DAOsalle = new SalleDAO();
		ArrayList<Salle> salles = (ArrayList<Salle>) DAOsalle.findAll();
		return salles;
	}

	public static ArrayList<EC> getAllEC() {

		ECDAO DAOEC = new ECDAO();
		ArrayList<EC> ecs = (ArrayList<EC>) DAOEC.findAll();
		return ecs;
	}

	public static ArrayList<Type> getAllTypes() {
		TypeDAO DAOType = new TypeDAO();
		ArrayList<Type> types = (ArrayList<Type>) DAOType.findAll();
		return types;
	}

	public static ArrayList<Formation> getAllFormation() {
		FormationDAO DAOFormation = new FormationDAO();
		ArrayList<Formation> formations = (ArrayList<Formation>) DAOFormation
				.findAll();
		return formations;
	}
}
