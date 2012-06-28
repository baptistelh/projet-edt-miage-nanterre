package testdao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import beans.Creneau;

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

}
