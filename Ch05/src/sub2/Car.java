package sub2;

public class Car {
	private String name;
	private String color;
	private int speed;
	
	public Car(String name, String color, int speed) {
		//생성자는 class 이름과 같이 함, 리턴타입 X
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	public void speedUp(int speed) {
		this.speed += speed;
	}

	public void speedDown(int speed) {
		this.speed -= speed;
	}

	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("차량속도 : " + speed);
	}
	
	//Getter, Setter - 필요에 따라 정의
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
