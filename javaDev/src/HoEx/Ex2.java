package HoEx;

class Ex2 {
	public static long solution(int a, int b) {
		long answer = 0;
		if(a == b) {
			answer =  a;
			return answer;
		}else if(a<b){
			for(int i = a; i <= b; i++) {
				answer += i;
			} return answer;       		
		}if(b<a) {
			for(int i = b; i <= a; i++) {
				answer += i;
			} return answer;       		
		}
		return answer;
	}
public static void main(String[] args) {
	int a = 3;
	int b = 3;
	long result = solution(a, b);
	System.out.println(result);
}
}
