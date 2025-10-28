package Pokemon;
import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	private static int niveauMax;
	Random r = new Random();
	
	public Pokemon0(String nom) {
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
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
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
	
	public void attaquer(Pokemon0 p) {
		p.hp-=this.atk;
	}
	
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