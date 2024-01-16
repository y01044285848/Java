package sub4;

import java.util.Collections;
import java.util.List;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이승윤
 * 내용 : 자바 컬렉션 스트림 필터 실습하기
 */
public class FilterStreamTest {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println(numbers);
		
		// 중복 제거
		numbers.stream().distinct().forEach(num->System.out.print(num + ", "));
		System.out.println();
		
		// 5이상 데이터 필터링
		numbers.stream().filter(num -> num>=5).forEach(num->System.out.print(num + ", "));
		System.out.println();
		
		//중복 제거, 짝수만 출력
		numbers
		.stream()
		.sorted(Collections.reverseOrder())
		.distinct()
		.filter(num -> num%2==0)
		.forEach(num->System.out.print(num + ", "));
	}
}
