package main;

public class Test {
	public static void main(String[] args) {
		HabitationIndividuelle h1=new HabitationIndividuelle("houda","ariana",1502,5,true);
		HabitationIndividuelle h2=new HabitationIndividuelle("ghassen","ariana",1201,8,false);
		HabitationProfessionnelle P1=new HabitationProfessionnelle("ahmed","ariana",840,40);
		HabitationProfessionnelle P2=new HabitationProfessionnelle("yessine","ariana",1470,80);
        Commune C=new Commune("Habitation");
        C.ajoutHabitation(h1);
        C.ajoutHabitation(h2);
        C.ajoutHabitation(P1);
        C.ajoutHabitation(P2);
        C.affiche();
        System.out.println(C.impotCommune());
}
}
