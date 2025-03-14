package inner2;

public class MainMt {

	public static void main(String[] args) {
		LocalClass lc = new LocalClass();
		
		lc.getBirth();
	    //지역 내부클래스는 해당 메서드를 호출해야 사용가능
		Item item = new Item();
		item.sale();
		
		Item shoes = new Item() {
			@Override
			public void sale() {
				make();
				System.out.println("신발 판매");
			} 
			public void make() {
				System.out.println("신발만들기");
			}
		}; shoes.sale();
		   //shoes.make(); 오류
		//오버라이드 된것만 사용 가능
		//익명클래스 다시 정의하고 객체 생성(익명클래스: 기존의 클래스 활용함)
		//익명클래스 정의와 객체 생성. 익명클래스는 반드시 중괄호 뒤에 ; 붙이기
		//Item 클래스가 부모 클래스가 되고 익명 클래스가 자식클래스
		Animal dog = new Animal() {
			@Override
			public void eat() {
				System.out.println("멍멍이가 밥 먹는다.");
			}
		}; // 인터페이스를 implements한 익명클래스 정의와 객체
		dog.eat();

	}

}

@FunctionalInterface //메서드를 하나만 가짐
interface Animal{ // Animal 인터페이스 정의 //인터페이스는 객체를 못 가짐
	public void eat(); //추상메서드
}

class A{
	
}
