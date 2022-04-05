package javaistough;

import java.util.Scanner;

public class Repeatthestring {
       public static void main(String[] args) {
    	   Scanner x=new Scanner(System.in);
    	   System.out.println("gimme the string:");
    	   String s=x.next();
    	      		  
    	   
    	   String result=s.concat(s);
    	   System.out.println("The result after concat is:" +result +result);
    	   

}
       
}