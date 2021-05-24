package com.kh.first;

public class B_ValuePrinter {
	/*<명명 규칙>
	 * 1.패키지 -> 소문자로 시작
	 * 2.클래스 -> 대문자로 시작
	 *3.메서드 -> 소문자로 
	 *
	 * 여러개의 단어가 있을 때는 각 단어의 앞자리는 대문자로 -> 카멜 표기법
	 * Valueprinter -> ValuePrinter
	 */
	
		public void printValue1() {
			//여러 가지 형태의 값을 출력하는 기능을 하는 메서드
			
			//1. 숫자 출력
			 System.out.println(123);     //정수값
			 System.out.println(1.23);    //실수값
			 
			 //2. 문자 출력 -> 따옴표(싱글 쿼테이션) 사용
			 System.out.println('a');
			 System.out.println('b');
			 
			 //3. 문자열 출력 -> 쌍따옴표(더블 쿼테이션) 사용
			 System.out.println("안녕하세요.");
			 System.out.println("반갑습니다.");
			 
			 //4.내부에서 연산 가능
			 System.out.println(123 + 456);
			 System.out.println(1.23 - 0.12);
			 //컴터는 이진수 밖에 표현할수 없으므로 실수 값 연산은 불완전해서 오차가 생길수 있음
			 
			 //5. 문자는 숫자와 연산 가능
			 System.out.println('a' + 1);
			 System.out.println('b' + 1);
			 // 97 (a의 유니코드) + 1
			 
			 //6. 문자열과 숫자의합 - > 문자열
			 System.out.println("안녕하세요" + 1 );
			 System.out.println("반갑습니다" + 22 + 33 );
		}
		
		public void printValue2() {
			System.out.println(9+9); //18
			System.out.println(9 + "9"); // 99
			System.out.println(9 + 9 + "9"); // 189
			System.out.println("9" + 9 + 9); // 999
		}
}
