package model;

public class CentraleDeRes <E extends EntiteReservable<F>,F extends Formulaire>{
	private EntiteReservable<F>[] tab_entite;
	private int nb_entite = 0;
	
	private int ajouterEntite(EntiteReservable<F> entite) {
		tab_entite[nb_entite] = entite;
		nb_entite ++;
		return nb_entite;
	}
	
	private 
}
