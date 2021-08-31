package jihee;

import java.util.ArrayList;
import java.util.Scanner;

public class Jihee_Student {

	public static void main(String[] args) {

		String studentNum, name, add, phoneNum;
		ArrayList<StudentDTO> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("--- 설지희 학생 관리 프로그램 ---");
		while(true) {
			System.out.println("1.등록 2.목록 3.종료");
			System.out.print(">>>>");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.print("학번입력: ");
				studentNum = sc.next();
				System.out.print("이름입력: ");
				name = sc.next();
				System.out.print("주소입력: ");
				add = sc.next();
				System.out.print("전화번호 입력: ");
				phoneNum = sc.next();
				
				StudentDTO stu = new StudentDTO();
				stu.setStudentNum(studentNum);
				stu.setName(name);
				stu.setAdd(add);
				stu.setPhoneNum(phoneNum);
				
				list.add(stu);
				
				break;
			case 2:
				System.out.println("--- 학생 목록 보기 ---");
				for(int i=0; i<list.size(); i++) {
					System.out.println("학번: " + list.get(i).getStudentNum());
					System.out.println("이름: " + list.get(i).getName());
					System.out.println("주소: " + list.get(i).getAdd());
					System.out.println("전화번호: " + list.get(i).getPhoneNum());
					System.out.println("======================");
				}
				System.out.println("1.삭제  2.수정  3.뒤로가기");
				System.out.print(">>>>");
				num = sc.nextInt();
				while(true) {
					switch(num) {
					case 1:
						System.out.println("삭제하려는 회원의 이름을 입력하시오.");
						System.out.print(">>>>");
						String reName = sc.next();
						break;
					case 2:break;
					case 3:
						return;
					}
				}
				
				
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

}
