package exception4;

public class Member {
   private String name;
   private int age;
   
   public Member() {}
   public Member(String name, int age) {
	   this.name=name;
	   this.age=age;
   }
   
   public void nameCount() {
	   if(name==null) {
		   throw new NullPointerException("이름 입력안함");
		   //예외 발생 시키기 - throw
	   }
	   if(name.length()==2) {
		   System.out.println("이름이 외자 이다.");
	   }else if(name.length()==4) {
		   System.out.println("이름이 3자이다.");
	   }else if(name.length()==3) {
		   System.out.println("이름이 2자이다.");
	   }
	   new NullPointerException("이름 입력 안함");
   }
   
   public int getBirthYear() throws Exception{
	   if(age == 0) {
		   throw new Exception("나이 입력 안함");
	   }
	   return 2025-age;
   }
}
