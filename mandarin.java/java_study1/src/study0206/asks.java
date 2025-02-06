package study0206;

import java.util.Scanner;

public class asks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user=0;
		do{
			System.out.print("1.가위 2.바위 3.보 : ");
			user = sc.nextInt();
			// if(user>=1 && user <=3) break;
		}while(!(user>=1 && user <=3));
		System.out.println("가위바위보 진행");
		//반복문의 조건식과 내용이 연관이 있을 때
//		int a=100;
//		do {
//			System.out.println(" do~ while문");
//			a++;
//		}while( a < 15);  
		
		
		//do while은 뒤에 ; 붙여야 함.
        //초기값 -> { 내용 } -> 조건식 비교 -> 참이면 -> { 내용 } //조건식 비교는 나중에
		
		
		
		
		
		
		
		
		
		
		
		
		int i=1;
//	    int k=1;//k값을 while문 바깥에 쓰면 결과가 달라짐(while은 초기값을 가지지 않기 때문)
//		while( i<=3 ) {
//			
//			while( k<=2 ) {
//				System.out.println("i= "+i+"  k="+k);
//				k++;
//			}
//			
//			i++;
//		}
//		
		
		
//		for(int i=1; i<=3 ;i++) {
//			for(int k=1; k<=2; k++) {
//				System.out.println("i= "+i+"  k="+k);
			}//중괄호 생략 가능(한 줄이므로)

		
		
	}


