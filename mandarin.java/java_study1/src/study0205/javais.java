package study0205;

import java.util.Scanner;

public class javais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 동전 앞면 뒷면 맞추기 게임
		// 내 돈이 바닥 날때 까지 게임 진행!!
		System.out.print("당신의 머니는 얼마? : ");
		int money=scan.nextInt();
		final int 판돈=1000; //final는 변경 되면 안되는 값(다른 개발자가 건드리지 못하게 하도록, 나만 바꿔서 쓸 수 있음.)
		int win=0; //반복문 안에 하면 안됨. 반복문 안에 넣어버리면 0으로 계속 초기화 되버림
		
		while(true) {			
			int coin = (int)(Math.random() *2 +1); //1앞 2뒤
			System.out.println("1.앞면, 2.뒷면 : ");
			int user = scan.nextInt();
			if(user == coin) {
				System.out.println("정답!!");
				}
			else
				System.out.println("땡!!");
			money -= 판돈; // 1번 진행시 1000원씩 감소
			if(money < 판돈) break;
			}//두 줄을 실행 할 때는 꼭 {}해주기
		System.out.println("내돈은 : "+money);
		System.out.println("정답 몇번: " + win);
		}
		
		
		
		
		
		// 21 ~ 49  -> * 29 + 21
//		int com = (int)(Math.random() * 50+1 ); //이 코드는 반복문 안에 들어가면 절대 안됨!!!
	
			
		//while안에 아무것도 안들어가면 안됨. 그리고 false이면 아무것도 시행 안됨.true여야 함
		
		
		
		
		
		//for(초기값; 조건식; 증감식) //for문이나 if문 뒤에 ; 붙이지 않기!!(그렇게 되면 ()까지만 작동이 됨)
		//for(int i=1; i<=10; i++)
		// 반복 횟수가 정해져 있는 경우 for문이 가독성이 좋다.
		// 반복 횟수가 없는 경우 while문이 가독성이 좋다.
//		int i=1; //초기값 
//		
//		while(i<=10) 
//		{//조건식   //위의 for 문과 같은 방식. 즉 for와 while 중 하나를 선택해서 하면 됨.
//			System.out.println(i);
//			i++;//증감식
		
		//오늘의 과제
		//1~50 중 하나를 내가 입력한다.
		//내가 입력한 숫자를 컴퓨터가 맞춰야 한다. (random 사용)
		//무작위로 맞추는 게 아니고 범위를 좁히면서 맞출 수 있도록 해야 한다.
		}

	


