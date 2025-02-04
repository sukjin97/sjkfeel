package study0204;

import java.util.Scanner;

public class javanice {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {//1도 조건식의 범위에 포함되어야 하므로 i==10으로 해버리면 안됨, for 문은 반드시 ;을 2개 가지고 있어야 함.(i를 1씩 증가시킴)
			//초기값 설정 후 조건식(i<=10)을 따지고 참이면 중괄호 i++ 적용하고 조건식에 맞으면 다시 시행. 조건식이 거짓인 경우에 이 반복이 끝남. 
			//i++자리에 i+2같이 내가 원하는 증가값을 적으면 됨.
//			System.out.println(1);
		}
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("숫자 입력 : ");
//		int num = scan.nextInt();
//		
//		for(int i=num; i>=1  ; i--) { //감소하는 형태로 반복
//			System.out.println("반복 !!!");
//		}
//		
//	for(int i=1; i<=num; i++) {
//		System.out.println("반복문 ! ");
//	}
		
		// 6번 반복하는 반복문 만들고 싶다.
		// 1부터 시작해서 6까지 1씩 증가
		// i=1; -> 1부터 시작하겠다.
		// i<=6; -> 6까지 
		// i++ 또는 i=i+1  1씩 증가
		// for( int i=1; i<=6; i++)
		
		// 정수 5부터 17까지 출력 하는 반복문 만드세요
	
//		for(int i=5; i<=17; i++) {
//			System.out.println(i);
//		}
//		
		// 총합 구하기
//		int sum=0; //초기값으로 0이 꼭 있어야 함. 곱하기는 1이 있어야 함
//		
//		for(int num=1; num<=10; num++ ) {
//		sum = sum+num;	
//		}
//		System.out.println("1부터 10까지 함 : "+sum);
		
		// 두 개의 정수를 입력하여 두 수중 작은 숫자부터 큰 숫자까지의 합을 구하세요
		// 예) 1번째 숫자를 21 입력하고 2번째 숫자를 4 입력했다면
		// 4부터 21까지의 합 구하기
//		int num1=0, num2=0;
//		
//       System.out.println("두개 정수 입력: ");
//       num1 = scan.nextInt();
//       num2 = scan.nextInt();
//       
//       int small, big;
//       if(num1 < num2) {
//    	   small = num1;
//    	   big=num2;
//       }else {
//    	   small=num2;
//    	   big=num1;
//       }
//       int sum=0;
//       for( ; small<=big; small++) {
//    	   sum = sum + small;
//       }
//       System.out.println(sum);
       
//       if(num1 > num2) {
//    	   int temp = num1;
//    	   num1 = num2;
//    	   num2 = temp;
//       }
		
		// 내가 키보드로 입력한 숫자에 해당하는 구구단 출력하기
	    System.out.print("숫자 입력 : ");
	    int gugu = scan.nextInt();
	    
	    for(int i=1; i<=9; i++) {
	    	System.out.printf("%d * %d = %d \n",gugu, i, gugu*i);//gugu*i는 gugu*i의 결과값임
	    }
		
		
		
//        for(int i=1; i<=9; i++) {
//        	System.out.printf("2*%d= %d \n", i,2*i);
//        }
//		System.out.println("2*1="+(2*1)); //2*1은 문자열이므로 계산이 안됨
//		System.out.println("2*2="+(2*2));
//		System.out.println("2*3="+(2*3));
//		System.out.println("2*4="+(2*4));
       
        }
	}
		
	
	
	


// 반복문 - for, while, do~while
// 반복 - 몇번을 반복할꺼냐, 몇번을 반복할 것인지 정하지 않고 하는 경우와
// 반복횟수를 정하여 반복하는 경우
// 주로 반복횟수가 정해진 경우는 for 문
// 반복횟수가 정해져 있지 않은 경우는 while 문

//2월 4일 공부자료
//동전 앞면 맞추기 게임을 10판 진행. 10번 게임을 하는 동안 몇 번 맞췄는지 출력
