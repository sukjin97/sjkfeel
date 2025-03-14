package exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		
		// 예외처리 - 코드실행에 있어서 예외적인 부분을 처리 하기 위한 방법
		// 예외적 상황이 발생하는 것은 올바른 실행이 이루어 지지 않아서
		// 오류 또는 에러가 발생한다.
		// 자바에서 예외처리는 오류에 대한 처리 이다.
		// 예외처리는 오류를 해결하는 방법이 아닌 회피하는 방법이다. 
		
		int a=10;
		Scanner sc = new Scanner(System.in);
		
		try { // 오류 가 예상되는 코드를 try { }에 작성한다
		System.out.println("a 변수 입력: ");
		a=sc.nextInt();
		System.out.println( a/0 ); //에러상황
		}catch( ArithmeticException e ){//문제를 해결하지는 않음. try에서 발생한 문제를 가져감. 즉 try에서 오류가 발생해야 함
			System.out.println("0으로 나누기 하면 안되" );
		}catch( Exception i) {
			System.out.println("정수 입력 해야되!");
		}
		//try 구문에서 오류가 발생하면 catch 구문이 실행된다.
		//catch 구문이 실행되려면 발생한 오류를 처리할 수 있는 클래스를
		//가지고 있어야 한다.
		//try부분에서 오류 발생 시 처음 오류가 발생한 시점에서 catch가 시행됨
		System.out.println("프로그램 종료"); //비정상적으로 끝나면 안됨

	}

}
