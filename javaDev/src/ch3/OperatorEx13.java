package ch3;

public class OperatorEx13 {
public static void main(String[] args) {
		char c1 = 'a'; // a �����ڵ� 97
		char c2 = c1;
		char c3 = ' '; // ���� �����ڵ� 32
		
		int i = c1 + 1;
		
		c3 = (char)(c1 + 1);
		c2++;
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
	}

}
