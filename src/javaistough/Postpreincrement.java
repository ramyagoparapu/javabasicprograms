package javaistough;

public class Postpreincrement {

	public static void main(String[] args) {
		int i=4;
		System.out.println(i);
		int x=++i;
		int x1=i++;
System.out.println(x);
System.out.println(x1);
System.out.println(i);
System.out.println(myoperation(5));

	}
	public static int myoperation(int a) {
	int z=++a;
	return z;
		
	}
	
}

