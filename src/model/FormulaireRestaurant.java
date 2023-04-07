package model;

public class FormulaireRestaurant extends Formulaire {
	private int nb_gens;
	private int num_service;
	
	public FormulaireRestaurant(int jour, int mois, int nb_gens, int num_service) {
		super(jour,mois);
		this.nb_gens = nb_gens;
		this.num_service = num_service;
	}
	
	public int getNumService() {
		return num_service;
	}
	
	public int getNombrePersonnes() {
		return nb_gens;
	}
	
	public int getIdentificationEntite() {
		return entiteRes;
	}
	
	public void setIdentificationEntite(int entiteRes) {
		this.entiteRes = entiteRes;
	}
}
