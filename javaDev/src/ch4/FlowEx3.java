package ch4;

public class FlowEx3
{
	public static void main(String[] args)
	{
		int score = 45;
		char grade = ' '; //������ �����ϱ� ���� ����. �������� �ʱ�ȭ�Ѵ�.
	
		if(score>=90) { //score�� 90�� ���� ���ų� ũ�� A����
			grade = 'A';
		}else if (score>=80) { //scorerk 80�� ���� ���ų� ũ�� B����
			grade = 'b';
		}else { //�������� C����
			grade = 'c';
		}
		
		System.out.println("����� ������ " + grade+"�Դϴ�.");
	}
}