package com.lexx.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class SortedList {

	private static final class valueComparator implements
			Comparator<com.lexx.collections.SortedList_EnumValueDTO> {
//		@Override
		public int compare(com.lexx.collections.SortedList_EnumValueDTO o1, com.lexx.collections.SortedList_EnumValueDTO o2) {
			return o1.getValue().compareTo(o2.getValue());
		}
	}

	private static final class genericComparator implements
			Comparator<com.lexx.collections.SortedList_EnumValueDTO> {
//		@Override
		public int compare(com.lexx.collections.SortedList_EnumValueDTO o1, com.lexx.collections.SortedList_EnumValueDTO o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	public static List<com.lexx.collections.SortedList_EnumValueDTO> values = new ArrayList<com.lexx.collections.SortedList_EnumValueDTO>();
	
	public static void main(String[] args) {
		System.out.println("SortedList_Example");
		values.add(new com.lexx.collections.SortedList_EnumValueDTO("NS-1", "100"));
		values.add(new com.lexx.collections.SortedList_EnumValueDTO("20", "20"));
		values.add(new com.lexx.collections.SortedList_EnumValueDTO("N-2", "2"));
		values.add(new com.lexx.collections.SortedList_EnumValueDTO("NS-33", "3w20"));
		values.add(new com.lexx.collections.SortedList_EnumValueDTO("NS-1", "55"));
		values.add(new com.lexx.collections.SortedList_EnumValueDTO("NS2", "s12"));
		
		printList(values);
		
		
		Collections.sort(values, new genericComparator());
		
		printList(values);
		
		
		Collections.sort(values, new valueComparator());
		
		printList(values);
				
		
	}
	
	static public void printList(List<com.lexx.collections.SortedList_EnumValueDTO> list){
		System.out.println("\n");
		for (com.lexx.collections.SortedList_EnumValueDTO dto : values) {
			System.out.printf("%s %s\n", dto.getName(), dto.getValue() );
			
		}
	}

}
