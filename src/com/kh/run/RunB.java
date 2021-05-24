package com.kh.run;

import com.kh.first.B_ValuePrinter;

public class RunB {
	public static void main(String[] args) {
		/*
		 * 다른 클래스에 있는 메소드 실행할때 
		 * 1.사용하고자 하는 클래스 생성 
		 * 클래스명 사용할 이름 = new 클래스명();
		 */
		B_ValuePrinter b = new B_ValuePrinter();
		b.printValue1();
		b.printValue2();
	}
}
