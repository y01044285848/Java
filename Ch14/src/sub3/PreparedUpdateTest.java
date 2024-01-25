package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/01/23
 * 이름 : 이승윤
 * 내용 : JDBC prepared statement 실습하기
 */
public class PreparedUpdateTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "sysh58";
		String pass = "abc1234";
		
		try {
			// 1단계 - 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 연결
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			// 3단계 - SQL 작성
			String sql = "UPDATE `User1` set `hp` = ?, `age` = ? where `uid` = ?"; // query parameter
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-1005");
			psmt.setInt(2, 35);
			psmt.setString(3, "B101");

			//4단계 - SQL 실행
			psmt.executeUpdate();
			
			//5단계 - 결과처리
			
			//6단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
		
	}
}
