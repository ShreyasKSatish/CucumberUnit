package org.datatable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class DataTable2D {
	public static void main(String[] args) {
		//2D without header
		List<List<String>> li = new ArrayList<>();
		List<String> list = new ArrayList<>();
		list.add("TamilNadu"); 
		list.add("Kerala");
		list.add("Telangana"); 

		List<String> list2 = new ArrayList<>();
		list2.add("Tamil"); 
		list2.add("Malayalam");
		list2.add("Telugu"); 
		String state = list.get(2); System.out.println(state);
		String language = list2.get(2); System.out.println(language);
		//2D with header
		List<Map<String, String>> listmap = new ArrayList<>();

		Map<String, String> detail1 = new LinkedHashMap<>();
		detail1.put("Name", "Satish");
		detail1.put("Course", "Java Selenium"); 
		detail1.put("Location", "Thoraipakkam Chennai");

		Map<String, String> detail2 = new LinkedHashMap<>();
		detail2.put("Name", "Shreyas"); 
		detail2.put("Course", "API Testing");
		detail2.put("Location", "Tambaram Chennai");

		listmap.add(detail1);	listmap.add(detail2);

		Map<String, String> map = listmap.get(1);
		String string = map.get("Course");
		System.out.println(string);
	}}
