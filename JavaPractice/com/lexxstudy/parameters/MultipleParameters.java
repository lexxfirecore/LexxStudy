package com.lexxstudy.parameters;

public class MultipleParameters {
	
	public static void main(String[] args) {		
		multiParameterMethod("Alfa");
		multiParameterMethod("Obsidion Sanctum", "Alpha", "Deep Purple");
		multiParameterMethod("Professor's Cube", "Deep Purple");				
		multiParameterMethod();
	}	
	
	private static void multiParameterMethod(String ... parameters) {		
		StringBuffer sb = new StringBuffer();
		for (String parameter : parameters) {
			sb.append(parameter + ", ");
		}		
		if(sb.length()>2)
		sb.setLength(sb.length()-2);
		
		System.out.println("\nCalled multiParameterMethod("+ sb +") with " + parameters.length + " parameter(s).");
		int i=0;
		for (String parameter : parameters) {
			System.out.println("parameter " + ++i + " : " + parameter);
		}
	}

}
