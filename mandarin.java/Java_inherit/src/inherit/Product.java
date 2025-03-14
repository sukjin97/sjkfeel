package inherit;

public abstract class Product { //부모클래스 //추상 메서드를 지니므로 클래스에도 abstract 붙어야 함
   protected boolean onOff=false;
   protected String brand; //브랜드
   protected int price;//가격
   protected String name; //제품명 - LG휘센, 캐리어 등
   
   public Product() {
	   System.out.println("부모클래스 생성");
   }
   public Product(String brand, int price, String name) {
	   this.brand = brand;
	   this.price = price;
	   this.name = name;
   }
//   public void power() {
//	   onOff=!onOff;
//	   System.out.println("전원 : " + onOff);
//   }
   
   
   // 오버라이딩 
   // 상속관계인 경우, 인터페이스 implements인 경우에 사용(다른 클래스)
   // 성립 조건
   // 1. 메서드 원형은 그대로 유지
   // 2. 내용만 변경한다.
   // 3. 상속 또는 implements인 경우에만 가능
   
   
   public abstract void power(); //추상메서드
   // 자식클래스에서 오버라이딩 하기 때문에
   // 부모는 추상적인 메서드로 만들기만 하면 된다.
   // 추상메서드는 반드시 추상클래스에서만 가능
   
   // 추상클래스는 객체 생성이 불가
   // 추상 클래스는 추상 메서드를 가질 수 있는 클래스이다.
   // 추상메서드는 메모리의 크기를 얼마나 할당해야 하는지
   // 측정불가 하기 때문에
   // 객체 공간 할당이 안된다.
   // 객체 공간 할당 받으려면 얼마의 메모리가 필요한지
   // 측정이 되어야 한다.
   
   
}
