package overriding;

class A05{
	public void test() {}
	void test1() {}
}

class B05 extends A05{
	public void test() {}
	// 일반적으로 부모가 가진 것과 같은 것을 씀
	// 부모가 가진 것보다 작은 것은 오버라이딩 불가
	// private < package < protected < public
	void test1() {}
}

public class MainClass05 {
	public static void main(String[] args) {
		B05 b = new B05();
	}
}
