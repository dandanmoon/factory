package ch6;
class Tv{
	//Tv의 속성 (member variable)
	String color; // 색상
	boolean power; // Tv의 전원상태
	int channel; // 채널
	
	//Tv의 기능(Method)
	void power() { power = !power;} // 전원 method 
	void channelUp() {  ++channel;} // 채널을 높이는 meThod
	void channelDown() {--channel;}// 채널을 낮추는 meThod
}

public class TvTest1 {
	public static void main(String[] args) {
		Tv t; // 참조 변수 선언
		t= new Tv(); // 인스턴스 생성
		t.channel = 7; // 인스턴스의 멤버변수 채널의 값을 7로 한다.
		t.channelDown(); // 인스턴스의 메서드 채널다운을 호출한다.
		System.out.println("현재 채널은 " + t.channel + " 입니다. ");
	}
}