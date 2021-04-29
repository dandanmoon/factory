package newDev;

public class Test3 {
	public static void main(String[] args) {
		int num1 = 1500000;
		int num2 = 55000;
		int num3 = num1/10;
		int num4 = num1+num2-num3;
		
		System.out.println("기본급 : " + num1);
		System.out.println("시간수당 : "+num2);
		System.out.println("세금 : " + num3);
		System.out.println("실수령액 : N"+ num4);
	}

}
