package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];
	
	public CalendrierAnnuel() {
		calendrier[0] = new Mois("Janvier",31);
		calendrier[1] = new Mois("Fevrier",28);
		calendrier[2] = new Mois("Mars",31);
		calendrier[3] = new Mois("Avril",30);
		calendrier[4] = new Mois("Mai",31);
		calendrier[5] = new Mois("Juin",30);
		calendrier[6] = new Mois("Juillet",31);
		calendrier[7] = new Mois("Aout",31);
		calendrier[8] = new Mois("Septembre",30);
		calendrier[9] = new Mois("Octobre",31);
		calendrier[10] = new Mois("Novembre",30);
		calendrier[11] = new Mois("Decembre",31);
	}
	
	public boolean estLibre(int numjour,int nummois) {
		return calendrier[nummois-1].estLibre(numjour-1);
	}
	
	public boolean reserver(int numjour, int nummois) {
		try {
			calendrier[nummois-1].reserver(numjour-1);
		}
		catch (IllegalStateException e){
			return false;
		}
		return true;
	}
	
	private class Mois{
		private String nom;
		private boolean[] jour;
		
		public Mois(String nom,int nbjours) {
			this.nom = nom;
			this.jour = new boolean[nbjours];
			for (int hippolyte = 0;hippolyte!=nbjours-1;hippolyte++)
				this.jour[hippolyte] = false;
		}
		
		private boolean estLibre(int numjour){
			return !jour[numjour];
		}
		
		private void reserver(int numjour) throws IllegalStateException {
			if (!this.jour[numjour]) {
				this.jour[numjour] = true;
			}
			else
				throw new IllegalStateException ("Jour non libre");
		}
		
	}
}
