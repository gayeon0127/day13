package overriding;

import java.util.ArrayList;

/*
 * object
 * ; 어떤 클래스를 만들던지 사용할 수 있는 부모클래스
 * ; 모든 객체 저장 가능
 */

class A03{}

class B03 extends A03{}

class C03{
	int age;
	String name;
	
	@Override
	public String toString() {
		return "["+age+","+name+"]";
	}
	
	
}

public class MainClass03 {
	public static void main(String[] args) {
		// A03 b = new B03();
		//업캐스팅 ; 부모형태로 자식을 받을 수 있음.
		Object o = new B03();
		Object num = "aaa";
		Object num2 = 11.111;
		Object num3 = 11;
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		
		C03 c = new C03();
		c.age = 20;
		c.name = "홍길동";
		
		System.out.println(c);
		System.out.println(c.toString());
		// 해당하는 클래스의 객체주소 제공
		// 오버라이딩을 통해 오브젝트가 가진 .toString의 내용을 변경함.
		System.out.println(arr);
		System.out.println(arr.toString());
		// 저장된 데이터(값) 제공 
	
	}
}