package sub4;
/*
 * 날짜 : 2023/12/28
 * 이름 : 이승윤
 * 내용 : Ch03, Java 반복문
 */

public class WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		// 1부터 10까지 홀수합
		
		sum = 0;
		k = 1;
		
		while(k <= 10) {
			sum += k;
			k+=2;
		}
		System.out.println("1부터 10까지 홀수 합 : " + sum);
		
		// do-while문
		
		sum = 0;
		k = 1;
		do {
			if(k%2==0) sum+=k;
			k+=1;
		}while(k<=10);
		System.out.println("1부터 10까지 짝수 합 : " + sum);
		// break
		
		int num = 1;
		while(true) {
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : " + num);
		// continue
		
		int total = 0;
		int n = 1;
		while(n<=10) {
			n++;
			if(n % 2 == 1) {
				continue;
			}
			total += n;
			
		}
		System.out.println("1부터 10까지 짝수 합 : " + total);
		
	}
}
