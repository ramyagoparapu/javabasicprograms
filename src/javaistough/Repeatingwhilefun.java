package javaistough;

public class Repeatingwhilefun {

	public static void main(String[] args) {
		
	int count=0;
	do {
		System.out.println(Test("chir"));
		count++;
	}while(count<9);
		
		
	}
	
public static String Test(String a) {
	return a+"ping";
}
}
