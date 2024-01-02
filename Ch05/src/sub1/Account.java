package sub1;
/*
 * 날짜 : 2024/01/02
 * 이름 : 이승윤
 * 내용 : JAVA 클래스 실습하기
 */
public class Account {
	
	//속성
	String bank;
	String id;
	String name;
	int balance;
	
	//기능
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("예금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
	}
	
	public static void main(String[] args) {
		//Account 객체 생성/초기화/상호작용
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "101-12-1234";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
	}
	
}
