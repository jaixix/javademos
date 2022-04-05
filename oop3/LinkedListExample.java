package oop3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> ll = new LinkedList<String>();
		addElement("Jai", ll);
		addElement("Deep", ll);
		addElement("Lal", ll);
		addElement("chandani", ll);
		printList(ll);
	}
	
	public static void addElement(String element, List<String> ll) {
		System.out.println("Adding element : " + element);
		ll.add(element);
	}
	
	public static void printList(List<String> ll) {
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
