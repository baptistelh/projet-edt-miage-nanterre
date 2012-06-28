package testdao;

public class Test {
	
	public static void main(String[] args) {
		//Instanciation du DAO de la salle
			EnseignantDAO.loadMesEnseignants();
			SalleDAO.loadMesSalles();
			ECDAO.loadMesEC();
			FormationDAO.loadMesFormations();
			TypeDAO.loadMesFormations();
	}
}