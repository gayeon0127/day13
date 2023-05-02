package inteface;

/*
 * 팀프로젝트 시 코드를 합하는 경우
 */

class A06지상군{
	public void 지상군공격() {
		System.out.println("지상군이 공격합니다.");
	}
	public void 지상군방어() {
		System.out.println("지상군이 방어합니다.");
	}
}

class B06공군{
	public void 미사일장착() {
		System.out.println("미사일을 장착합니다.");
	}
	public void 공군공격() {
		System.out.println("공군이 공격합니다.");
	}
	public void 공군방어() {
		System.out.println("공군이 방어합니다.");
	}
}

public class MainClass06 {
	public static void main(String[] args) {
		A06지상군 a = new A06지상군();
		B06공군 b = new B06공군();
		a.지상군공격(); a.지상군방어();
		b.공군공격(); 	b.공군방어();
	}
}
