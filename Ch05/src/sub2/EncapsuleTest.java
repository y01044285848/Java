package sub2;

/*
 * 날짜 : 2024/01/02
 * 이름 : 이승윤
 * 내용 : JAVA 클래스 실습하기
 */
public class EncapsuleTest {
	public static void main(String[] args) {

		Car sonata = new Car("소나타", "흰색", 10);

		// 취약코드, 속성을 직접 참조 및 값 입력
		// 캡슐화된 속성에 대한 초기화는 생성자에서 수행
		// sonata.name = "소나타";
		// sonata.color = "흰색";
		// sonata.speed = 10;

		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//캡슐화된 속성에 대한 수정을 위해 setter 호출
		sonata.setColor("회색");
		sonata.show();
		
		
		// Account 객체 생성 및 초기화
		Account kb = new Account("국민은행","101-12-1234","김유신",10000);
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
	}
}
