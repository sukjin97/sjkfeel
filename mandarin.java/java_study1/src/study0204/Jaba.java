package study0204;

import java.util.Scanner;

public class Jaba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("1.가위 2.바위 3.보 : ");
int me = sc.nextInt(); //키보드를 통해 입력

int com = (int)(Math.random()*3 + 1); //1~3랜덤값


switch( me-com ) {
case 0:
	System.out.println("비김");
	break;
case -2: //내가 가위(1), 컴퓨터 보자기(3)
case 1: //내가 바위(2) 또는 보(3), 컴 가위(1) 또는 바위(2)
	System.out.println("이김");
	break;
case -1: case 2:
	System.out.println("패배...");
	break;
	}


//if(me == com) {// 서로 값은 값이면 비김
//	System.out.println("비김");
//}else if((me==1 && com==3)||(me==2 && com==1)||(me==3 && com==2)) {
//	System.out.println("이김");
//}else {
//	System.out.println("패배...");
//}
	}

}
