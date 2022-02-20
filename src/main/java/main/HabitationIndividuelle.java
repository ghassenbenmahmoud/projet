package main;

public class HabitationIndividuelle extends Habitation {
	private int nbPieces;
	private boolean piscine;
	public HabitationIndividuelle(String prop, String add, double surface,int nbPieces,boolean piscine) {
		super(prop, add, surface);
		this.nbPieces=nbPieces;
		this.piscine=piscine;
	}
	
	public void affiche() {
		super.affiche();
		System.out.println(" "+nbPieces+"Piscine ?"+piscine);
	}
	@Override
	public double impot() {
		double impot=super.impot() + nbPieces*100;
		if(piscine) {
			impot+=500;
		}
		return impot;
		
	}
}
