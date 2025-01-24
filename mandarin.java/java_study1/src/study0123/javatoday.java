package study0123;

public class javatoday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       // 비트 논리 연산자
	System.out.println( 27 & 13 ); // and 연산  두 조건이 모두 성립해야함
	System.out.println( 27 | 13 ); // or 연산   하나라도 참이면 참, 하나라도 거짓이면 거짓
	System.out.println( 27 ^ 13 ); // xor연산: and,or,not의 조합 (서로 다른 것끼리 연산해야 1이 나옴. 같으면 0이 나옴)
	System.out.println( ~13 );  // not 연산 => 부호비트가 바뀜 예)-를 +로 또는 +를 -로
	
	// 비트 쉬프트 연산자 
	System.out.println( 21 << 2 ); //  <<시프트 연산자(이동시켜주는 연산자) 즉 왼쪽으로 2칸 이동. 빈자리는 부호비트가 양수이면 0으로 채우고 음수는 1로 채움
	//21을 2로 나눈 나머지 값들을 순서대로 나열하면 10101이 나옴 각 자릿수가 제일 오른쪽부터 왼쪽 방향으로 커짐
	System.out.println( 17 >> 3 ); // 시프트 연산자
	}

}
