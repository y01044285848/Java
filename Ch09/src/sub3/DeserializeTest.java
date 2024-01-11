package sub3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2024/01/11
 * 이름 : 이승윤
 * 내용 : Java 역직렬화 실습
 */
public class DeserializeTest {
	public static void main(String[] args) {
		
		String target = "C:\\Users\\java\\Desktop\\Apple.txt";
		
		try {
			//객체 직렬화를 위한 스트림 생성
			FileInputStream fis = new FileInputStream(target);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			ois.close();
			fis.close();
			
			
		}catch(Exception e) {
			
		}
		System.out.println("프로그램 종료.");
	}
}
