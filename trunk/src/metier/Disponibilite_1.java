package metier;
{
public class Disponibilite_1 {
    private int poids;
    private int DemiJournee;
	
    public Disponibilite_1() {
	}

	public Disponibilite_1(int poids, int demiJournee) {
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
