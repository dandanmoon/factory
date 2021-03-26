package HoEx.codingtest;

public class CodingTest {
	public String solution(int num) {
		return num%2==0 ? "Even"  :  "Odd"; 
			
	}
		public static void main(String[] args) {
			CodingTest ct = new CodingTest();
			int num = 5;

			System.out.println(ct.solution(num));
		}	
	}