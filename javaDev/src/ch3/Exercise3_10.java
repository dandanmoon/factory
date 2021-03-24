package ch3;

public class Exercise3_10 {
	public static void main(String[] args) {
		char ch = 'A';			
		
		char lowercase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch:" + ch);
		System.out.println("ch to lowercase:"+ lowercase);
	}

}
