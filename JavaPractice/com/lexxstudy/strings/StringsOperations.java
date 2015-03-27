package com.lexxstudy.strings;

import java.util.ArrayList;
import java.util.List;

public class StringsOperations {
	
	public static void main(String[] args) {
		String str1 = "{\"isAllSelected\":true,\"jsonCriterion\":\"{\\\"state\\\":{\\\"$ne\\\":2}}\",\"note\":\"my note\"}"  ;
		List<Integer> filterListOfIds = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			filterListOfIds.add(i);
		}
	
		String str2 = "{\"_id\":{\"$in\":[" + filterListOfIds + "]}}";	 
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2.replace("_id", "id"));

	}

}
