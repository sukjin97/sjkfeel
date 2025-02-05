package study0205;

import java.util.Scanner;

public class likejava {
	//자바의 변수 종류
	//지역변수, 클래스변수(static), 인스턴스변수
    static Scanner sc = new Scanner(System.in); //public static void 위에 쓸 때는 Scanner 앞에 static 꼭 쓰기!! 
 //static은 하나 밖에 없는 공간이므로 서로 공유하는 공간이라는 뜻임 //main은 class가 있어야 사용가능!!(딱 하나씩만 존재)
	public static void main(String[] args) {
		
//		int i=1;
//		for(int k=2; k<=9; ) {
//			System.out.println(k + "*" + i + "=" + (k*1));
//			i++;
//			if( i==10) {
//				k++;
//				i=1;
//			}
//		}
		
		
		//구구단
//		for(int k=2; k<=9; k++) {
//			for( int i=1; i<=9; i++) {
//				System.out.println(k + "*" + i + "=" + (k*1));
//			}
//		}
	
		
		
		//for( int i=1; i<=9; i++) {
//			System.out.println(3 + "*"  + i + "=" + (3*1));
//		}
//		for( int i=1; i<=9; i++) {
//			System.out.println(4 + "*"  + i + "=" + (4*1));
//		}
		
		
		
		
		
		
//		for(int i=1; i<=2; i++) {//i가 6이 될 때 끝남
//			
//			System.out.println("변수 i 사용 반복문 "+ i);
//			
//			for(int k=1; k<=3; k++) {
//			System.out.println(i+ "   변수 k 사용   "+k); //for문 안에 for문을 쓸 때 변수는 다른 걸 써야 함. 
//			//즉 k가 4가 될 때까지 i는 1이고 그 후에는 k가 다시 1,2,3이 되고 i는 2,2,2가 됨.
//		}
//		
//		}
	}
}
	
//		int num=0;
//		for( ; num!=100; ) {//for문으로는 무한루프 잘 만들지 않음.
//			System.out.println("정수 입력 : ");
//			num = sc.nextInt();
//		}
//		// for( ; ; ), for( ; true;), for( ; num!=0; )
////		while(true) {//while문은 조건식(true)만 표현함.무한루프 쓸 때 자주 사용함
////			
////		}
		
		
		
		
//		for (  ; ;  ) { // for 문 무한루프(;사이에 값이 하나도 없는 경우)또는 중간에 true를 넣어도 무한 루프다(false가 안 나오므로)
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		if(num == 0) return;//break도 만들어야 함(언제 끝나는지도 정해줘야 하기 때문.)단, if문 만으로는 안되고 for문도 있어야만 break를 사용해야 함.
//		}
//		// break 는 해당 제어문(반복문, switch)을 종료 시키기만한다.
//		// return은 메서드를 종료
//		
//		System.out.println("무한루프 종료 되었습니다.");
		
//		for(int i=1; true; i++ ) { //또 다른 무한루프(1부터 시작해서 계속 1씩 한도 끝도 없이 증가함)
//			System.out.println(i);
//		}
		
		
		
		// 10부터 100까지의 총합을 구하세요
		// 단, 10 단위의 숫자만 계산 (10,20,30,40,50,60,70,80,90,100)
		
	
		
//int total=0;
//for( int i=10; i<=100; i=i+10 ) {
//	total +=i; // total =total + i; //중괄호 안에는 반복할 내용이 들어가야 함.(한번만 실행할 꺼는 no)
//}
//	System.out.println( total ); //for 문 바깥에
		
		
//for( 초기값; 조건식; 증감식) {
//	반복내용
//}
//초기값 -> 조건식 비교 -> 참이라면 -> {내용} -> 증감식 -> 조건식 비교 -> 참이라면 -> {내용}-> 증감식 -> 조건식 비교 -> 참이라면 -> {내용} -> 증감식 -> 조건식 비교 -> 거짓이라면 -> 종료}

