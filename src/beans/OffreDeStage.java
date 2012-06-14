
public class OffreDeStage {
    private int NumeroOffreDeStage;
    private String DescriptionPoste;
    private String EtatOffre;
	
    public OffreDeStage() {
	}
	
    public OffreDeStage(int numeroOffreDeStage, String descriptionPoste,
			String etatOffre) {
		NumeroOffreDeStage = numeroOffreDeStage;
		DescriptionPoste = descriptionPoste;
		EtatOffre = etatOffre;
	}
	
    public int getNumeroOffreDeStage() {
		return NumeroOffreDeStage;
	}
	
    public void setNumeroOffreDeStage(int numeroOffreDeStage) {
		NumeroOffreDeStage = numeroOffreDeStage;
	}
	
    public String getDescriptionPoste() {
		return DescriptionPoste;
	}
	
    public void setDescriptionPoste(String descriptionPoste) {
		DescriptionPoste = descriptionPoste;
	}
	
    public String getEtatOffre() {
		return EtatOffre;
	}
	
    public void setEtatOffre(String etatOffre) {
		EtatOffre = etatOffre;
	}
}
