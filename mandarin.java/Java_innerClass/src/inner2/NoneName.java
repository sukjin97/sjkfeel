package inner2;

public class NoneName {

	Object ob = new Object() {
		public int hashCode(int a) {
			return 10; //익명 클래스 정의(중괄호 때문에)와 메서드 정의를 동시에 하면서 객체 생성까지
		}
	};//최상위 부모 클래스(우리가 만드는 모든 클래스의 부모)
	void myInner() {
		
	}
	
}
