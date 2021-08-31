package juyeong;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_ArrayL {
	private ArrayList<StDTO> list;
	private Scanner input;
	private String stNum;
	private String name;;
	private int age;

	public Student_ArrayL() {
		list = new ArrayList<StDTO>();
		input = new Scanner(System.in);
	}

	public void m() {
		int num;
		int i;
		int index=0;
		while(true) {
			System.out.println("1.등록 2.검색 3.수정 4.삭제 5.전체보기 6.나가기");
			num = input.nextInt();
			switch(num) {
			case 1:
				StDTO dto = new StDTO();
				boolean bool = true;
				if(list.size() != 0) {
					while(bool) {
						System.out.println("학번을 입력하세요: ");
						dto.setStNum( input.next() );
						
						index = StSearch( dto.getStNum() );
						if(index != -1) {
							System.out.println("이미 존재하는 학번 입니다.");
						}
						if(index == -1) {
							bool = false;
						}
					}
				}else {
					System.out.println("학번을 입력하세요: ");
					dto.setStNum( input.next() );
				}
				System.out.println("이름을 입력하세요: ");
				name = input.next();
				dto.setName(name);

				System.out.println("나이를 입력하세요: ");
				dto.setAge( input.nextInt() );

				list.add(dto);

				System.out.println("저장이 완료되었습니다.");
				break;
			case 2:
				System.out.println("검색 학번 입력: ");
				stNum = input.next();
				
				index = StSearch(stNum);
				
				if(index != -1) {
					System.out.println("학번 : "+list.get(index).getStNum());
					System.out.println("이름 : "+list.get(index).getName());
					System.out.println("나이 : "+list.get(index).getAge());
					System.out.println("---------------------");
				}
				if(index==-1 ) {
					System.out.println("입력하신 학번이 존재하지 않습니다.");
				}

				break;
			case 3:
				System.out.println("수정 학번 입력: ");
				stNum = input.next();
				
				index = StSearch(stNum);
				
				if(index != -1) {
					StDTO d = list.get(index);
					
					System.out.println("수정할 이름 입력: ");
					d.setName( input.next() );
					System.out.println("수정할 나이 입력: ");
					d.setAge( input.nextInt() );
					System.out.println("수정 완료되었습니다");
				}
				
				if(index == -1 ) {
					System.out.println("입력하신 학번이 존재하지 않습니다.");
				}

				break;
			case 4:
				System.out.println("삭제 학번 입력: ");
				stNum = input.next();
				index = StSearch(stNum);
				if(index != -1) {
					list.remove(index);
					System.out.println("삭제 되었습니다");
				}
				if(index == -1) {
					System.out.println("입력하신 학번이 존재하지 않습니다.");
				}
				break;
			case 5:
				System.out.println("--- 모든 정보 보기 ---");
				for(i=0 ; i<list.size() ; i++) {
					System.out.println("학번 : "+list.get(i).getStNum());
					System.out.println("이름 : "+list.get(i).getName());
					System.out.println("나이 : "+list.get(i).getAge());
					System.out.println("---------------------");
				}
				break;
			case 6:return;
			}
		}
	}
	public int StSearch(String stNum) {
		int i;
		for( i=0; i<list.size() ;i++) {
			StDTO d = list.get(i);
			if(stNum.equals( d.getStNum()) ) {
				return i;
			}
		}
		return -1;
	}
}

