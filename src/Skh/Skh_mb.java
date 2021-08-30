package Skh;

import java.util.ArrayList;
import java.util.Scanner;

public class Skh_mb {
	
	
	public void print() {
		Scanner input = new Scanner(System.in);
		ArrayList<StDTO> arr = new ArrayList<StDTO>();
		
		int su = 0;
		while(true) {
			System.out.println("1.등록 2.보기 3.삭제 4.종료");
			int num = input.nextInt();
			switch(num) {
			
			case 1 : System.out.print("학생 이름을 입력하시오 : ");
			StDTO dto = new StDTO();
			String name = input.next();
			dto.setName(name);
			System.out.print("학생 학번을 입력하시오 : ");
			String stNum = input.next();
			dto.setStNum(stNum);
			arr.add(dto);
			
			
			
				break;
			case 2 : for(int i=0;i<arr.size();i++) {
				System.out.println("학생 : "+arr.get(i).getName());
				
				System.out.println("학번 : "+arr.get(i).getStNum());
				System.out.println("=========================");
			}
				
				break;
			case 3 : System.out.println("종료합니다."); return;
			}
		}
	}
}
