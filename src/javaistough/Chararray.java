package javaistough;

import java.util.Scanner;

public class Chararray {

	public static void main(String[] args) {
		Scanner y =new Scanner(System.in);
		System.out.println("enter the string");
		String str=y.next();
		char[] c=str.toCharArray();
		for (int i=0;i<str.length();i++) {
		System.out.println(c[i]);
		}
		
	}
	

}
