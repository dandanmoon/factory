package newDev;

import java.util.Scanner;

public class Test3_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("기본급 : ");
	int num1 = sc.nextInt();
	System.out.println("수당 : ");
	int num2 = sc.nextInt();
	
	int tex = num1/10;
	System.out.println("세금 : " + tex);
	
	int getTotal = num1 + num2 - tex;
	System.out.println("실수령액 : " + getTotal);
}
}
