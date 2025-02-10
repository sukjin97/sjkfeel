package study0210;

import java.util.Scanner;

public class Javaliker {

	public static void main(String[] args) {
		
		// 변수 : 값(데이터, 주소 등등)을 저장하기 위한 메모리 공간(값을 여러개 못 가짐) //int 등과 같은 데이터 타입 과 같은 것에 의해 데이터 크기가 결정됨
		
		int a = 10;
		a=20;
		// 배열 : 같은 데이터 타입(배열의 조건)의 연속적인 메모리 공간
		//       다른 말로 -> 변수공간 여러개를 연속적으로 사용.(:데이터를 저장하기 위해 사용. 단, 배열은 하나가 아닌 여러 개의 데이터 값을 가질 수 있음 (연속적으로)
		// 자바스크립트 배열 -> let arr = []; let arr=new Array();
		
		// 자바에서의 배열 
		
		// 자바 배열 선언 방법
		int[] arr = new int[5];  //5개 공간으로 이루어진 배열 선언. 즉 미리 만들어 놓고 데이터를 저장하는 형태. 처음에 데이터 넣을 때 넉넉하게 잡기.
        int[] arr2 = new int[] {1,20,50,15}; //알아서 크기가 만들어짐. 즉 4개 공간 배열 선언		
        
        //자바 배열 사용법
        arr[2] = 20; //arr 배열의 3번째 공간에 20이 저장이 됨. 2는 이동 횟수를 뜻함. 첫번째는 0번 이동, 두번째는 1번 이동, 세번째는 2번 이동해야 도달.
        System.out.println(arr[0]); //index 시작은 무조건 0부터
        arr[0] = 10;
        arr[1] = 30;
        arr[3] = 40;
        arr[4] = 60;
        
        for(int i=0; i<=4; i++) {
        	System.out.println(arr[i]);
        }
        
        //배열의 각각의 공간을 표현하려면 인덱스로 표현해야한다.
        //인덱스는 0부터 시작한다
        //그래서 반복문의 초기값은 0으로 지정하면 된다.
        //반복문의 조건식은 배열인덱스의 마지막까지 표현 될 수 있게 하면 된다.
        //배열의 크기(공간갯수)가 8이라면 마지막 인덱스는 7
        //조건식은 i<=7 하면 된다.
        for(int i=0; i<=3; i++) {
        	System.out.println(arr2[i]);
        }
        int[] apple = new int[10]; //참조 변수(new가 들어가면 무조건 참조변수임)
        // 참조변수(new)를 사용하려면 배열인 경우 인덱스(arr2[i])를, 객체인 경우는 .접근연산자를 사용
       Scanner sc = new Scanner(System.in);
        for(int i=0; i<=9; i++) {
    	   System.out.print("숫자 입력: ");
    	   apple[i] = sc.nextInt();
       }
        
                //배열: 다수의 데이터를 저장하고 관리하기 위한 것. 실행 중에 크기를 변경 절대 못함.
        //apple.length -> 배열의 크기(공간갯수)
        //실수데이터는 정확도가 100%가 아니라 잘못 처리 될수도 있다.
        //배열의 크기는 반드시 10진수 정수 양수로 지정
        for(int i=0; i<apple.length; i++) {
        	System.out.println("배열값:" +apple[i]);
        }
        
	}

}
