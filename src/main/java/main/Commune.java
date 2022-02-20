package main;

public class Commune {
	private String nom;
	private HabitationIndividuelle[] tab;
	private HabitationProfessionnelle []tab1;
	private int nbHabitIndiv;
	private int nbHabitProf;
	
	public Commune(String nom) {
		this.nom=nom;
		tab=new HabitationIndividuelle[100];
		tab1=new HabitationProfessionnelle[100];
	}
	public void ajoutHabitation(Habitation uneHabitation) {
		if(uneHabitation instanceof HabitationIndividuelle) 
			tab[nbHabitIndiv++]=(HabitationIndividuelle) uneHabitation;
		
		else 
			tab1[nbHabitProf++]=(HabitationProfessionnelle) uneHabitation;
	}
	
	public double impotCommune() {
		double impot=0.0;
		for(int i=0;i<nbHabitIndiv;i++) {
			impot += tab[i].impot();
		}
		for (int i=0;i<nbHabitProf;i++) {
			impot+=tab1[i].impot();
		}
	 
		return impot;
	}
	
	public void affiche() {
		System.out.println(nom);
		for(int i=0;i<nbHabitIndiv;i++) {
			tab[i].affiche();
		}
		for(int i=0;i<nbHabitProf;i++) {
			tab1[i].affiche();
		}
	}

}
