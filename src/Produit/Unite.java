package Produit;

public enum Unite {
	Litre("l"), Gramme("g"), kilogramme("kg"), centilitre("cl"), millilitre("ml"), pièce("piece");
	private String abrev;
	
	private Unite(String abrev) {
		this.abrev = abrev;
	}
	@Override
	public String toString() {
		return abrev;
	}


}