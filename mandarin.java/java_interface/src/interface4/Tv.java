package interface4;

public class Tv implements RemoteCon{

	@Override
	public void turnOn() {
		System.out.println("Tv 전원 켜짐");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv 전원 꺼짐");
		
	}

}
