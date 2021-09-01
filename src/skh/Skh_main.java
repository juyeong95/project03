package skh;

import java.util.ArrayList;
import java.util.Scanner;

public class Skh_main {
	int num;
	ArrayList<Student> arr = new ArrayList<Student>();
	public void display() {
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.println("1.등록 2.삭제 3.수정 4.찾기 5.전체보기 6.종료");
		num = input.nextInt();
		Student st = new Student();
		String stNum=null;
		String name=null;
		String address=null;
		String phNum=null;
		int i =0;
		switch(num) {
		
		case 1 :
			
			while(true) {
				
			System.out.println("학번을 입력하세요");
			stNum = input.next();
			for(i=0; i<arr.size();i++) {
			if((arr.get(i).getStNum()).equals(stNum)) {
				System.out.println("이미 등록된 학번입니다.");
				break;
				}
			}
			if(arr.size()==i) {
				break;
				
			}
			}
			System.out.println("이름을 입력하세요");
			name = input.next();
			
			System.out.println("주소를 입력하세요");
			address = input.next();
			
			System.out.println("전화번호를 입력하세요");
			phNum = input.next();
			
			
			
			st.setStNum(stNum);
			st.setAdress(address);
			st.setName(name);
			st.setPhNum(phNum);
			
			arr.add(st);
			
			
			break;
		case 2 :
			
			System.out.println("삭제할 학번을 입력하세요");
			stNum = input.next();
			for(i=0; i<arr.size();i++) {
				if((arr.get(i).getStNum()).equals(stNum)) {
					arr.remove(i);
					i--;
					System.out.println("삭제가 완료되었습니다.");
					break;
				}	
			}
			if(arr.size()==i) {
				System.out.println("입력하신 학번은 없습니다.");
				
			}
			
			
			break;
				
			
		case 3 :
			System.out.println("수정할 학번을 입력하세요");
			stNum = input.next();
			for(i=0; i<arr.size();i++) {
				if((arr.get(i).getStNum()).equals(stNum)) {
					System.out.println("수정할 이름을 입력하세요");
					name = input.next();
					arr.get(i).setName(name);
					System.out.println("수정할 주소를 입력하세요");
					address = input.next();
					arr.get(i).setAdress(address);
					System.out.println("수정할 전화번호를 입력하세요");
					phNum = input.next();
					arr.get(i).setPhNum(phNum);
					System.out.println("수정이 완료되었습니다.");
					
					
				}	
			}
			
			break;
		case 4 :
			
			System.out.println("조회할 학번을 입력하세요");
			stNum = input.next();
			
			for(i=0; i<arr.size();i++) {
				if((arr.get(i).getStNum()).equals(stNum)) {
					System.out.println("학번 : "+ arr.get(i).getStNum());
					System.out.println("이름 : "+ arr.get(i).getName());
					System.out.println("주소 : "+ arr.get(i).getAdress());
					System.out.println("번호 : "+ arr.get(i).getPhNum());
					break;
				}	
			}
			if(arr.size()==i) {
				System.out.println("입력하신 학번은 없습니다.");
				
			}
			
			
			
			break;
		case 5 :
			for(i=0; i<arr.size();i++) {
			System.out.println("학번 : " +arr.get(i).getStNum());
			System.out.println("이름 : " +arr.get(i).getName());
			System.out.println("주소 : " +arr.get(i).getAdress());
			System.out.println("전화번호 : " +arr.get(i).getPhNum());
			System.out.println("==================================");
			}
			break;
		case 6 :System.out.println("종료합니다."); return;
		}
		}
	}
}

