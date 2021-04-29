package newDev;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input a : ");
		int num1 = sc.nextInt();
		System.out.println("input b : ");
		int num2 = sc.nextInt();
		
		int result = (num1 > num2?  num1 : num2);
		
		System.out.println("큰수 : " + result);
	}

}
