package ch4;

public class Exercise9 {
public static void main(String[] args) {
	String str = "123456789";
	int sum = 0;
	
	for(int i=0; i<str.length(); i++) {
		sum += str.charAt(i) -'0';
		
	}
			System.out.println(sum);
}
}
