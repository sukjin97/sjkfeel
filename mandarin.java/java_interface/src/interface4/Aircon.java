package interface4;

public class Aircon implements RemoteCon{

	@Override
	public void turnOn() {
		System.out.println("에어컨 전원 켜짐");
		
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨 전원 꺼짐");
		
	}

}
