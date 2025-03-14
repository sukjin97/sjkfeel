package inherit;

public class Refri extends Product{

	@Override
	public void power() { //추상메서드 구현
		onOff = !onOff;
		System.out.println("냉장고 전원 : "+onOff);
	}
}



//부모클래스가 추상 메서드를 가지고 있는 추상 클래스라면 
//자식 클래스에게 추상 메서드 상속시키기 때문에
//자식클래스는 추상메서드 가지고 있는 것과 마찬가지가 된다.
//따라서 Refri도 추상클래스가 되어야 함.