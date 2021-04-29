package newDev;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input name : ");
		String name = sc.next();
		System.out.println("kor : ");
		int num1 = sc.nextInt();
		System.out.println("Eng : ");
		int num2 = sc.nextInt();
		System.out.println("Math : ");
		int num3 = sc.nextInt();
		
		int getTotal = num1 + num2 + num3;
		
		float getAverage = (int)(getTotal / 3f*10)/10f;
		
		System.out.println("이름 : " + name);
		System.out.println("총점  : " + getTotal);
		System.out.println("평균  : " +getAverage);
	}
	

}
      