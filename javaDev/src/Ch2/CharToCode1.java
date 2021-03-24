package Ch2;

public class CharToCode1 {
	public static void main(String[] args) {
		char ch = 'A';   // char ch = '\u0041';로 바꿔써도 같다.
		int code = (int)ch; // ch에 저장된 값을 int형으로 변화하여 저장한다.

		System.out.println(ch);
		System.out.println(code);
	}
}