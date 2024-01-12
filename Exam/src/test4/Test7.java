package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2024/01/12
 * 이름 : 이승윤
 * 내용 : 로또번호 연습문제
 * 
 */
public class Test7 {
	public static void main(String[] args) {
		
		for(int count = 1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto() {
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int)Math.ceil(Math.random() * 45);
			lottoSet.add(num);
			if(lottoSet.size() == 6) {
				break;
			}
		}
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
	
}
