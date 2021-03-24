package ch4;

public class Exercise3 {//1에서 10까지 하나씩 더한값의 총합을 구하는 조건문
	public static void main(String[] args) {
		int sum = 0;
		int totalsum = 0;

		for(int i = 1; i<=10; i++) {
			sum+=i;
			totalsum+=sum;
		} 
		System.out.println("totalsum="+totalsum);
	}
}
