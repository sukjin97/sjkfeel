package study0211;

import java.util.Arrays;
import java.util.Collections;

public class Javaarray2 {

	public static void main(String[] args) {
		
//		int[] number = new int[] {10,20,30,44,55,66,100,2323};
//		
//		for( int num : number ) {//number에 있는 값을 하나하나 꺼내와서 num에 저장1
//			System.out.println( num ); //배열에 있는 데이터만 활용 가능.
//		}
		//배열의 인덱스 사용 불가(몇번째에 위치에 있는지)
		//배열의 데이터를 변경하거나 삭제 불가
	
		// 문제 
		// tall 배열은 A반 학생들의 키를 저장한 것이다.
		// A반의 평균이상  키를 찾아서 출력하세요.
//		float[] tall = new float[] {167.2f,163.4f, 175.7f, 173.8f, 158.3f };
//		
//		
//		float avg=0,  sum=0; 
//		for(float t : tall) {
//			sum = sum + t; // 총합 구하기
//		}
//				avg= sum/tall.length; //평균 구하기
//				
//				for( float t: tall) {
//					if(avg<=t)
//						System.out.println(t);
//				}
		
		//배열 관련 메서드
		
		int[] num = new int[] {10,20,30,40,50,60,70};
		
		System.out.println( Arrays.toString(num) );
		//자바에서 데이터 출력 메서드 이름은 toString
		
		int[] a = new int[7];
		System.out.println( Arrays.toString(a));
		
		//배열복사
		//arraycopy(복사 배열, 복사배열시작인덱스, 저장배열, 저장시작인덱스, 크기);
		System.arraycopy(num, 0, a, 0, 7); //num의 0번 인덱스를 a의 0번 인덱스에 7만큼 넣음 
		System.out.println( Arrays.toString( a ));
		
		boolean isSame = Arrays.equals(num,a); //Arrays.equals하면 바로 비교가 됨.
		System.out.println(isSame);
		
		//배열 정렬
		int[] arr = new int[] {23,523,52353,34,12,43,53,54,64};
		System.out.println("==== 정렬전 ====");
		System.out.println(Arrays.toString(arr));
		Arrays.sort( arr ); //오름차순 정렬
		System.out.println("--- 정렬 후 ----");
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = {5,4,3,2,1};
		Arrays.sort( arr2 , Collections.reverseOrder() );
		String[] names = {"이순신","이성계","김춘추","정약용","문익점"};
	    System.out.println( Arrays.toString(names));
	    
	    Arrays.sort( names );
	    System.out.println(Arrays.toString(names));
	    
	    Arrays.sort( names , Collections.reverseOrder());
	    System.out.println( Arrays.toString(names));
		// 
	}

			
		
		
	
	
}
