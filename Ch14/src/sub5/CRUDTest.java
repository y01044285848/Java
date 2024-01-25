package sub5;

import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2024/01/24
 * 이름 : 이승윤
 * 내용 : JDBC prepared statement 실습하기
 */
public class CRUDTest {
	public static void main(String[] args) {
		System.out.println("회원관리매니저 v1.0");
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택>");
			
			int answer = sc.nextInt();
			UserDAO dao = UserDAO.getInstance();
			
			if (answer == 0) {
				break;
			}else if(answer == 1) {
				
				UserDTO dto = new UserDTO();
				// 입력
				System.out.print("아이디 입력 : ");
				dto.setUid(sc.next());
				
				System.out.print("이름 입력 : ");
				dto.setName(sc.next());
				
				System.out.print("생년월일 입력 : ");
				dto.setBirth(sc.next());
				
				System.out.print("주소 입력 : ");
				dto.setAddr(sc.next());
				
				//UserDAO dao = UserDAO.getInstance();
				dao.insertUser(dto);
				
				System.out.println("등록 완료...");
				
			}else if(answer == 2) {
				
				// 조회
				List<UserDTO> users = dao.selectUsers();
				for(UserDTO user : users) {
					System.out.println(user);
				}
				
			}else if(answer == 3) {
				// 검색
				System.out.print("아이디 검색 : ");
				String uid = sc.next();
				
				UserDTO user = dao.selectUser(uid);
				
				if(user == null) {
					System.out.println("해당하는 아이디를 가진 사용자가 없습니다.");
				}else {
					System.out.println(user);
				}
				
			}else if(answer == 4) {
				
				UserDTO dto = new UserDTO();
				// 수정
				System.out.print("수정 회원 아이디 입력");
				dto.setUid(sc.next());
				System.out.print("수정 회원 이름 입력");
				dto.setName(sc.next());
				System.out.print("수정 회원 생년월일 입력");
				dto.setBirth(sc.next());
				System.out.print("수정 회원 주소 입력");
				dto.setAddr(sc.next());
				
				dao.updateUser(dto);
				
				System.out.println("수정 완료...");
				
			}else if(answer == 5) {
				// 삭제
				System.out.print("삭제할 회원 아이디 입력 : ");
				String uid = sc.next();
				
				dao.deleteUser(uid);
				
			}
		}
		sc.close();
		System.out.println("종료...");
	}
}
