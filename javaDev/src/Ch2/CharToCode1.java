package Ch2;

public class CharToCode1 {
	public static void main(String[] args) {
		char ch = 'A';   // char ch = '\u0041';�� �ٲ�ᵵ ����.
		int code = (int)ch; // ch�� ����� ���� int������ ��ȭ�Ͽ� �����Ѵ�.

		System.out.println(ch);
		System.out.println(code);
	}
}