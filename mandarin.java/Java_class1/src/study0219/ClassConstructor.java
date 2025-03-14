package study0219;

public class ClassConstructor {

	public static void main(String[] args) {
		
     Food f1 = new Food("돈가스",8000);
     
     System.out.println(f1.foodName);
     
     Food f2 = new Food();
     
     Item item1 = new Item();
     Item item2 = new Item("갤럭시북5", 100);
     Item item3 = new Item("그램","LG전자",123);
     		
     
     // 기본 생성자 메서드가 존재 하기에 Food() 실행됨
     
     
	}

}

/*
메서드  //객체가 존재해야 사용가능(객체에 귀속됨),
출력타입(반환타입) 메서드 이름(매개변수){
  메서드 내용
}
//매개변수는 외부와 내부를 연결시키는 역할

int sum(int a, int b){ a와 b는 매개변수임
int num1=a;
int num2=b;
System.out.println( num1+num2 ); 
}
int x=23 , y=2435;
sum(x, y);


 
*/





/*
상품 
상품명, 브랜드, 수량

상품을 등록하고자 하는데 필요한 클래스를 정의하고 상품 정보 저장하기 위한 생성자 메서드를 아래와 같이 구현
- 기본 생성자 메서드
- 상품명과 수량 초기화 가능한 생성자 메서드
- 상품명, 브랜드, 수량 초기화 가능한 생성자 메서드
*/


 