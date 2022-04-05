package oop3;

import java.util.Scanner;

public class MinArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<min) 
				min = arr[i];
		}
		System.out.println(min);
	}
}
