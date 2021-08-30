package seeon;

import java.util.ArrayList;
import java.util.Scanner;


public class seoon_arraylist {
	public void arraylist() {
		Scanner sc = new Scanner(System.in);
		ArrayList<StDTO> list = new ArrayList<StDTO>();
		String name, major;
		int age, id = 0, phone;
		int num;
		int i =0;
		boolean flag;
		
		while(true) {
			System.out.println("=========학생 관리 프로그램========");
			System.out.println("1. 등록\n2. 확인\n3. 수정\n4. 삭제\n5. 종료");
			System.out.print(">>>>>>");
			num = sc.nextInt();
			StDTO dto = new StDTO();
			flag = true;

			switch(num) {
			case 1: 
				System.out.print("학생명 입력 : ");
				name = sc.next();
				System.out.print("학번 입력 : ");
				id = sc.nextInt();
				System.out.print("전공 입력 : ");
				major = sc.next();
				System.out.print("나이 입력 : ");
				age = sc.nextInt();	
				for( i = 0; i < list.size(); i++) {
					if(list.get(i).getId() == id) {
						System.out.println("이미 존재하는 학번입니다 다시 입력하세요.");
						flag = false;
						break;
					}
				}
				if(flag == true) {
				dto.setName(name);
				dto.setId(id);
				dto.setMajor(major);
				dto.setAge(age);
				list.add(dto);
				}
				break;
			
			case 2:
				System.out.println("1. 전체 학생 보기\n2. 학번으로 찾기");
				num = sc.nextInt();
				
				switch(num) {
				case 1:
					for(i = 0; i < list.size(); i++) {
						System.out.println("----------------------");
						System.out.println("이름 : " + list.get(i).getName());
						System.out.println("학번 : " + list.get(i).getId());
						System.out.println("전공 : " + list.get(i).getMajor());
						System.out.println("나이 : " + list.get(i).getAge());
						System.out.println("----------------------");
					}
					break;
					
				case 2:
					System.out.println("학번 입력 : ");
					id = sc.nextInt();
					for( i = 0; i < list.size(); i++) {
						if(list.get(i).getId() == id) {
							System.out.println("----------------------");
							System.out.println("이름 : " + list.get(i).getName());
							System.out.println("학번 : " + list.get(i).getId());
							System.out.println("전공 : " + list.get(i).getMajor());
							System.out.println("나이 : " + list.get(i).getAge());
							System.out.println("----------------------");
						}
					}
					break;
				}
				break;
				
			case 3:
				System.out.print("수정할 학생의 학번을 입력하세요 : ");
				id = sc.nextInt();
				for( i = 0; i < list.size(); i++) {
					if(list.get(i).getId() == id) {
					System.out.print("학생명 입력 : ");
					dto.setName(sc.next());
					System.out.print("전공 입력 : ");
					dto.setMajor(sc.next());
					System.out.print("나이 입력 : ");
					dto.setAge(sc.nextInt());	
					}
				}
				break;
			
			case 4:
				System.out.print("삭제할 학생의 학번을 입력하세요 : ");
				id = sc.nextInt();
				for( i = 0; i < list.size(); i++) {
					if(dto.getId() == id) list.remove(i);
				}
				System.out.println("삭제되었습니다.");
				break;
				
			case 5:
				seoon so = new seoon();
				so.seoon();
			}
		}
	}
}
