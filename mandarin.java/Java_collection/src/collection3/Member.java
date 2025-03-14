package collection3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class Member implements Comparable<Member>{
	   private Long id; //회원번호
	   private String memberId; //회원 아이디
	   private String email;// 회원 이메일
	   private String password; //회원 비밀번호
	   private String birth; // 생년월일(8자리)
	   private int age; // 나이
//	컬렉션에서 contains, indexOf와 같은 비교하는 동작 메서드
//  사용하려면 사용자 정의 클래스에서는 equals를 구현해야 한다.
	   
	   @Override
	   public boolean equals(Object obj) {
		  Member temp = (Member)obj;
		   boolean isSame = this.birth.equals(temp.birth);
		   isSame = isSame && (this.email.equals(temp.email));
		   isSame = isSame && (this.memberId.equals(temp.memberId));
		   return isSame;
	   }
	   @Override
	   public int compareTo(Member o) {
		  //정렬을 위한 compareTo 메서드 구현
		  //정렬 기준을 정해야 한다.
		   
		   return this.birth.compareTo(o.birth)*-1;
	   }

}
//클래스 정의 
//인스턴스 변수의 접근 제어자는 private
//인스턴스 변수에 대해 get, set메서드
//toString 메서드 만들기