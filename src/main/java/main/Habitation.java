package main;

public class Habitation implements Imposable {
	private String prop;
	private String add;
	private double surface;
	public Habitation(String prop,String add,double surface) {
		this.add=add;
		this.prop=prop;
		this.surface=surface;
	}
	public void affiche() {
		System.out.println(prop+" a pour address :"+add+" et pour surface : "+surface);
	}
	public double impot() {
		return 2*surface;
	}

}
