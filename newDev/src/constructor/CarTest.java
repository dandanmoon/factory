package constructor;

class Car{
	String color;  //색상
	String gearType;  // 기어타입 - 오토, 메뉴얼
 	int door;
 	
 	Car(){}
 	Car (String c, String g, int d){
 		color = c;
 		gearType = g;
 		door = d;
 		
 	}
}

class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color  = "White";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("White", "auto", 4);
		System.out.println("c1의 color : " + c1.color + ", gearType : " 
		+ c1.gearType + ", door : " + c1.door);
		
		System.out.println("c2의 color : " + c2.color + ", gearType : " 
				+ c2.gearType + ", door : " + c2.door);
	}

}
