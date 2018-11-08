package basic;

public class Bitwise {

	public static void main(String[] args) {
		int a = 5;
		print2( a );		
		print2( a &=1 );		// bitwise multiply with 0001		
		print2( a <<= 3 );		// shift 0001 with 4 bits to left		
		print2( a |= 3 );		// 1000 | 11 = 1011
		print2( a &= 2 );		// 1011 & 10 = 10
		
		
		print2( 1 | 1);
		

	}

	public static void print2(int var){
		System.out.println("var = " + Integer.toString(var, 2));
	}
	
}

