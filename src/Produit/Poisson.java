package Produit;

public class Poisson extends Produit{
	private String datePeche;
	
	public Poisson( String datePeche) {
		super("poisson", Unite.pièce);
		this.datePeche = datePeche;
	}
	@Override 
	public void decrireproduit() {
		System.out.println(nom + " de " + poids + " " + unite + " chasse par " + chasseur);
	}
}
