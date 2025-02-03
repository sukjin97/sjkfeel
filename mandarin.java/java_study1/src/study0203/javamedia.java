package study0203;

public class javamedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch 문: 범위를 사용 못 함. 여러 개중 하나를 선택하는 거임
		// if 문: 
		
//		 switch(1) {//소수는 딱 떨어지는 값이 아니므로 switch에 사용ㄴㄴ 그리고 switch에 문자가 들어오면 case에도 문자가 와야함.(데이터 종류가 같아야 함)
//		case 1: //case 옆에 'a'가 와도됨. 왜냐하면 문자도 숫자 취급할 수 있기 때문.
//			System.out.println("1을 선택");
//			break;
//		case 3:
//			System.out.println("3을 선택");
//			break;
//		case 10:
//			System.out.println("10을 선택"); // 3을 선택하면 그 아래에 있는 것도 선택됨 즉, switch의 중괄호가 닫히는 부분까지 실행됨
//			break; //break를 사용하면 중간에 종료. 다시말해 강제 종료임. 단 break를 if문에서 사용하여 종료하지 못함 절대로
//		int num = 50;
//		switch(num) {
//		case 10:
//			System.out.println("10 선택");
//			break;
//		case 30:
//			System.out.println("30 할꺼야?");
//			break;
//		case 20:
//			System.out.println("case에 표현하는 데이터는 정수, 문자, 문자열");
//			break;
//		case 50:
//			System.out.println("입력된 값에 맞는 case 실행은 " + "break 또는 } 까지 실행");
//			break;
//			default:
//				System.out.println("case에 없는 값이야!! 다시해!!");
//		}
		
		/*
		 if(점수 <=100 && 점수 >=90){
		 "A학점"
		 }else if( 점수 >= 80){
		 "B학점"
		 }
		 */
		int 점수=79;
		switch(점수/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
			default:
				System.out.println("F학점");
		}
 /*
  과제!! 2월 3일
  
  가위바위보 게임 만들기
  1. 가위 2. 바위 3. 보자기   //가위, 바위, 보 글자 입력x
  내가 이겼는지, 졌는지, 비겼는지 출력 //random 사용하기
  */
  
				
	}

}
