package juyeong;

import java.util.Scanner;

public class Student {
	Scanner input= new Scanner(System.in);
	public void m() {
		Student_hashmap h = new Student_hashmap();
		Student_ArrayL a = new Student_ArrayL();
		System.out.println("1.Arraylist Ver 2.Hashmap Ver");
		int num=input.nextInt();
		switch(num) {
		case 1:
			a.m();
			break;
		case 2:
			h.m();
			break;
		}
	}
}