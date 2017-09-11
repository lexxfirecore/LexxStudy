package classloader;

public class Cookie {
	
	public Cookie() {
		System.out.println("Constructor Cookie");
	}
	
	static { System.out.println("\nLoading Cookie"); }

}
