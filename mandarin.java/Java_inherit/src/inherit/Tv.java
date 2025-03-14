package inherit;

public class Tv extends Product{// 자식 클래스
	
	public Tv() {super(); //부모 클래스 생성자 메서드가 반드시 먼저 실행된다
	    System.out.println("자식클래스생성");
		//super(); //부모 클래스의 생성자 메서드
		//super는 부모 클래스의 객체를 의미한다. 부모 쪽을 먼저 초기화 시켜야 함
	}
	public Tv(String brand, int price, String name) {
		//super();
		super(brand,price,name);}
		 public void power() { //내용만 바꿈
			   onOff=!onOff;
			   System.out.println("Tv 전원 : "+onOff);
	}
    
}
