package practice.repetitive;

import java.util.Scanner;

public class RepetitivePractice {

	public void method1() {
		//피라미드 모양 별찍기

		//외부 for문  줄 조건
		for(int i = 0; i<4; i++) {
			//내부 for 문 칸 조건
			// 공백 출력(3,2,1,0)
			for(int j = 3; j >i; j--) {
				System.out.print(" ");
			}
			//별 출력(1, 3, 5, 7)
			for(int j = 0; j <i*2+1; j++) {
				System.out.print("*");
			}
			//개행	
			System.out.println();
		}
	}
	public void method2() {
		//마름모 모양 별찍기
		System.out.print("줄 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
	}
}

