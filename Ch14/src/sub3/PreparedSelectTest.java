package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/*
 * 날짜 : 2024/01/22
 * 이름 : 이승윤
 * 내용 : JDBC prepared statement 실습하기
 * 
 * PreparedStatement
 * - 기존 Statement 보다 향상된 동적 SQL 생성을 위한 Statement
 * - Query Parameter를 사용해서 값을 Mapping(사상, 바인딩) 시켜 쿼리를 실행
 * 
 * VO(Value Object) 객체
 * - select의 결과 테이블의 속성을 갖는 객체
 * - 테이블 객체(Entity)를 객체(Object)로 변환할 때 사용하는 객체
 * - JSP, Spring에서는 DTO(Data Transfer Object)로 사용
 * 
 */
public class PreparedSelectTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "sysh58";
		String pass = "abc1234";
		List<User4VO> users = new ArrayList<>();
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			// 3단계 - SQL 실행 객체 생성
			String sql = "SELECT * FROM `User4`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 4단계 - SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			// 5단계 - 결과처리(SELECT)
			while(rs.next()) {
				
				User4VO vo = new User4VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setGender(rs.getString(3));
				vo.setAge(rs.getInt(4));
				vo.setHp(rs.getString(5));
				vo.setAddr(rs.getString(6));

				users.add(vo);
			}
			
			for(User4VO a : users) {
				System.out.println(a);
			}
			
			// 6단계 - 데이터베이스 종료
			rs.close();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
