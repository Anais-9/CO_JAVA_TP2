package Pokemon;

public enum TypePokemon {
	EAU("Eau"),
	FEU("Feu"),
	PLANTE("Plante");
		
	private String affichage;
		
	private TypePokemon(String affichage) {
		this.affichage = affichage;
	}
		
	@Override
	public String toString() {
		return this.affichage;
	}
	
}
