package overriding;

import java.util.ArrayList;

/*
 * object
 * ; 어떤 클래스를 생성할 때 모두 사용 가능한 부모 클래스
 * ; 자바 시스템이 기본적으로 상속하고 있는 클래스
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
	/*
	@Override
	public String toString() {
		return super.toString();
	}
	// 오버라이딩을 통해 object가 가진 .toString의 내용을 변경함.
	*/
}

public class MainClass03 {
	public static void main(String[] args) {
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
		// => 오버라이딩을 통해 변경된 내용 출력
		System.out.println(arr);
		System.out.println(arr.toString());
		// 저장된 데이터(값) 제공 
	}
}
