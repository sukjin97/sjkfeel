package study0218;

public class ClassArray {

	public static void main(String[] args) {
		
//        Member mem = new Member(); //new는 변수 저장하는데에 필수적임
//        mem.name="김유신";
//        mem.job="군인";
//        mem.age=38;
		
// String[] names = new String[3];
//		Member[] members = new Member[5];
//		// 5명의 정보 저장 가능은 한데 아직...
//		members[0] = new Member();
//		for(int i=0; i<members.length;i++)
//			members[i] = new Member();
//		
//		members[0].job="감찰관";
//		members[0].name="박문수";
//		members[0].age=34;
//		members[1].name="이순신";
//		members[1].job="군인";
//		members[1].age=31;
//		members[2].name="문익점";
//		members[2].age=45;
//		members[2].job="산업스파이";
//		
//		for(int i=0; i<members.length; i++) {
//			System.out.println(members[i].name);
//			System.out.println(members[i].job);
//			System.out.println(members[i].age);
//		}
//		int[] a = new int[] {1,2,3,4,5};
//        Member info = new Member(); //클래스 외부(info 사용)
//        System.out.println(info);
//        System.out.println(info.name);
//        Member m1 = new Member();
//        System.out.println(m1.name); 
		
		Member info = new Member(20,"군인","김유신"); //매개변수 순서 꼭 맞춰서 하기!!!
		System.out.println(info.job);
//       Movie movie = new Movie();
//       movie.title = "베테랑2";
//       movie.genre = "액션";
//       movie.cnt=4000;
//       movie.year=2024;
//       
//       System.out.println("제목: "+movie.title+
//    		    "장르 : " +movie.genre + "관객수 : "+movie.cnt +"개봉년도 : "+movie.year);
        
        
	}

}
/*
 영화 제목, 장르, 관객수, 개봉년도
 위 항목의 데이터를 저장할 수 있는 클래스 정의
 영화 한편에 대한 데이터 입력하고 출력까지
 */







