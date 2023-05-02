package overriding;

/*
 * overriding
 * 상속 받은 자식 클래스에서 부모 메소드 대신 자신의 메소드를 실행하는 것
 * 자신에 맞게 변경하는 것
 * 
 * - 조건 
 *  ; 부모메소드와 동일한 이름, 반환타입, 매개변수
 *  ; 부모의 접근제한자보다 크거나 같아야 함.
 *   => private < package < protected < public
 */

class Ferrari{
	private int ye;
	
	public Ferrari(int ye) {
		this.ye=ye;
	}
	
	public int getYe() {
		return ye;
	}
	
	public void speed(){
		System.out.println(getYe()+"년식 페라리 속도 300km");
	}
}

class NewFerrari extends Ferrari{
	public NewFerrari(int ye) {
		super(ye);
	}
	
	public void autoSystem() {
		System.out.println("자동운전모드");
	}
	
	// 부모메소드를 오버라이딩함 - 내용 변경O
	public void speed(){
		System.out.println("변경합니다.");
		System.out.println(getYe()+"년식 페라리 속도 400km");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		/*
		Ferrari f = new Ferrari(2023);
		f.speed();
		*/
		
		NewFerrari nf = new NewFerrari(2024);
		nf.speed();
		nf.autoSystem();
	}
}
