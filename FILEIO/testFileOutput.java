package FILEIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class testFileOutput {
	private static final String filePath = "C:\\outTest\\testOut.txt";
	public static void main(String[] args) {
//		testout1();
//		testout2();
//		testinput1();
		testinputBuffReader();
	}
	
	private static void testinputBuffReader() {
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			int i;
			while((i=br.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void testout2() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			String s = "Hello world from Java program!";
			fos.write(s.getBytes());
			fos.close();
			System.out.println("Closed.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void testout1() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.close();
			System.out.println("Closed.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
