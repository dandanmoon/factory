package HoEx.codingtest;

public class CodingTest2 {

	public String solution(int n) {
		String result = "";
		for(int i = 0; i<n; i++) 
			result += i%2==0 ?"수" : "박";
		return result;
	}	
	public static void main(String[] args) {
		CodingTest2 ct = new CodingTest2();
		int n = 5;

		System.out.println(ct.solution(n));
	}	
}
