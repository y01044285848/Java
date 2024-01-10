package sub1;

public class Banana {
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
