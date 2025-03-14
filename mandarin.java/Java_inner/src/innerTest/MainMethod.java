package innerTest;

public class MainMethod {

	public static void main(String[] args) {
		Tire tire = new Tire();
		tire.setInch( 18 );
		
       Car car = new Car( tire );
       
       System.out.println( car.getTire().getInch() );
	}

}

// 상속 관계와 포함 관계
// 사람     개발자

// 직업     프로그램개발자

// 필기도구  볼펜

// 자전거   체인

// 김미란   최예나   메타7회차반

// 과일     오렌지
