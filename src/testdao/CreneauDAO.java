package testdao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import beans.Creneau;
import beans.EC;
import beans.Enseignant;
import beans.Formation;
import beans.Jours;
import beans.Salle;
import beans.Type;
import beans.UE;

public class CreneauDAO {

	private static List<Creneau> list = new ArrayList<Creneau>();

	public List<Creneau> findAll() {
		return CreneauDAO.list;
	}

	public Creneau create(Creneau obj) {
		CreneauDAO.list.add(obj);
		return obj;
	}

	public Creneau update(Creneau obj) {
		delete(obj);
		create(obj);
		return obj;
	}

	public void delete(Creneau obj) {
		CreneauDAO.list.remove(obj);
	}

	public Creneau find(int noEnseignant, String noSalle, int noEc,
			int noUe, int noFormation, int noType,
			GregorianCalendar dateCreneau) {

		for (Creneau c : CreneauDAO.list) {
			if (c.getMonEnseignant().getNumeroEnseignant() == noEnseignant
					&& c.getMaSalle().getNumeroSalle() == noSalle
					&& c.getMonEC().getNumeroEC() == noEc
					&& c.getMonEC().getMonUE().getNumeroUE() == noUe
					&& c.getMonEC().getMonUE().getMaFormation()
							.getNumeroFormation() == noFormation
					&& c.getMonType().getNumeroType() == noType
					&& c.getDateCreneau().getDateDuJour().equals(dateCreneau)) {
				return c;
			}
		}

				return null;
	}

	public Creneau find(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void loadMesCreneaux(){
		Enseignant e = new Enseignant(2709,"profNom", "profPrenom","avenue du test","0143855906", new GregorianCalendar(2000,9, 15), "profLog", "profPwd");
		Salle s1=new Salle("210A", 50, "enferNum1");
		Formation f1=new Formation();
		UE ue1=new UE(1,f1);
		EC ec1= new EC(1, ue1);
		Type type1 = new Type(1, "TD"); 
		Jours j1 = new Jours(new GregorianCalendar(2012, 05, 29));
		list.add(new Creneau (e,s1,ec1,type1,j1,"08:30",120));

	}

}
