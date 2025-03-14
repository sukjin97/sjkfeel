package inherit;

public class Computer extends Product{

	public Computer() {}
	public Computer(String brand, int price, String name) {
		super(brand, price, name);
	}
		
		 public void power() { //내용만 바꿈
			   onOff=!onOff;
			   System.out.println("컴퓨터 전원 : "+onOff);
	}
}
