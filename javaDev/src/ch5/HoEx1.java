package ch5;

public class HoEx1 {
public static void main(String[] args) {
	int tmp = 0;
	int a= 1;
	int b=2;
	System.out.println("a : " + a + " b : " + b);
	
	tmp = a;
	a = b;
	b = tmp;
	System.out.println("a : " + a + " b : " + b);
}
}
