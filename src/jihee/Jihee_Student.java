package jihee;

import java.util.ArrayList;
import java.util.Scanner;

public class Jihee_Student {

	
	public static void main(String[] args) {

		String studentNum, name, add, phoneNum;
		String a;
		ArrayList<StudentDTO> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("--- 설지희 학생 관리 프로그램 ---");
		while(true) {
			System.out.println("1.등록하기 2.목록보기 3.수정");
			System.out.println("4.삭제하기 5.검색하기 6.종료");
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
				if(list.size() == 0) {
					System.out.println("등록 된 회원정보가 없습니다.\n등록을 먼저 진행하세요.");
				}else {
				System.out.println("--- 전체학생 목록 보기 ---");
					for(int i=0; i<list.size(); i++) {
						System.out.println("학번: " + list.get(i).getStudentNum());
						System.out.println("이름: " + list.get(i).getName());
						System.out.println("주소: " + list.get(i).getAdd());
						System.out.println("전화번호: " + list.get(i).getPhoneNum());
						System.out.println("======================");
					}
				}
				break;
				
				
			case 3: 
				System.out.println("");
				break;
				
			case 4: 
				
				if(list.size() == 0) {
					System.out.println("등록 된 회원정보가 없습니다.\n등록을 먼저 진행하세요.");
				}else {
				System.out.println("삭제할 학생의 이름을 입력하세요.");
				System.out.print(">>>>");
				a = sc.next();
				for(int i=0; i<list.size(); i++) {
				if(a.equals(list.get(i).getName())) {
					System.out.println("*** 삭제가 완료된 항목 ***");
					System.out.println("학번: " + list.get(i).getStudentNum());
					System.out.println("이름: " + list.get(i).getName());
					System.out.println("주소: " + list.get(i).getAdd());
					System.out.println("전화번호: " + list.get(i).getPhoneNum());
					System.out.println("=======================");					
					System.out.println("위 내용이 삭제 완료되었습니다.");
					list.remove(list.get(i));
					break;
				}else {
					System.out.println("존재하지 않는 회원입니다.");
				}
				}
				}
				break;
			case 5: break;
			case 6: 
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

}
