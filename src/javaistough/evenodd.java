package javaistough;

import java.util.Scanner;

public class evenodd{

	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		Scanner y =new Scanner(System.in);
		System.out.println("enter the num:");
		int number=x.nextInt();
		if(number%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
x.close();
y.close();
	}

}
