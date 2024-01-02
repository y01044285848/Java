package sub1;

/*
 * 날짜 : 2024/01/02
 * 이름 : 이승윤 
 * 내용 : Java 클래스 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		Car sonata = new Car();
		
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante;
		avante = new Car();
		
		avante.name = "아반테";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(30);
		avante.show();
	}
}
