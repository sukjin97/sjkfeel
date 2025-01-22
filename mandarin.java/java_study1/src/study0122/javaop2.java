package study0122;

public class javaop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //  증감 연산자 ++ , --
		
		int a = 10 , b = 10 , result=0;
		// ++
		System.out.println("++ 전 : " + a);
		a++; //a++=a+l
		System.out.println(" ++ 후 : " + a);
		
		++a;
		System.out.println(" ++a : "+ a);
		
		// 증감연산자의 위치가 변수 앞, 변수 뒤 차이
		a=10;
		result = a++;
		System.out.println("result = a++  : " + result); //증가하지 않음 r=a; a=a+1;의 순서(증가되기 전의 값. 즉 나중에 중가ㅣ)
		result = ++b;
		System.out.println("result = ++b : "+result ); //증가된 값 b=b+1; r=b;의 순서(증가된 후의 값)
		
		//증감연산자를 변수 앞에 붙이면 우선순위가 상위권 
		//증감 연산자를 변수 뒤에 붙이면 우선순위가 하위권
		
	}

}
