package classloader;

public class Candy {
	
	public Candy() {
		System.out.println("Constructor Candy");
	}
	
	static { System.out.println("\nLoading Candy"); }

}
