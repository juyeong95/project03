package juyeong;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import juyeong.StDTO;

public class Student_hashmap {
			private String stNum;
			private String name;
			private int age;

			Scanner input = new Scanner(System.in);
			HashMap<String, StDTO> map = new HashMap<String, StDTO>();
			
			public void m() {
				int num;
				
				System.out.println("학생 관리 프로그램을 실행합니다.");
				
				while(true) {
					System.out.println("1.등록 2.검색 3.수정 4.삭제 5.전체보기 6.나가기");
					System.out.print(">>>");
					num=input.nextInt();
					switch(num) {
					case 1:
						System.out.println("학번 등록: ");
						stNum=input.next();
						System.out.println("이름 등록: ");
						name=input.next();
						System.out.println("나이 등록: ");
						age=input.nextInt();
						
						StDTO dto = new StDTO();
						
						if(map.containsKey(stNum)) {
							System.out.println("이미 존재하는 학번입니다 다시 입력하세요.");
							}
						else {
							dto.setStNum(stNum); dto.setName(name);
							dto.setAge(age); map.put(stNum, dto);
							System.out.println("등록 완료!!");
						} 
					
						break;
					case 2:
						System.out.println("검색 할 학번 입력: ");
						System.out.print(">>>");
						stNum=input.next();
						
						if(map.containsKey(stNum)) {
							System.out.println("학번 :"+map.get(stNum).getStNum());
							System.out.println("이름 :"+map.get(stNum).getName());
							System.out.println("나이 :"+map.get(stNum).getAge());
						}else {
							System.out.println("입력하신 학번은 존재하지 않습니다.");
						}
						
						
						break;
					case 3:
						System.out.println("수정 할 학생의 학번 입력: ");
						System.out.print(">>>");
						stNum=input.next();
					
						if(map.containsKey(stNum)) {
							//System.out.println("학번 입력: ");
							//map.get(stNum).setStNum(input.next());
							System.out.println("이름 입력: ");
							map.get(stNum).setName(input.next());
							System.out.println("나이 입력: ");
							map.get(stNum).setAge(input.nextInt());
						}else {
							System.out.println("입력하신 학번은 존재하지 않습니다.");
						}
						break;
					case 4:
						System.out.print("삭제할 학번 입력: ");
						stNum = input.next();
						map.remove(stNum);
						System.out.println("삭제 완료");
						break;
					case 5:
						Iterator<String> it = map.keySet().iterator();
						
						System.out.println("----학생 정보 확인-----");
						while(it.hasNext()) {
							StDTO s = map.get( it.next() );
							System.out.println("학번 : "+s.getStNum());
							System.out.println("이름 : "+s.getName());
							System.out.println("나이 : "+s.getAge());
							System.out.println("---------------");
						}
						break;
					
					case 6:
						return;
					}
				}
			}
			
}

