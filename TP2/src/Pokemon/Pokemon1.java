package Pokemon;
import java.util.Random;

public abstract class Pokemon1 {
	private String nom;
	private int niveau;
	private float hp;
	private float atk;
	private static int niveauMax; 
	private TypePokemon type;
	private static Random r = new Random();
	
	
	public Pokemon1(String nom) {
		this.nom = nom;
		this.niveau = r.nextInt(1, 10);
		this.hp = this.niveau*2;
		this.atk = (this.niveau / 2 )+1;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
	
	public float getHp() {
		return this.hp;
	}
	
	public float getAtk() {
		return this.atk;
	}
	
	public Boolean isKo() {
		if(this.hp == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void soigner() {
		this.hp = this.niveau * 2;
	}
	
	public abstract void attaquer(Pokemon1 p);
	
	public abstract void subir(Pokemon1 P);
	
	
	@Override
	public String toString() {
		String msg ="Je m'appelle "+this.nom+", \nmon niveau est de " + this.niveau + ", \nj'ai "+this.hp
				+" de point de vie \net mon attaque est de "+this.atk;
		return msg;
	}
	
	public void log(String msg) {
		String message= "[Pokemon "+this.nom+"] :" +msg;
		System.out.println(message);
	}

}