package org.datatable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataTable1D {
	
	public static void main(String[] args) {
		
		//ID without header 
		List<String> li = new ArrayList<String>();
		li.add("India");
		li.add("Australia");
		li.add("United States Of America");
		li.add("England");
		li.add("Norway");
		
		//to get the value of the list, we need to use get() inside get()method, we need to pass index value
		System.out.println("1D Without Header");
		String country = li.get(2);
		System.out.println(country); //United States Of America
		
		//1D with header
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Tamil");
		map.put(2, "Hindi");
		map.put(3, "Malayalam");
		map.put(4, "Marathi");// with header, we need to use MAP concepts(Key and Values)
		
		//to get the value of the list, we need to use get() inside get()method, we need to pass "key" value
		System.out.println("1D With Header");
		String language = map.get(3);
		System.out.println(language);
			
	}

}
