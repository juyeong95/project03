package main;

import java.util.Scanner;

import Skh.Skh_mb;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Skh_mb skh = new Skh_mb();
		int num;
		while(true) {
			System.out.println("1.이주영님 2.성기룡님 3.설지희님 4.서광훈님 5.송영관님");
			num=input.nextInt();
			switch(num) {
			case 1:break;
			case 2:break;
			case 3:break;
			case 4: skh.print();
				break;
			case 5: break;
			}
		}
	}
}
