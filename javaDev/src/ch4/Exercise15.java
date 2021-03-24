package ch4;

public class Exercise15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;

		int result = 0;

		while(tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		if(number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문1수 아닙니다.");
	}
}
