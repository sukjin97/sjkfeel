package study0214;

public class Javaarray7 {

	public static void main(String[] args) {
		
//		String str = new String("member"); //String str = new String("member") 클래스는 객체임(객체의 주소를 나타냄).배열이 아님
//		System.out.println( str.charAt(0) );
//		char[] c = new char[] {'a'};  //배열의 주소. []가 있으면 c는 무조건 배열의 주소를 나타내는 것임.
//		c[0]='a'; //기본 데이터는 참조변수가 아니고 데이터를 직접 담을 수 있음 		
//		
//		String[] names = new String[5]; //배열의 형태.
//				//new라고 되어있는건 전부 참조변수(클래스로 된 것들)
//		names[0] = new String("박문수");
//		names[1] = "김정호"; //줄여서 사용도 가능
//		names[2] = "서경림";
//		names[3] = "김명준";
//		names[4] = "이정훈";
// 
//		// 김미란 이름 등록 되어 있냐???
//		
//		boolean hasName = false;
//		for( String name : names) {
//			if( name.equals("김미란"))
//				hasName=true;
//			
//          //System.out.println(name);
//		}
//            if(hasName)System.out.println("이름 등록 됨");
//            else System.out.println("등록 되지 않은 미음");
//       //배열 -> 문자열
//		String temp = String.join(",", names);
//		// 박문수, 김정호, 서경림, 김명준, 이정훈
//		boolean hasName = temp.contains("김미란"); //포함 여부를 알려주는 메서드
//	  if(hasName)System.out.println("이름 등록 됨");
//      else System.out.println("등록 되지 않은 미음");
		
		// 학과명, 조교, 전화, 위치
		String[][] dept = new String[4][7]; //첫번째 배열의 크기는 무조건 존재해야 함.
		dept[0]= new String[]{"컴퓨터공학과", "정보과학과","정보통신공학과","정보산업공학과","전자공학과","문헌정보학과","전기공학과"};
		dept[1]= new String[]{"이지은","김영미","박순애","이춘애","이미선","김기범","박준용"};
		dept[2]= new String[]{"3333","3334","3335","3336","3337","3338","3339"};
		dept[3]= new String[]{"T101","T201","T301","T401","T501","T601","T701"};
		
		// 정보통신공학과의 과사무실 위치와 조교 이름은?
		String search = "정보통신공학과";
		int idx=-1;
			for(int k=0; k<dept[0].length;k++) {
				if( dept[0][k].equals(search)) {
					idx = k;break;
			}
		}
			if(idx == -1) //만약 학과가 존재하지 않으면
			{
				System.out.println("등록 되지 않은 학과입니다.");
				return; // return은 메서드를 종료시킨다. main메서드 종료되면 프로그램 끝
			}
			System.out.println("조교 : " + dept[1][idx]+",사무실:"+dept[3][idx]);
			
	}

}
//참조변수 : 특정 공간의 메모리 주소만 저장할 수 있는 변수
//참조변수는 배열의 주소를 가지는 참조변수와, 객체의 주소를 가지는 참조변수
//   배열의 주소를 가지고 있는 참조변수는 참조변수이름[인덱스] 방식
//   객체의 주소를 가지는 참조변수는 참조변수이름.xxxx 방식으로 사용
//int a=10; 