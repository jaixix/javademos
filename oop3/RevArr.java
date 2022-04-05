package oop3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RevArr {
	public static void main(String[] args) {
		int[] arr = {12,43,5,65,66};
		reverseArr(arr);
		System.out.println(Arrays.toString(arr));
		List<Integer> al = new ArrayList<Integer>();
//		al.add(2,1);
		System.out.println(al);
		
		
		List<String> ll = new LinkedList<String>();
		ll.add("Jai");
		ll.add("Deep");
		System.out.println(ll);
		
		for(String s : ll)
			System.out.println(s);
		System.out.println(ll.toString());
	}
	
	public static void reverseArr(int[] arr) {
		int maxIndex = arr.length-1;
		int halfLength = arr.length/2;
		for(int i=0;i<halfLength;i++) {
			int temp = arr[i];
			arr[i] = arr[maxIndex-i];
			arr[maxIndex-1] = temp;
		}
	}
}
