package Pokemon.TypesPokemons;
import Pokemon.Pokemon1;
import Pokemon.TypePokemon;


public class PokemonEau extends Pokemon1{
	
	public PokemonEau(String nom) {
		super(nom, TypePokemon.EAU);
	}
	
	@Override
	public void subir(Pokemon1 p) {
		if (p.getType() == TypePokemon.PLANTE) {
			int damage = (2*p.getAtk());
			this.hp -= damage;
			String msg ="C'est très efficace !\n";
			this.log(msg);
			
		}
		else if (p.getType() == TypePokemon.EAU || p.getType() == TypePokemon.FEU) {
			double damage = (0.5*p.getAtk());
			this.hp -= damage;
			String msg ="C'est peu efficace ...\n";
			this.log(msg);
		}
		
	}
	
	@Override
	public void attaquer(Pokemon1 p) {
		String msg ="J'attaque "+this.getNom()+" : "+this.getType()+" Vs "+p.getType();
		this.log(msg);
		p.subir(this);
	}

}
