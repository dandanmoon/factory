package ch6;
class Data1 {
	int value;
}

class Data3{
	int value;
	Data3(int x){
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data3 d2 = new Data3(3);
		System.out.println(d2.value);
	}
}