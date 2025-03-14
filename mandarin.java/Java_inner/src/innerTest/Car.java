package innerTest;

public class Car {
	
   private Tire tire;
  
   public Car(Tire tire) {
	   this.setTire(tire);
   }
   public Tire getTire() {
	   return tire; //포함은 외부에서 만든 것을 가져오는 것임.
   }
   
   public void setTire(Tire tire) {
	   this.tire = tire;
   }
   
   // 포함관계에서 클래스 객체 생성시기
}
