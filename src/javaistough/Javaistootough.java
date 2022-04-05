package javaistough;

import java.util.Scanner;

public class Javaistootough {

	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		System.out.println("enter the string:");
		String s=x.nextLine();
		int strlength=s.length();
		System.out.println("the length is " +strlength);
        char[] chararray = s.toCharArray();
		System.out.println(chararray[1]);
	

	
}
}