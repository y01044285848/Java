package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2024/01/11
 * 이름 : 이승윤
 * 내용 : Java 데이터 입출력 스트림 실습
 */
public class BufferIOTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\java\\Desktop\\Java.zip";
		String target = "C:\\Users\\java\\Desktop\\JavaCopy.zip";
		
		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조 스트림 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				
				// 파일 읽기
				int data = bis.read();
				
				if(data == -1) {
					// 파일 모두 읽었을 때 반복 종료.
					break;
				}
				
				//char ch = (char) data;
				
				//System.out.print(data);
				//System.out.println();
				//System.out.print(ch);
				
				bos.write(data);
				
			}
			// 보조 스트림 해제
			bos.flush(); // 버퍼 비우기
			bis.close();
			bos.close();
			
			// 파일 입출력 스트림 해제
			fis.close();
			fos.close();

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("종료");
		
	}
}
