package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private CalendrierAnnuel calendrierperso;
	private int numId;
	
	public int getnumId() {
		return numId;
	}
	public void setnumId(int numId) {
		this.numId = numId;
	}
	
	public boolean estLibre(F form) {
		return calendrierperso.estLibre(form.getJour(), form.getMois());
	}
	
	public abstract boolean compatible(F form);
	public abstract Reservation reserver(F form);
	
}
