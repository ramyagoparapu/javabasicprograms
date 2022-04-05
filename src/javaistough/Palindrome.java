package javaistough;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		System.out.println("enter the string:");
		String originalword=x.next();
		String rev="";
		int length=originalword.length();
		
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+originalword.charAt(i);
		}
	if(originalword.equals(rev)) {
		System.out.println("palindrome");
		}
	else {
		System.out.println("not palindrome");	}
	
	}}

	


