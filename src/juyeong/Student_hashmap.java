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
						dto.setStNum(stNum); dto.setName(name);
						dto.setAge(num); 
						
						map.put(stNum,dto);
						System.out.println("등록 완료!!");
						break;
					case 2:
						System.out.println("검색 할 학번 입력: ");
						System.out.print(">>>");
						stNum=input.next();
						Iterator<String> it = map.keySet().iterator();
						for(int i=0; i<map.size(); i++) {
							if(stNum.contentEquals(map.get(i).getStNum())){
								System.out.println("학번: "+map.get(i).getStNum());
								System.out.println("이름: "+map.get(i).getName());
								System.out.println("나이: "+map.get(i).getAge());
							}else {
								System.out.println("존재하지 않는 학번 입니다.");
							}
						}
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					case 5:
						Iterator<String> it1 = map.keySet().iterator();
						
						System.out.println("----학생 정보 확인-----");
						while(it1.hasNext()) {
							StDTO s1 = map.get( it1.next() );
							System.out.println("학번 : "+s1.getStNum());
							System.out.println("이름 : "+s1.getName());
							System.out.println("나이 : "+s1.getAge());
							System.out.println("---------------");
						}
						break;
					
					case 6:
						return;
					}
				}
			}
			/*public int StSearch(String stNum) {
				int i;
				for( i=0; i<map.size() ;i++) {
					StDTO d = map.get(i);
					if(stNum.equals( d.getStNum()) ) {
						return i;
					}
				}
				return -1;
			}
				*/	
}

