package payMain;

public class PaymentMethod {

	public static void main(String[] args) {
		//결제 방법: 체크카드, 신용카드, 현금결제, 계좌이체
		//상속 관계로 부모클래스와 자식클래스를 정의하세요
		//결제 방법의 공통은 금액, 결제일 기능은 결제 처리(processPay)메서드
		//processPay 메서드 실행시
		//->체크카드결제 금액: 45000원 결제일 2025.02.10
		 Account ac = new Account();
		 Cash ca = new Cash();
		 Checkcard ch = new Checkcard();
		 Creditcard cr = new Creditcard();
		 

	}

}
