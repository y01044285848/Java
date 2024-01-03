package sub4;

public class Account {
	
	public Account(String bank, String id, String name, int balance) {
		this.balance = balance;
		this.bank = bank;
		this.id = id;
		this.name = name;
	}
	
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	
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
	
}
