package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/01/22
 * 이름 : 이승윤
 * 내용 : JDBC select 실습하기
 */

public class SelectTest {
	public static void main(String[] args) {

		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "sysh58";
		String pass = "abc1234";
		
		// 결과처리용 리스트
		List<User1> users = new ArrayList<>();

		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);

			// 3단계 - Statment 객체 생성
			Statement stmt = conn.createStatement();

			// 4단계 - SQL 실행
			String sql = "select * from user1";
			ResultSet rs = stmt.executeQuery(sql);

			// 5단계 - 결과처리 (SELECT)
			while (rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String hp = rs.getString(4);
				int age = rs.getInt(5);
				
				User1 u1 = new User1();
				u1.setUid(uid);
				u1.setName(name);
				u1.setHp(hp);
				u1.setBirth(birth);
				u1.setAge(age);
				
				users.add(u1);

				
			}
			for(User1 a : users) {
				System.out.printf("%s %s %s %s %d\n", a.getUid(), a.getName(), a.getHp(), a.getBirth(), a.getAge());
				System.out.println(a);
			}

			// 6단계 -
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
