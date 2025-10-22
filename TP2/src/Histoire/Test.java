package Histoire;
import Pokemon.Pokemon0;
public class Test {
	public static void main(String[] agr) {
		// test Pokemon0
		System.out.println("\nTest Pokemon0\n");
		Pokemon0 p1 = new Pokemon0("Rhinolove");
		Pokemon0 p2 = new Pokemon0("Chovsourir");
		
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());

	}

}
