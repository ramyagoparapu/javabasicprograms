package javaistough;

public class Polymorphism {
	public static String s="howareyou?";
	public  int b=25;

	public static void main(String[] args) {
	String s="hello";
	int b=10;
	     System.out.println(color(Polymorphism.s));
		Polymorphism po=new Polymorphism();
		System.out.println(po.color(Polymorphism.s,po.b));
		
	}
public static String color(String a ) {
	String x=a;
	return x;
	}
public String color(String a,int b) {
	
	String y=a+b;
    return y;
}
	
}



