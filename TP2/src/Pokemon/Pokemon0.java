package Pokemon;
import java.util.Random;

public class Pokemon0 {
	String nom;
	int niveau;
	int hp;
	float atk;
	
	public Pokemon0(String nom) {
		this.nom = nom;
		Random r = new Random();
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
	
	public float getAtk() {
		return this.atk;
	}
}
