package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {

	private static List<Account> accounts = new ArrayList<>(); // 객체를 저장해 계좌 정보 검색에 사용할 수 있도록 만듦
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			// 내용
			int target = 0;
			try {
				target = Integer.parseInt(sc.nextLine());
			}catch(Exception e) {
				System.out.println("숫자로 입력해 주세요.");
			}
			
			
			switch (target) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("다시 선택해 주세요.");

			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");

		System.out.print("계좌 번호: ");
		String ano = sc.nextLine();

		System.out.print("계좌주: ");
		String owner = sc.nextLine();

		System.out.print("초기 입금액: ");
		int balance = Integer.parseInt(sc.nextLine());

		Account ac = new Account(ano, owner, balance);
		accounts.add(ac);
		System.out.println("결과: 계좌가 생성되었습니다.");

	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		for (Account ac : accounts) {
			System.out.println(ac);
		}
	}

	// 예금하기
	private static void deposit() {

		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");

		System.out.print("계좌번호: ");
		String targetAno = sc.nextLine();

		System.out.print("예금액: ");
		int deposit = Integer.parseInt(sc.nextLine());

		Account ac;
		try {
			ac = findAccount(targetAno);
			ac.setBalance(ac.getBalance() + deposit);
		} catch (NullPointerException e) {
			System.out.println("등록된 계좌가 없습니다.");
		}

	}

	// 출금하기
	private static void withdraw() {

		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");

		System.out.print("계좌번호: ");
		String targetAno = sc.nextLine();

		System.out.print("출금액: ");
		int withdraw = Integer.parseInt(sc.nextLine());

		Account ac;
		try {
			ac = findAccount(targetAno);
			ac.setBalance(ac.getBalance() - withdraw);
		} catch (NullPointerException e) {
			System.out.println("등록된 계좌가 없습니다.");
		}
	}

	// Account 리스트에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {

		for (Account ac : accounts) {
			if (ac.getAno().equals(ano)) {
				return ac;
			}
		}
		return null;
	}
}