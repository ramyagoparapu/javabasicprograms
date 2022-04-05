package javaistough;

import java.util.Scanner;

public class Prime {
	public static boolean checkprime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		
		}
		
	return true;	
	}

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter a number:");
        int n=x.nextInt();
        if((n>=2)&&checkprime(n)) {
        	System.out.println("it is prime");
        	
        }
        else
        	System.out.println("not prime");
	
	}


	
	}

