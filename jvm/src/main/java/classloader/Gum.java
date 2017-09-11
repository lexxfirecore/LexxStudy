package classloader;

public class Gum {
	
	public Gum() {
		System.out.println("Constructor Gum");
	}
	
	static { System.out.println("\nLoading Gum"); }

}
