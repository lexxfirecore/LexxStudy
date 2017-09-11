package com.lexx.java;

public class Enum {
	public enum Monede {
		UNU(1), CINCI(2), ZECE(3), DOUAZECISICINCI(4), CINCIZECI(5);
		public int value;
		
		Monede(int value){
			this.value = value;
		}
		
	}

	public enum Currency {
		HELLO("Hello people!"), HOWRU("How are you?"), GBYE("Good bye!");

		public String text;

		private Currency(final String text) {
			this.text = text;
		}
	}

	public static void main(String[] args) {

		System.out.println(Currency.HELLO.text);
		System.out.println(Currency.HOWRU.text);
		System.out.println(Currency.GBYE.text);
		System.out.println(Monede.UNU+" "+Monede.CINCI+" "+ Monede.ZECE+" "+Monede.DOUAZECISICINCI+" "+Monede.CINCIZECI);
		System.out.println(Monede.UNU.value+" "+Monede.CINCI.value+" "+ Monede.ZECE.value+" "+Monede.DOUAZECISICINCI.value+" "+Monede.CINCIZECI.value);
		

	}

}
