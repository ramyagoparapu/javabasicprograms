package javaistough;

public class whileexample {

	public static void main(String[] args) {
	System.out.println(example("hi!"));
	System.out.println(example1(3,5));
	whileexample we=new whileexample();
	we.mine(10,5);
	we.mine2("hey u look so beautiful");
	

	
	}

	
public static  String example(String a ) {
	return a+"how are you?";
}
public static int example1(int a ,int b) {
	int c=a*b;
	return c;
}
	
public double mine(int a ,int b) {
	double c=a/b;
	System.out.println(c);
	return c;
	
}
public String mine2(String a ) {
	String  x= a;
	System.out.println(x);
	return x;
	
}
}
  
