package juyeong;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import juyeong.StDTO;

public class Student_hashmap {
		private String name,addr,numb,pnumb;
		Scanner input = new Scanner(System.in);
		HashMap<String, StDTO> map = new HashMap<String, StDTO>();
			public void m() {
				int num;
				System.out.println("학생 관리 프로그램을 실행합니다.");
				
				while(true) {
					System.out.println("1.등록 2.전체 확인 3.검색 4.수정 5.삭제 6.종료");
					System.out.print(">>>");
					num=input.nextInt();
					switch(num) {
					case 1:
						c1();
						break;
					case 2:
						c2();
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					case 5:
						break;
					
					case 6:
						System.out.print("프로그램을 종료합니다.");
						System.exit(0);
				}
				}
			}
			public void c1() {
				
				
				System.out.println("이름 등록: ");
				name=input.next();
				System.out.println("학번 등록: ");
				numb=input.next();
				System.out.println("주소 등록: ");
				addr=input.next();
				System.out.println("전화번호 등록: ");
				pnumb=input.next();
				
				StDTO dto = new StDTO();
				dto.setName(name); dto.setpNum(pnumb);
				dto.setNumb(numb); dto.setAddr(addr);
				
				map.put(name,dto);
				
			}
			
			public void c2() {
				System.out.println("----학생 정보 확인-----");
				Iterator<String> it = map.keySet().iterator();
				while(it.hasNext()) {
					StDTO s = map.get( it.next() );
					System.out.println("학번    : "+s.getNumb());
					System.out.println("이름    : "+s.getName());
					System.out.println("주소    : "+s.getAddr());
					System.out.println("전화번호 : "+s.getpNum());
					System.out.println("---------------");
				}
			}
			
}

