package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2024/01/11
 * 이름 : 이승윤
 * 내용 : Properties 실습
 * 
 * 프로포티(properties)
 * - 문자열 데이터만 취급하는 key-value 자료구조 클래스
 * - 직렬화, 역직렬화를 이용해 데이터를 입출력하는 자료구조 클래스
 */
public class PropertiesTest {
	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		// 반드시 파일 확장자는 properties로
		String target = "C:\\Users\\java\\Desktop\\Fruit.properties";
		
		try {
			FileOutputStream fos = new FileOutputStream(target);
			// 직렬화
			prop.store(fos, null);
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 프로퍼티 읽기(역직렬화)
		String source = "C:\\Users\\java\\Desktop\\City.properties";
		
		Properties propCity = new Properties();
		try {
			FileInputStream fis = new FileInputStream(source);
			propCity.load(fis);
			
			// 스트림 해제
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(propCity);
		System.out.println(propCity.getProperty("101"));
		System.out.println(propCity.getProperty("102"));
		System.out.println(propCity.getProperty("103"));
		
		
		
		System.out.println("프로그램 종료...");
		
	}
}
