package com.kh.first; // 쿨래스가 존재하는 패키지에 대한 경로

//주석 : 코드에[ 대한 설명이나 그 외 다른 정보를 넣을 때 사용
// 컴파일 시 컴파일러가 주석 부분은 건너 뜀

/*여러 줄로 주석
 * 가능합니다
 * 사용해보세요 
 */

/*1. ㅍ프로젝트 만들기 -> 하나의 프로젝트가ㅣ 하나의 프로그램
 * 2.패키지 만들기 -> 폴더와 같은 개념으로 파일을 분류해서 관리함
 * 3.클래스 만들기 -> 코드를 작성하기 위해
 */
public class HelloWorld { //클래스의 시작
	
	/*클래스 : 자바에서 모든 코드는 반드시 클래승 안에 존재 
	 * 서로 관련 된 코드들을 그룹으로 나누어 별도의 클래스 구성
	 * 클래스들이 모여서 하나의 JAVA 어플리케이션 구성 
	 */
	public static void main(String[] args) { //메서드 시작
		
		/*메서드 :클래스의 기능(동작)에 해당하는 구현 부분으로
		 * 해당 메서드 호풀시 메소드의 블럭({})에 해당하는 부분 실행
		 */
		
		/*항상 프로그램 시작 시 main 메서드에서 시작
		 * 프로그램을 실행시키기 위해 필요한 특수 메서드
		 * 하나의 java 어플리케이션에는 main 메서드를 포함한 클래스가
		 * 반드시 하나는 있어야 함 
		 */
		
		//화면 출력 후 개행(한줄 띄어쓰기)하는 메서드
		System.out.println("Hello World!");
		
		//화면 출력후 개행하지 않는 메서드
		System.out.print("안녕하세요!n");
		System.out.print("여러분~!");
		
	} // 메서드 끝
} // 클래스의 끝