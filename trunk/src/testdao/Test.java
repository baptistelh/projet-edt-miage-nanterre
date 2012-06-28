package testdao;
import beans.*;

public final class Test {
	
	private Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// Instanciation du DAO de la salle
		SalleDAO.loadMesSalles();
		ECDAO.loadMesEC();
		FormationDAO.loadMesFormations();
		TypeDAO.loadMesTypes();
		EnseignantDAO.loadMesEnseignants();
		
		EnseignantDAO ed = new EnseignantDAO();
		
		for(Enseignant e : ed.findAll()) {
			System.out.println(e.getPrenom()+" "+e.getNom());

		}
		
		ECDAO ecd = new ECDAO();
		for(EC ec : ecd.findAll()) {
			System.out.println(ec.getLibelle());
		}
	}
}