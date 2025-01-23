package study0123;

import java.util.Scanner;

public class myjava97 {

	
	
	public static void main(String[] args) {Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
        //조건 연산자
		// (조건식) ? 참일 경우 실행 내용 : 거짓일 경우 실행 내용;
		
//	 void a = ( 10 > 5 ) ? System.out.println("5보다 크다") : 
//		 System.out.println("5보다 작다");
		
//		String result = ( 1 > 5 ) ? "5보다 크다" : "5보다 작다";
//		System.out.println( result );
//		
//		int age = 21;
//		
//		int price = ( age < 19 ) ? 1000 : 1500; //참 일 경우 1000이 출력됨
//        System.out.printf("나이 : %d살 , 버스요금 : %d원 \n" , age, price);
//        
////        int a=0;
////        int b = (age < 15)? a=1000 ; 1500; //a=1000 과 같은 방식 사용 ㄴㄴ
//        
//       
//        
//        System.out.print("첫번째 숫자 : ");
//        int num1 = scan.nextInt();
//        System.out.println("두번째 숫자 : ");
//        int num2 = scan.nextInt();
//        
//        int res = ( num1 > num2 ) ? num1 : num2;
//        // 조건식이 참이라면 res=num1 수행
//        // 조건식이 거짓이라면 res=num2 수행
//        
//        System.out.println("두 숫자 중 큰 숫자는 : " + res);
//        
//        // 두 숫자를 입력받아서 두 수가 같다 , 같지 않았다. 출력
//        
//        System.out.print("숫자1 : " ); //어떤 걸 화면에 띄울 거냐
//        num1 = scan.nextInt(); // 변수의 타입 정하기
//        System.out.println("숫자2 : " );
//        num2 = scan.nextInt();
//        
//        String 결과 = (num1 == num2) ? "두숫자가 같다." : "두숫자가 같지않다.";
//        System.out.println( 결과 );
	
	   
//         System.out.print("정수 입력 : ");
//         int num = scan.nextInt();
//         
//         // 입혁한 정수가 양수냐 음수냐 , 0 이냐
//         String res = ( num > 0 ) ? "양수" : ( num < 0 ) ? "음수" : "0이다" ;
//         System.out.println( res );
        
         // 바이킹 타기 위해서는 키가 135 이상이어야 한다. 
	     // 바이킹 탑승여부를 출력하세요. ( 키 입력받기 )
//	      System.out.println("키 입력 : " );
//	      int tall = scan.nextInt();
//	      
//	      String res = ( tall >= 135 ) ? "탑승가능" : "탑승불가";
//	      System.out.println( res );
	      
//	      System.out.print("1. 파미향짬뽕 2. 쿠켄 돈가스 3. 공주순대 : ");
//	      int select = scan.nextInt();
//	      
//	      int price = (select == 1) ? 9000 : 0;
//	      price = (select == 2) ? 8000 : price; //price가 이미 9000으로 정해짐
//	      price = (select == 3) ? 6500 : price;
//	      
//	      System.out.println(" 가격은 " + price);
	      
	      // 정수 세개를 키보드를 통해 입력 받기
	      // 세 정수 중에서 가장 큰 정수를 출력하세요.
	      // 두개가 같은 경우, 세개가 같은 경우는 배제하고!!
	      
	      
	      System.out.println("세 정수 입력 : ");
	      int num1 = scan.nextInt();
	      int num2 = scan.nextInt();
	      int num3 = scan.nextInt();
	      
	      int max = (num1 > num2) ? num1 : num2;
	      max = ( max > num3 ) ? max : num3;
	      System.out.println("가장 큰수 : "+ max);
	      
	}

}



//사칙연산자 : + , - , / , * , %
//복합대입연산자 : +=, -=, /=, *=, %=
// a = a +123; => a += 123;
//증감연산자 : ++ , --(1 씩 밖에 안됨)
//비교연산자 : 비교연산자를 통해 조건식을 만든다. 조건식은 참 또는 거짓의 결과
//==(같다) , !=(같지않다) , 
// 논리연산자 : &&(and), ||(or), !(not)
// 논리연산자는 참이나 거짓을 가지고 연산한다.
// a > 6 && b < 4 && b > 0 || c > 10  &&와 || 중 먼저 작성된 것이 먼저 진행됨
