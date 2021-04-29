package newDev;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===삼각형의 넓이 구하기===");
		
		System.out.println("밑변 : ");
		double num1 = sc.nextDouble();
		System.out.println("높이 : ");
		double num2 = sc.nextDouble();
		
		double result = (num1*num2/2)*100/100;
		 System.out.println("넓이 : " + result);
	}

}
