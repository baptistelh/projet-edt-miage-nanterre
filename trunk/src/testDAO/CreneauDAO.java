package testDAO;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import beans.*;

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

	public Creneau find(int no_enseignant, String no_salle, int no_ec,
			int no_ue, int no_formation, int no_type,
			GregorianCalendar date_creneau) {

		for (Creneau c : CreneauDAO.list)
			if (c.getMonEnseignant().getNumeroEnseignant() == no_enseignant
					&& c.getMaSalle().getNumeroSalle() == no_salle
					&& c.getMonEC().getNumeroEC() == no_ec
					&& c.getMonEC().getMonUE().getNumeroUE() == no_ue
					&& c.getMonEC().getMonUE().getMaFormation()
							.getNumeroFormation() == no_formation
					&& c.getMonType().getNumeroType() == no_type
					&& c.getDateCreneau().getDateDuJour().equals(date_creneau)) {
				return c;
			}

				return null;
	}

	public Creneau find(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
