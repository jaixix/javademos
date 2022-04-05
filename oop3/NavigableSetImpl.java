package oop3;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetImpl {
	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		ns.add(23);
		ns.add(34);
		ns.add(69);
		ns.add(75);
		ns.add(92);
		
		System.out.println(ns);
		System.out.println(ns.descendingSet());
		System.out.println("----------------------");
		NavigableSet<Integer> headSet = ns.headSet(75, true);
		System.out.println(headSet);
		headSet.add(6);
		System.out.println("----------------------");
		System.out.println(headSet);
		System.out.println(ns);
	}
}
