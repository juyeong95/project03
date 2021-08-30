package juyeong;

import java.util.Scanner;

public class Student {
	Scanner input= new Scanner(System.in);
	public void m() {
		Student_arraylist j = new Student_arraylist();
		Student_hashmap h = new Student_hashmap();
		System.out.println("1.Arraylist Ver 2.Hashmap Ver 3.성적관리(번외)");
		int num=input.nextInt();
		switch(num) {
		case 1:
			break;
		case 2:
			h.m();
			break;
		case 3:
			j.m();
			break;
		}
	}
}