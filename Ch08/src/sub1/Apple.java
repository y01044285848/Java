package sub1;

public class Apple {
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
