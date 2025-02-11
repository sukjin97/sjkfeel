package study0210;

import java.util.Scanner;

public class Javaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
//7개 정수를 저장 할 수 있는 배열을 선언하고 정수 7개 입력한 뒤 모두 출력 하세요.
//int [] arr = new int[7]; //7의 크기 배열(7개 공간)
//
//for(int i=0; i<=arr.length; i++) {
//	System.out.print("정수 입력 : ");
//	arr[i]=sc.nextInt();
//	
//}
//for(int i=0; i<arr.length; i++) {
//	System.out.println(arr[i]); //0번 인덱스부터 6 인덱스까지

//int size=5;    
//int[] age = new int[size]; //웬만하면 final 붙여서 상수로 만들기
////정적 배열은 지정된 크기를 변경하기 어렵다.
////프로그램 실행시 컴파일 과정에서 배열의 크기가 정해져 있어야 그만큼 공간을 할당 받는데 배열의 크기가 확정되어 있지 않으면
////컴파일 과정에서 공간을 할당 받지 못한다.(윈도우에 의해 필요한 만큼 대여 받는 건데 정확한 크기가 없으면
////대여 안해줌.
//age[0]=10;
//System.out.println(age[0]);

//int[] sum = new int[3];
//int[] a = new int[] {10,20,30};//뒤에 값들이 있다면 크기 지정ㄴㄴ
//int[] b = new int[] {1,5,9};

//a 배열과 b 배열의 합을 sum에 저장
//sum[0] = a[0] + b[0];
//sum[1] = a[1] + b[1];
//sum[2] = a[2] + b[2];

//for(int i=0; i<sum.length; i++) {
//	//전부 다 크기(인덱스값)가 3이다
//	sum[i] = a[i] + b[i];
//}


//a와 b 배열의 데이터를 total 배열에 저장하기
//a 배열의 값 먼저 저장하고 이어서 b 배열의 값 저장 될 수 있게!!
//저장한 뒤에 total배열 값 출력
//결과 -> 10 20 30 40 50 55 44 33 22 11


//int[] total = new int[10];
//int[] a = new int[] {10,20,30,40,50};
//int[] b = new int[] {55,44,33,22,11};
//
//for(int i=0; i<a.length; i++) {
//	total[i] = a[i];
//	total[i+5] = b[i];
//}
//for(int i=0; i<total.length; i++) {
//	System.out.println( total[i] );
//} 
//for(int i=0; i<a.length;i++) {
//	total[i] = a[i]; //total[0]=a[0], total[1]=a[1]...
//	}
//for(int i=0; i<b.length; i++) {
//	total[i+5] = b[i]; //total[5]=b[0], total[6]=b[1]...
//	}

//char[] name = new char[5]; //모든 문자열은 배열(문자 여러개를 사용해서 만들기 때문)
//name[0]='j';
//name[1]='o';
//name[2]='h';
//name[3]='n'; //얘처럼 일일이 만들 필요없고 String으로 만들면 됨
//// name -> john 문자로 저장
//// 문자열은 배열이지만 char 배열로는 온전한 문자열 입력이 어렵다.
//// 배열이기 때문에 인덱스를 통해 문자 하나씩 입력 저장해야 한다.
//// 그래서 자바에서는 문자열의 사용을 편하게 하기 위해
//// String 클래스가 존재한다. 
//// String 클래스에는 내부적으로 char 배열 생성되도록 되어 있다.
//
//
//System.out.println( name );
//System.out.println("member".length()); //member가 메모리 어딘가에 저장되어 있어야 함.->member의 길이
//
////1.
//String myName = "john"; //string은 import 할 필요 없다. but 기본 데이터 타입은 절대 아님.
//System.out.println( myName );
//myName = "설경구";
//System.out.println( myName );
////배열: []사용, 객체: . 사용
//
////2.
//String youName = new String("박문수");
//System.out.println( youName );

// 1과 2중 편한 걸로 하면 됨.

//int[] a = new int[] {11,20,55};
//int[] b = new int[] {13,20,55};
//
//boolean isSame = true; // 같은 배열 이면 true 다르면 false
//
//for(int i=0; i<a.length; i++) {
//	if(a[i] != b[i]) {
//		isSame=false;
//	}
//	if( isSame ) {
//		System.out.println(" 같은 배열 ");
//	}else {
//		System.out.println(" 다른 배열 ");
//	}
//}

//char[] name1 = new char[] {'주', '동', '건'};
//char[] name2 = new char[] {'장', '동', '건'};
//
////name1과 name2의 이름이 같은 이름인가???
//
//boolean isSame = true;
//for(int i=0; i<name1.length; i++) {
//	if( name1[i] != name2[i] )
//		isSame=false;
//}
//if(isSame)
//	System.out.println("같은 이름");
//else 
//	System.out.println("다른 이름");

//if(name1.equals(name2)): 참이냐 거짓이냐(name1과 name2가 같냐. 즉 문자열끼리 비교하는 경우)->같으면 참 다르면 거짓
//name1.compareTo(name2): name1과 name2를 비교. 단 비교를 했을 때 두 문자열이 서로 완전히 같으면 결과값은 0, 사전적 순서가 앞일 경우 결과값이 양수(name1이 name2보다 앞), 사전적 순서가 뒤인 경우는 음수(name1 < name2).  


// 오늘 과제
// 랜덤 범위 1~50
// 랜덤 숫자 중에서 짝수  15개를 배열에 저장
// 15개 전부 저장 되면 배열 출력 하시오
// 숫자 중복 상관 없음 //빨리 끝나면 중복 없이도 한번 해보기




}



	
	
	}


