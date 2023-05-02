package inteface;

/*
 * casting 
 * = 형 변환
 * 
 * up casting
 * ; 부모 형태로 변환하는 것
 * ; 코드를 보다 간결하게 줄일 수 있음.
 * 
 * down casting
 * ; 부모->자신으로 변환하는 것
 */

class Parents{
	public void familyName() {
		System.out.println("이");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}

class Daugther extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}

class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		/* 각각의 객체 형성하여 호출
		Parents p = new Parents();
		p.name();
		
		Daugther d = new Daugther();
		d.name();
		
		Son s = new Son();
		s.name();
		*/
		
		// 업캐스팅 - 부모형태로 자식들을 받음
		// 			자식을 부모형태로 저장함
		Parents p = new Parents();
		p.name();
		p = new Daugther();
		p.name();
		p = new Son();
		p.name();		
	}
}
