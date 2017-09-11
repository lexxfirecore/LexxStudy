package parameters;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Parameters {
	
	public static ArrayList<Object> lista = new ArrayList<Object>();

	public static void printAllParams(Object... params) {

		StringBuilder sb =  new StringBuilder();
		
		for (int i = 0; i < params.length; i++) {
			lista.add(params);
		}
		
		for(Object o: params){
			sb.append(o);
			sb.append(" ");
		}
		
		
		System.out.println(MessageFormat.format("A text: {0}, an integer: {1} and a double: {2} and last has no parameter: {3}",params));
	}
	

	public static void main(String[] args) {
		printAllParams("a text", 14, 3.14195);
		

	}

}
