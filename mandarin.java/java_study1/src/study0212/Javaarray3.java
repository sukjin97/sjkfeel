package study0212;

public class Javaarray3 {

	public static void main(String[] args) {
		// 1차원 배열 : 같은 타입의 변수가 연속적으로 이루어진 구조
		// 2차원 배열 : 같은 타입의 1차원 배열이 여러개로 이루어진 구조

		int q=10;
		int as=20;
		int gf=232;
		
		int[] a = new int[] {3,4,5}; //1차원 배열 - 3의 크기
		int[] b = new int[] {1,20,60}; //1차원 배열 - 3의 크기
		int[] c = new int[] {23,98,54}; //1차원 배열 - 3의 크기
		//A반 학생의 성적 -> 1차원 배열
		//1학년 전체 학생 성적 -> 2차원 배열  //그룹안에 그룹이 나뉘어지는 경우 2차원 배열 사용!!
		
		
		//int[][] abc = new int[2][3];//첫번째가 2, 두번째가 3일 때 2는 1차원 배열이 2개라는 뜻, 3은 3의 크기. 즉 3의 크기를 가진 1차원 배열이 2개 존재한다는 뜻.
		//int[][] abc = new int[][] {{1,2},{3,4}}; //2의 2크기
		int[][] abc = new int[][] {a,b,c};
		System.out.println(abc[0][0]);
		System.out.println(abc[0]);
		
		int[][]arr = new int[3][4]; //크기 3,4(첫번째는 0부터 2, 두번째는 0부터 3 인덱스까지)
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 50;
		arr[1][3] = 100;
		arr[2][1] = 40;
		
		for(int i=0; i<arr.length; i++) {//arr.length=3이다. 왜냐하면 참조변수 arr은 3을 거치지 않고서는 4로 들어갈 수가 없기 때문이다.그래서 arr[i].length를 써야 함.
			
			for(int k=0; k<arr[i].length; k++) {
				
				System.out.println(arr[i][k]);
			}
		}
//		1차원 배열 -> 향상된 for 문 : for(int a : array) {
//		
//	}
   for(int i=0; i<arr.length; i++) {
	   for(int num : arr[i]) {
		   System.out.println(num);
	   }
   }
   for(int[] tmp : arr) {
	   for(int num:tmp) {
		   
	   }
   }
}

}