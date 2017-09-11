package exceptions;

import java.text.MessageFormat;

public class ExceptionWithNullArgument {

	class ExtendedException extends RuntimeException{
		
		ExtendedException(String message, int arg1, Object arg2){
			super(MessageFormat.format(message, arg1, null));
		}
		
		
	}
	
	public static void main(String[] args) {
	
		ExceptionWithNullArgument ewna = new ExceptionWithNullArgument();
		
		String message = "\n\n*** Un mesaj cu parametrul1 = {0} si parametrul1 = {1}. ***\n";
		int parameter1 = 155;
		Object parameter2 = "asdas";
		
		if (true)
			parameter2 = null;


		throw ewna.new ExtendedException(message, parameter1, parameter2);
		
	}
}
