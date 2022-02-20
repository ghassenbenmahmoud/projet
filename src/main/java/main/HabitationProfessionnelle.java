package main;

public class HabitationProfessionnelle extends Habitation{
	private int nbEmployes;

	public HabitationProfessionnelle(String prop, String add, double surface,int nbEmployes) {
		super(prop, add, surface);
		this.nbEmployes=nbEmployes;
	}
	@Override
	public double impot() {
		return super.impot()+(nbEmployes/10)*1000;
	}
	
	public void affiche() {
		super.affiche();
		System.out.println(" "+nbEmployes);
	}
}
