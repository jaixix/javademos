package oop3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Jai");
		list.add("Jacob");
		list.add("Jai");
		list.add("Jai");
		list.add("Jai");
		String[] arr = {"Janvi"};
		Collections.addAll(list, arr);
		System.out.println(list);
		
		
		
	}
}
