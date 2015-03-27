package com.lexxstudy.inheritance;

public class Inheritance {
	
	public class Z{
		private int flags = 0;

		public int getFlags() {
			return flags;
		}

		public void setFlags(int flags) {
			this.flags = flags;
		}				
	}
	
	public class A extends Z{		
	}
	
	public class B extends Z{		
	}
	
	public static void main(String[] args) {
		
		Inheritance i = new Inheritance();
		Z z = i.new Z();
		prFlagsNot0(z);
		
		A a = i.new A();		
		prFlagsNot0(a);
		
		B b = i.new B();
		prFlagsNot0(b);
		
		a.setFlags(3);
		System.out.println("\na.setFlags(3);");
		prFlagsNot0(z);
		prFlagsNot0(a);
		prFlagsNot0(b);
		
		System.out.println("\nb.setFlags(4);");
		b.setFlags(4);
		prFlagsNot0(z);
		prFlagsNot0(a);
		prFlagsNot0(b);
		
		System.out.println("\nz.setFlags(7);");
		z.setFlags(7);
		prFlagsNot0(z);
		prFlagsNot0(a);
		prFlagsNot0(b);
		
		System.out.println("\nb.setFlags(55);");
		b.setFlags(55);
		prFlagsNot0(z);
		prFlagsNot0(a);
		prFlagsNot0(b);
		

	}
	
	public static void prFlagsNot0(Z x){
		if ( x.getFlags() != 0 ) System.out.println(x.getClass().getSimpleName() + ".getFlags() = " + x.getFlags());		
	}

}
