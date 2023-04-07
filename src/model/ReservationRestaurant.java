package model;

public class ReservationRestaurant extends Reservation {
	private int service;
	private int numtable;
	
	public ReservationRestaurant(int jour,int mois,int service,int numtable) {
		super(jour,mois);
		this.service = service;
		this.numtable = numtable;
	}
	
	public String toString() {
		return "Le " +jour+"/"+mois+ " : table n°"+numtable + " pour le " + service(service);
	}
	
	private String service(int numtable) {
		if(numtable == 1) {
			return "premier service.\n";
		}
		return "deuxième service.\n";
	}
}