package inteface;

class A01{
	public void aa() {}
}

class B01 extends A01{
	public void aa() {}
	public void test() {}
}

public class MainClass02 {
	public static void main(String[] args) {
		
		//업캐스팅
		 A01 a = new B01();
		 a.aa();
		 //a.test => A가 가진 것만 보임, 보이지 않음
		 
		 //다운캐스팅
		 B01 b = (B01)a;
		 b.test();
		 b.aa();
	}
}
