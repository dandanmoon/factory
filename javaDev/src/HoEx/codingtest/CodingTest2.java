package HoEx.codingtest;

public class CodingTest2 {

	public String solution(int n) {
		String result = "";
		for(int i = 1; i<=n; i++) {			
			if(i%2==1) {
				result = result +"수";
			}else {
				result = result +"박";			
			}
		}
		return result;
	}	
	public static void main(String[] args) {
		CodingTest2 ct = new CodingTest2();
		int n = 5;

		System.out.println(ct.solution(n));
	}	
}
