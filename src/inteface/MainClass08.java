package inteface;

import java.util.Scanner;

// 각각의 파일로 클래스, 인터페이스 형성

public class MainClass08 {
	public static void main(String[] args) {
		/*
		A08지상군 a = new A08지상군();
		B08공군 b = new B08공군();
		*/
		
		Unit08 u = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("적이 공격합니다.");
		System.out.println("1. 지상군 2. 공군");
		int num = scan.nextInt();
		
		if(num==1) {
			u = new A08지상군();
			// 업캐스팅
			System.out.println("지상군 선택");
		}else {
			u = new B08공군();
			System.out.println("공군 선택");
		}
		
		System.out.println("1. 공격 2. 방어");
		int choice = scan.nextInt();
		
		if(choice==1) {
			u.attack();
		}else {
			u.defense();
		}
		
		/*
		if(num==1 && choice==1) {
			a.attack();
		} else if(num==1 && choice==2) {
			a.defense();
		}
		
		if(num==2 && choice==1) {
			b.attack();
		} else if(num==2 && choice==2) {
			b.defense();
		}
		*/
	}
}
