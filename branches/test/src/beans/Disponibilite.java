package beans;
public class Disponibilite {
    private int poids;
    private int DemiJournee;
	
    public Disponibilite() {
	}

	public Disponibilite(int poids, int demiJournee) {
		this.poids = poids;
		DemiJournee = demiJournee;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getDemiJournee() {
		return DemiJournee;
	}

	public void setDemiJournee(int demiJournee) {
		DemiJournee = demiJournee;
	}
}
