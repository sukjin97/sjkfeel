package thread1;

import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		

//		MyThread th1 = new MyThread("장은호");
//		th1.start();
//		
//		MyThread th2 = new MyThread("김명준");
//		th2.start();
////		Test t = new Test();
////		t.testfor();
////		
//	    for(int i=1; i<=1000; i++) {
//	    	System.out.println(" main메서드");
//	    	try{
//	    		Thread.sleep(1000);
//	    		}catch(Exception e) {}
//	    }
		Dino[] 알 = new Dino[] {
		 new Dino("티라노사우루스",10),
	    new Dino("벨로시랩터",4),
	     new Dino("프테라노돈",6),
	    new Dino("스테고사우루스",7)
	};
	    Create[] device = new Create[알.length];
	    for(int i=0; i<알.length; i++)
	    	device[i] = new Create();
	    
	    device[0].start(); device[1].start(); 
	    device[2].start(); device[3].start(); 
	    
	    // 알 갯수 만큼 스레드 만들었다. -왜?? 알 최대치만큼 스레드 있으면 좋을 꺼 같다라는 개인적인 생각
	    //부화 시킬 공룡을 선택하여 부화 진행 할 것이다.
	    // 스레드를 통해 각 공룡별 시간만큼 동작하도록 할것이다.
	    Scanner sc = new Scanner(System.in);
	    
	    for(int i=0; i<알.length; i++) {
	    	System.out.print("1~4중 알 하나 선택 : ");
	    	int select = sc.nextInt();
	    	
	    	
	    	
	    	Create.hatch(알[select-1]);
	    	System.out.println( (i+1)+"번 부화장치 가동");
	    	
	    	System.out.print("계속 해?(1-계속) : ");
	    	if( sc.nextInt() !=1)
	    		break;
	    }
	}

}
// 스레드
/*
 프로세스란? - 운영체제(윈도우 같은거)에서 프로그램을 실행 시키는 단위
       운영체제에서 프로그램을 실행 시키려면 관리가 필요하다.
       운영체제에 의해서 프로그램이 실행 되는 것이고 각 프로그램의
       메모리는 운영체제로 부터 할당 받아 사용하게 된다.
       모든 프로세스는 고유한 아이디를 가지고 있다.
       이런 아이디를 프로세스라고 한다. 
       
 스레드란? - 프로세스의 명령처리 단위
 
 원 스레드의 장점
 - 컴퓨터의 자원 소모 감소
 - 오류 관리, 디버깅이 쉽다.
 - 명령코드 실행에서 충돌 방지
 - 오류가 발생 해도 예외처리가 쉽다.
 
 멀티 스레드 장점
 -cpu 코어 컨텍스트 스위칭 값 감소
 -데이터 주고 받는 것이 간단해짐
 -응답 시간 단축
 -네트워크 환경에 적합
 
 스레드의 생명 주기
 1. new(스레드 생성)
 2. runnable 상태
 3. running 상태 (실행)
 -wait, sleep, suspend에 걸리면
 -> 대기 상태
 -대기 상태에서 resume, notify, sleep time up 에 의해
 -> 실행 준비 상태로 변경
 4. terminated 상태 (소멸) 
      
 */

//프로젝트 : java_thread
//패키지 : thread1
