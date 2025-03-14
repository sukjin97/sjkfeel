package modifier;

import inherit.Product;

public class Microwave extends Product {//전자렌지 //패키지가 다르면 import 꼭 하기!!!

	public Microwave() {
		System.out.println(super.brand);
	}
	
	@Override
	public void power() {
		System.out.println("전자렌지 전원");
	}
	
	
}
