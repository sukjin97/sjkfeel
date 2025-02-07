package study0206;

import java.util.Scanner;

public class javatest1 {

	public static void main(String[] args) {
		/*
		 문제 1 - 무한루프
		  정수 한 개씩 계속 입력 받기
		  입력 하다가 0을 입력하면 
		  지금까지 입력한 모든 숫자의 합 출력
		  
		  
		 문제 2 - 무한루프
		 컴퓨터와 가위 바위 보 게임하기
		  내가 10번을 이길 때 까지 계속 게임하기
		  10번 이기면 그동안 몇번 패배하고 몇번 비겼는지 출력
          		 
		 문제 3 
		 컴퓨터와 주사위 게임을 한다.
		 각각 주사위 2개를 던져서 주사위 합이 큰쪽이 이긴다.
		 단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다.
		 둘다 같은 숫자가 나왔다면 합이 큰쪽이 이긴다.
		 예) 나 - 3,4  컴 - 1,3 내가 이김
		    나 -5,6 컴 -1,1 컴퓨터 이김
		 5판을 진행 했을 때 몇승 몇패 몇무 인지 출력
		*/
		
		//베스킨라빈스게임
		Scanner sc = new Scanner(System.in);
		int me=0, com=0, num=1;
		
		while(true) {// 언제 31이 나올지 모르니 무한루프로 전체를 반복
			
			System.out.print("숫자 몇개: ");
			me = sc.nextInt();
			// 1~3사이 값 입력했는지 체크하는 반복문 만들면 좋겠지요
			System.out.print("나: ");
			for(int i=1; i<=me; i++) {
				System.out.print((num++) +"  ");
				if( num == 32 ) break; //for 문에 적용되는 break임 while에는 영향 ㄴㄴㄴ
			}
			if(num == 32) {
				System.out.println("내가 졌다...");
				break;// while 종료시켜주는 break
			}
			
			com = (int)(Math.random()*3 + 1); //1~3개 중 하나
			System.out.print("\n컴퓨터: ");
			for(int i=1; i<=com; i++) {
				System.out.print((num++) + " ");
				if(num == 32) {
					System.out.println("컴퓨터 패배!!!");
					break; //while 종료
				}
			}
			
		}
		
		
		
		}
		}
	
	
		
		
		

	    	
	    	
	    
		
			
		


