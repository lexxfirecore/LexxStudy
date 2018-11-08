package basic;

public class Boolean {

	public static void main(String[] args) {
	
		int i = 0;
		int j = 0;
		
		boolean b = ((i++ == ++j && i-- == --j));


		System.out.println(""+b+i);

	}
	

}
