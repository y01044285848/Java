package sub1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 날짜 : 2024/01/11
 * 이름 : 이승윤
 * 내용 : Java 데이터 입출력 스트림 실습
 */
public class ReaderTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\java\\Desktop\\Test1.txt";
		String target = "C:\\Users\\java\\Desktop\\Test2.txt";
		
		try {
			FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(target);
			
			while(true) {
				
				// 파일 읽기
				int data = fr.read();
				
				if(data == -1) {
					// 파일 모두 읽었을 때 반복 종료.
					break;
				}
				
				char ch = (char) data;
				
				//System.out.print(data);
				//System.out.println();
				System.out.print(ch);
				
				fw.write(data);
				
			}
			fr.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
