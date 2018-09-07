
package com.lexx.collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class List_Example {

	public class ListClass{
		public void createList()
		{
			List<String> ls = new Vector<String>();

			ls.add("one");
			ls.add("Three");
			ls.add("two");
			ls.add("four");
			
			Iterator it = ls.iterator();
			while(it.hasNext())
			{
				String value = (String) it.next();
				System.out.println("Value : "+ value);
			}
	
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		List_Example le = new List_Example();
		ListClass l = le.new ListClass();
		
		l.createList();
		
	}

}
