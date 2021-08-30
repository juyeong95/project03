package juyeong;

import java.util.ArrayList;
import java.util.Scanner;

import juyeong.StDTO;

public class Student_arraylist {
	private int kor,eng,mat;
	private double avg;
	private String name;
	Scanner input = new Scanner(System.in);
	ArrayList<StDTO> list = new ArrayList<StDTO>();
		public void m() {
			int num;
			System.out.println("성적 관리 프로그램을 실행합니다.");
			
			while(true) {
				System.out.println("1.등록 2.성적확인 3.등수확인 4.등급확인 5.종료");
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
					c3();
					break;
				case 4:
					c4();
					break;
				case 5:
					System.out.print("프로그램을 종료합니다.");
					System.exit(0);
				}
			}
			
		}
		public void c1() {
			
			
			System.out.println("이름 등록: ");
			name=input.next();
			System.out.println("국어 성적 등록: ");
			kor=input.nextInt();
			System.out.println("영어 성적 등록: ");
			eng=input.nextInt();
			System.out.println("수학 성적 등록: ");
			mat=input.nextInt();
			
			avg=(kor+eng+mat)/3;
			StDTO dto = new StDTO();
			dto.setName(name);
			dto.setKor(kor); dto.setEng(eng); dto.setMat(mat);
			dto.setAvg(avg);
			
			list.add(dto);
			
		}
		
		public void c2() {
			System.out.println("전체 성적 확인");
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i).getName()+" 학생\n");
				System.out.print("국어: "+list.get(i).getKor()+"점 ");
				System.out.print("영어: "+list.get(i).getEng()+"점 ");
				System.out.print("수학: "+list.get(i).getMat()+"점 ");
				System.out.print("평균: "+list.get(i).getAvg()+"점 ");
				System.out.println("\n");
			}
		}
		public void c3() {
			for(int i=0;i<list.size();i++) {
				int rank =1;
				for(int j=0;j<list.size();j++){
					if(list.get(i).getAvg()<list.get(j).getAvg()) {
						rank++;
					}
				}
				list.get(i).setRank(rank);
			}
			for(int i=0; i<list.size();i++) {
				System.out.println(list.get(i).getName()+" 학생 "
			+list.get(i).getRank()+"등");
				
			}
		}
		public void c4() {
			
			for(int i=0;i<list.size();i++) {
				char grade;
				int n = (int)(list.get(i).getAvg())/10;
				switch(n) {
				case 10:
				case 9:
					grade = 'A';
					list.get(i).setGrade(grade);
					continue;
				case 8:
					grade = 'B';
					list.get(i).setGrade(grade);
					continue;
				case 7:
					grade = 'C';
					list.get(i).setGrade(grade);
					continue;
				case 6:
					grade = 'D';
					list.get(i).setGrade(grade);
					continue;
				default:
					grade = 'F';
					list.get(i).setGrade(grade);
					continue;
				}
			}
			for(int i=0; i<list.size();i++) {
				System.out.println(list.get(i).getName()+" 학생 "
			+list.get(i).getGrade()+"등급");
				
			}
		}
}











