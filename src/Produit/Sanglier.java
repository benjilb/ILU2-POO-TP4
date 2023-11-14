package Produit;

public class Sanglier extends Produit {
	private int poids;
	private String chasseur;
	
	
	public Sanglier( int poids, String chasseur) {
		super("sanglier", Unite.kilogramme);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	@Override 
	public void decrireproduit() {
		System.out.println(nom + " de " + poids + " " + unite + " chasse par " + chasseur);
	}
}
