package inner2;

public class LocalClass {

	private String name;
	
	public void getBirth() {// 인스턴스 메서드
		
		class Birth{ //지역 내부 클래스(메서드 안에서만 사용)
			int year;
			int month;
		}
		Birth b = new Birth();
		b.year=2000;
		b.month=4;
		System.out.println(b.year+" "+b.month);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
