package interface1;

public interface Move {

	public void moving();  //추상메서드
//	private int num; //인스턴스 변수 선언 불가
//	public static int cnt=0; // 클래스 변수 선언은 가능
//	public final float pi=3.14f; //상수 선언 가능 
//	
//	public abstract void out(); //추상메서드
//	public void sum(); //추상메서드

	void target();
	
}

//객체라 하면 인스턴스 변수 또는 메서드의 공간이 존재하는 것을 의미한다.
//인터페이스는 인스턴스 변수 또는 메서드를 가질 수 없고 객체를 생성 못함.