package inteface;

//실제 작업시 메인을 제외한 나머지 클래스 파일은 따로 생성해야 함.

interface Unit07{
	public void attack();
	public void defense();
	// 공통작업
}

class A07 implements Unit07{
	public void attack() {
		System.out.println("지상군이 공격합니다.");
	}

	public void defense() {
		System.out.println("지상군이 방어합니다.");
	}
	public void attack1() {}
	public void attack2() {}
}

public class MainClass07 {
	public static void main(String[] args) {
		Unit07 a = new A07();
		a.attack();
		a.defense();
		// 동일한 이름의 기능을 생성하더라도 업캐스팅으로 받으면
		// 공통으로 작업하기로 한 작업만 보임 
		// 새로 만든 기능과 공통 기능의 구분 가능
	}
}
