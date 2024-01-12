package test4;

/*
 * 날짜 : 2024/01/12
 * 이름 : 이승윤
 * 내용 : 자바 API 클래스 연습문제
 * 
 */
class Apple {
	private String contry;
	private int price;

	public Apple(String contry, int price) {
		this.contry = contry;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [contry=" + contry + ", price=" + price + "]";
	}
}

class Banana {
	private String contry;
	private int price;

	public Banana(String contry, int price) {
		this.contry = contry;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Banana [contry=" + contry + ", price=" + price + "]";
	}
}

class Grape {
	private String contry;
	private int price;

	public Grape(String contry, int price) {
		this.contry = contry;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Grape [contry=" + contry + ", price=" + price + "]";
	}
}

public class Test5 {
	public static void main(String[] args) {
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);

		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
	}

	public static void showInfo(Object fruit) {
		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			System.out.println(apple);
		}else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			System.out.println(banana);
		}else if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			System.out.println(grape);
		}
	}
}
