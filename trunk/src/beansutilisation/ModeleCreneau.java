package beansutilisation;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

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

public final class ModeleCreneau {

	private ModeleCreneau() {
		// TODO Auto-generated constructor stub
	}
	
	public static void creation(int idEns, String idSalle, int idEc, int typearg,
			int idPromo, String date, String horaire, String duree) {

		EnseignantDAO ensDAO = new EnseignantDAO();
		Enseignant ens = ensDAO.find(idEns);

		SalleDAO salleDAO = new SalleDAO();
		Salle salle = salleDAO.find(idSalle);

		ECDAO ecDAO = new ECDAO();
		EC ec = ecDAO.find(idEc);

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

//		try {
//			EnseignantEDT.TestEnseignant(newCreneaux, ens);
//			VerificationPromoSalle.verifSalle(newCreneaux, salle);
//			VerificationPromoSalle.verifPromo(newCreneaux, prom);
//			VerificationEC.verificationTempsEC(ec, type);
//		} catch (VerificationException e) {
//			e.printStackTrace();
//		}

		// cr�ation du cr�neau
		CreneauDAO creDao = new CreneauDAO();
		creDao.create(newCreneau);

//		// update de l'enseignant - PEUT ETRE A ENLEVER CAR PAS DE CHANGEMENT
//		// NORMALEMENT
//		ArrayList<Creneau> newCreneauxEns = new ArrayList<Creneau>();
//		newCreneauxEns.addAll(ens.getMesCreneaux());
//		newCreneauxEns.addAll(newCreneaux);
//		ens.setMesCreneaux(newCreneauxEns);
//		ensDAO.update(ens);
//
//		// update de la salle PEUT ETRE A ENLEVER CAR PAS DE CHANGEMENT
//		// NORMALEMENT
//		ArrayList<Creneau> newCreneauxsalle = new ArrayList<Creneau>();
//		newCreneauxsalle.addAll(salle.getMesCreneaux());
//		newCreneauxsalle.addAll(newCreneaux);
//		salle.setMesCreneaux(newCreneauxsalle);
//		salleDAO.update(salle);

	}

	public static void modification(int idEns, String idSalle, int idEc,
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

		ECDAO ecDAO = new ECDAO();
		EC ec = ecDAO.find(idEc);

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

		CreneauDAO creDao = new CreneauDAO();
		Creneau finded = creDao.find(ens.getNumeroEnseignant(), salle
				.getNumeroSalle(), ec.getNumeroEC(), ec.getMonUE()
				.getNumeroUE(), ec.getMonUE().getMaFormation()
				.getNumeroFormation(), type.getNumeroType(), gcDate);
		finded.setDuree(dureInt);

		ArrayList<Creneau> newCreneaux = new ArrayList<Creneau>();
		newCreneaux.add(finded);

//		try {
//			EnseignantEDT.TestEnseignant(newCreneaux, ens);
//			VerificationPromoSalle.verifSalle(newCreneaux, salle);
//			VerificationPromoSalle.verifPromo(newCreneaux, prom);
//			VerificationEC.verificationTempsEC(ec, type);
//		} catch (VerificationException e) {
//			e.printStackTrace();
//		}

		creDao.update(finded);
	}

	public static void suppression(int idEns, String idSalle, int idEc,
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

		ECDAO ecDAO = new ECDAO();
		EC ec = ecDAO.find(idEc);

		TypeDAO typeDAO = new TypeDAO();
		Type type = typeDAO.find(typearg);

		int d = Integer.parseInt(date.substring(0, 2));
		int m = Integer.parseInt(date.substring(3, 5));
		int y = Integer.parseInt(date.substring(6));
		GregorianCalendar gcDate = new GregorianCalendar(y, m-1, d);

		JoursDAO jourDAO = new JoursDAO();
		Jours jour = jourDAO.find(gcDate);

		// Creation d'un bean creneau selon les arguments re�us

		CreneauDAO creDao = new CreneauDAO();
		Creneau finded = creDao.find(ens.getNumeroEnseignant(), salle
				.getNumeroSalle(), ec.getNumeroEC(), ec.getMonUE()
				.getNumeroUE(), ec.getMonUE().getMaFormation()
				.getNumeroFormation(), type.getNumeroType(), gcDate);

		creDao.delete(finded);

	}

	public static Creneau getCreneau(int noEnseignant, String noSalle,
			int noEc, int noType,
			String date) {
		
		ECDAO.loadMesEC();
		
		int d = Integer.parseInt(date.substring(0, 2));
		int m = Integer.parseInt(date.substring(3, 5));
		int y = Integer.parseInt(date.substring(6));
		GregorianCalendar gcDate = new GregorianCalendar(y, m-1, d);
		
		ECDAO ecDAO = new ECDAO();
		EC ec = ecDAO.find(noEc);
		
		
		CreneauDAO creDao = new CreneauDAO();
		return creDao.find(noEnseignant, noSalle, noEc, ec.getMonUE().getNumeroUE(), ec.getMonUE().getMaFormation().getNumeroFormation(),
				noType, gcDate);

	}

	public static List<Enseignant> getAllEnseignants() {

		EnseignantDAO.loadMesEnseignants();
		EnseignantDAO daoEns = new EnseignantDAO();
		List<Enseignant> ens = (ArrayList<Enseignant>) daoEns.findAll();
		return ens;
	}

	public static List<Salle> getAllSalle() {
		SalleDAO.loadMesSalles();
		SalleDAO daoSalle = new SalleDAO();
		List<Salle> salles = (ArrayList<Salle>) daoSalle.findAll();
		return salles;
	}

	public static List<EC> getAllEC() {
		ECDAO.loadMesEC();
		ECDAO daoEc = new ECDAO();
		List<EC> ecs = (ArrayList<EC>) daoEc.findAll();
		return ecs;
	}

	public static List<Type> getAllTypes() {

		TypeDAO.loadMesTypes();

		TypeDAO daoType = new TypeDAO();
		List<Type> types = (ArrayList<Type>) daoType.findAll();
		return types;
	}

	public static List<Formation> getAllFormation() {
		FormationDAO.loadMesFormations();

		FormationDAO daoFormation = new FormationDAO();
		List<Formation> formations = (ArrayList<Formation>) daoFormation
				.findAll();
		return formations;
	}
}
