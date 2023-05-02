package overriding;

/*
 * 해당 메소드를 오버라이딩을 하지 마세요 
 * => final
 *  = 상속받을 수 없음
 *  = 객체를 만들어 사용해라
 */

final class A04{
	public void test() {
		System.out.println("부모 메소드");
	}
}

class B04{
	A04 a = new A04();
	public void test() {
		a.test();
		System.out.println("자식 메소드");
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
	}
}
