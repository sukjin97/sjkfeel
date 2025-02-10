package study0210;

import java.util.Scanner;

public class javahomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      
      int n1, n2, n3;
      
      do {
      n1 = (int)(Math.random()*9+1);
      n2 = (int)(Math.random()*9+1);
      n3 = (int)(Math.random()*9+1);
	}while( !(n1 !=n2 && n1 !=n3 && n2 != n3));
      // 3개의 숫자가 중복 없이 1~9중의 하나를 가진다.
      
      while(true) {// 숫자 맞출때까지 계속 입력해야 하니까 무한루프
    	  System.out.println("숫자 세개: ");
    	  int u1 = scan.nextInt();
    	  int u2 = scan.nextInt();
    	  int u3 = scan.nextInt();
    	  
    	  int str=0, ball=0; //스트라이크, 볼 표현, 아웃은 계산으로
    	  //스트라이크 경우
    	  if(n1==u1) str++;
    	  if(n2==u2) str++;
    	  if(n3==u3) str++;
    	  
    	  //볼 인 경우
    	  if( n1 == u2 || n1 == u3)ball++;
    	  if( n2 == u1 || n1 == u3)ball++;
    	  if( n3 == u1 || n3 == u2)ball++;
    	  
    	  System.out.printf("%d스트라이크 %d볼 %d아웃\n",
    			  str, ball, 3-str-ball);
    	  if(str == 3) break; // 3개 숫자를 맞췄다면 끝!!
      }

}
	
}

