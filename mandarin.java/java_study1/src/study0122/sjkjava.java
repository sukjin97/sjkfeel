package study0122;

import java.util.Scanner;

public class sjkjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = 20; // 대입연산자에 의해 오른쪽의 값을 왼쪽에 저장
       num = 20+3+1*10; // + , * 연산 후 대입연산 실행
       int num2 =10, num3 = 55;
       
       num = num2 + 13 / num3 + 123;
       // 대입연산자는 다른 연산자들보다 우선순위가 낮다.
       
       // 사칙연산자
       System.out.println( num2 + num3 ); // +
       System.out.println( num3 - num2 ); // -
       System.out.println( num2 * 4 ); // *
       System.out.println( num2 + num3 * 2 ); // * 연산 후 + 연산
	   System.out.println( num3 / num2 ); //   / 연산은 몫
	   System.out.println( num3 % 4); // % 연산은 나머지
	   System.out.println( 10 / 3.0 ); 
	   System.out.println (10 % 3.0); // %는 나머지 값에 초점을 둠
	   
	   // 복합 대입 연산자 
	   num = 10;
	   //num = num + 20;
	   num += 20; //+를 먼저하고 =을 진행
	   // num2 = num2 * 5;
	   num2 *= 5;
	   
	   // num = num +5 * num3;
	   num += 5 * num3;
	   
	   Scanner scan = new Scanner(System.in); // 키보드 입력받기 위해 생성
	   
	   // 원의 둘레 구하기
	   int r=0, dist=0;
	   System.out.print("반지름 : " );
	   r = scan.nextInt();
	   
	   dist = (int)(r * 2 * 3.14); //정수 데이터를 실수 타입에 대입하는 것은 가능(정수가 실수의 부분집합이기 때문) ex)실수타입 = 정수 데이터(O) but, 정수타입 = 실수 데이터(x)
	   
	   System.out.println( "원의 둘레 : " + dist );
	   
	   
	   	
	   
	}
	

}
