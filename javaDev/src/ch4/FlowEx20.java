package ch4;

public class FlowEx20 {public static void main(String[] args) {
	for(int i=10; i>=0; i--) {
		for(int j = 0; j<1000000000; j++) {
			;
		}
		System.out.println(i);
	}
	System.out.println("GAME OVER");
}
}
