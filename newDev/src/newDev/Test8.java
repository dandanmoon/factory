package newDev;

import java.util.Scanner;

public class Test8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 입력 : ");
	int  n = sc.nextInt();
	
	if(n < 0 || n > 100) {
		System.out.println("입력오류!");
	}else {
		System.out.println("입력된값 : " + n);
	}
	
	
}
}
