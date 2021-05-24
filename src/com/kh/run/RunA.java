package com.kh.run;

import com.kh.first.*;

public class RunA {

	public static void main(String[] args) {
		// 다른 클래스에 있는 메서드를 실행하려면?

		/*
		 *1.실행할 메서드가 있는 클래스를 생성
		 *  클래스명 사용 할 이름 = new 클래스명
		 */
		A_MethodPrinter a = new A_MethodPrinter();

		/*다른 패키지에 존재하는 클래스 이기 떄문에 인식 할 수 없어 compile error 발생
		 * ->앞에 패키지명을 명시하면 인식가능 or import 구문 작성하면 인식가능
		 * 
		 * 2. 메서드 실행(호출)
		 *   	사용할 이름. 사용할 메서드();
		 */

		/*
		 * a.methodA();
		 *  a.methodB(); 
		 *  a.methodC();
		 */

		/*메서드가 순차적으로 실행 된 걸 확인 할 수 있음
		 * 다른방법으로 -> methodA() 호출만으로 똑같이 출력되도록 변경
		 */
		a.methodA();
	}
}
