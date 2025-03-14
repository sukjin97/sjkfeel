package exception5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		
		//오류가 발생해도 오류가 없어도 무조건 실행
//		Scanner sc = new Scanner(System.in);
//		int money=0;
//		int total=0;
//		
//		try {
//			System.out.println("현금 : ");
//			money = sc.nextInt();
//			total = money*5;
//			
//			
//		}catch(Exception e) {
//			System.out.println("숫자만 입력하세요");
//		}finally { //오류가 나든 안나든 무조건 실행해야 하는 코드
//			System.out.println("총 금액: " + total);
//		}// 파일 열기, 데이터베이스 연결에서는 반드시 파일을 닫고, 
//		// 데이터 베이스 연결 해제 하는게 좋다.
		
		String fileName="c://test//data.txt";
		
		// 자동 자원 반환 - 파일 열기와 같은 작업시 사용한 컴퓨터 자원(메모리, 버퍼 등)
		//               을 반환 해야한다. 자동으로 반환까지 해주는 try~catch
		try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{
			String line = br.readLine();
			System.out.println(line);
			
		}catch(Exception e) {
			System.out.println("파일 열고 읽기 오류");
			e.printStackTrace();
		}
//	    BufferedReader read=null;	
//		try {
//	
//		read = new BufferedReader(new FileReader(fileName));
//		String line = read.readLine();
//		System.out.println(line);
//		
//		}catch(Exception e) {
//			System.out.println("파일 열고 읽기 오류");
//			e.printStackTrace();
//		}finally {
//			try {
//				read.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
	}

}
