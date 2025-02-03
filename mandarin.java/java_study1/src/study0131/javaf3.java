package study0131;

import java.util.Scanner;

public class javaf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //주말 과제
		//싸다구 주차장 주차비 결제
		//주차장의 기본 요금은 1000원 이고 기본 시간은 30분이다.
		//11분 주차해도 1000원 이다.
		//10분당 100원씩 추가 요금
		//34분 주차하면 1000원, 40분 주차하면 1100원
		//51분 주차하면 1200원
		//2시간이상 주차시 기본요금은 1700원이다.
		//2시간 10분 주차하면 1800원, 3시간 21분 주차하면 2500원
		//4시간 이상 주차시 기본요금은 2500원이다.
		//4시간 15분 주차하면 2600원
		//8시간 이상 주차시 무조건 10000원
		//주차를 몇시간 몇분 했는지 입력하여 주차 요금이 얼마인지 출력하세요 //시간과 분 따로따로 입력
		
		//조건 - 기본시간보다 10분이 추가 되면 요금이 변한다.
		//30, 32, 38, 39 -> 몫이 3이다.
		Scanner sc = new Scanner(System.in);
//		int default_time=30; //기본시간
//		int cost=1000;// 기본요금
//		int pTime=0;//주차시간
//		int tenM=100; //10분에 100원 추가 요금
//		
//		System.out.println("주차 시간(분): ");
//		pTime=sc.nextInt();
//		
//		if(0<pTime && pTime<=39) {//기본요금 1000원
//			
//		}else {
//			
//		}
//		if(0<pTime && pTime<=39) {
//			pTime=30;
//		}
//		pTime= pTime-default_time;
//		cost = (pTime/10)*tenM+cost;
//		System.out.println("주차 요금 : "+cost);
		
		int phour, pmin;//주차 시간, 분
		int cost = 1000;
		int totalTime=0; // 총 주차 시간(분) - 기본 시간 제외한 나머지
		
		System.out.println("주차 시간( 시간, 분) : ");
		phour = sc.nextInt();//주차 몇시간 입력
		pmin = sc.nextInt(); //주차 몇 분 입력
		
		totalTime = phour*60 + pmin;
		if(phour >=8) { //8시간 이상 주차
			cost = 10000;
			totalTime=0; // 8시간 이상 이라는 시간에 대해서 이미 요금 계산 완료
		}else if(phour >= 4) {//4시간 이상 주차시
			cost = 2500;
			totalTime -= 240; // 4시간의 기본 시간 빼기
		}else if(phour >= 2) {//2시간 이상 주차시
			cost = 1700;
			totalTime -= 120;   //if 문이므로 3 중 하나만 작용(첫번째의 if가 맞으면 나머지 else if 는 실행 no!)
		}else { // 2시간 미만 주차시
			totalTime -= 30;
		}
		int price = cost + (totalTime/10*100);
		System.out.println("주차 요금 : "+ price+"원");
	}

}

