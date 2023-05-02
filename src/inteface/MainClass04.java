package inteface;

class A04{
	public void a04() {
		System.out.println("부모");
	}
}

class B04 extends A04 implements Interface04{
	// 구체적인 형태가 존재하지 않기 때문에 다중 상속 가능
	// 인터페이스가 가진 추상화 메소드를 구체화 해야 함
	@Override
	public void test() {}

	@Override
	public void test1() {}
}

public class MainClass04 {
	public static void main(String[] args) {
		
	}
}
