package study0203;

import java.util.Scanner;

public class Javatime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
        // Math.random()은 0.00000~ 부터 0.99999~까지 이다.
		// 곱하기 계산과 더하기 계산으로 범위를 지정할 수 있다.
//		int num = (int)(Math.random()*10)+1;    //ramdom 값: 0.000000~0.9999999(1이 나오지 않음)
//		
//		System.out.println(num);
     	
//		int user=0, coin=0;
//		System.out.print("1.앞면, 2.뒷면 : ");
//		user = sc.nextInt();
//		
//		coin = (int)(Math.random()*2+1);
//		
//		if(coin == user) {
//			System.out.println("정답!! ");
//		}else {
//			System.out.println("땡!!");
//		}
		
		//컴퓨터가 동전을 15개 가지고 있다. 
		// 컴퓨터가 제시한 동전 갯수가 짝인지 홀인지 맞추는 게임을 만드세요.
		//1.짝 2.홀
//		System.out.print("1.짝 2.홀 : ");
//		int user = sc.nextInt();
//		
//		int com = (int)(Math.random()*15+1);
//		if(com%2 == 0 && user==1) {
//			System.out.println("짝이다 ! 정답!!");
//		}else if(com%2==1 && user==2) {
//			System.out.println("홀이다! 정답!!");
//		}else {
//			System.out.println("땡!!!");
//		}
		// 주사위게임 ( 육면체 )
		// 컴퓨터가 주사위를 던진다.
		// 주사위 값이 3이하라면 작은 값, 주사위 값이 4 이상이라면 큰 값이다.
		// 1.작다 2.크다
		// 주사위 값이 작은 값인지 큰 값인지 맞추세요
		
		
		System.out.println("1.작다 2.크다: ");
		int user = sc.nextInt();
		
		int cube = (int)(Math.random()*6+1);
		if(cube <= 3 && user == 1) {
			System.out.println("3 이하, 작다!");
		}else if(cube >= 4 && user ==2) {
			System.out.println("4 이상, 크다!");
		}else {
			System.out.println("잘못입력했습니다");
		}
		
	}

}
