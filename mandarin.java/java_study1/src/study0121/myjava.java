package study0121;

import java.util.Scanner;

public class myjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        // 만 나이 입력
        int age = 0;
        System.out.print("나이 : ");
        age = scan.nextInt();
        
        // 태어난 년도
        int birth = 2025 - age;
        System.out.println("나이 : " + age + "살");
        System.out.println("태어난 년도 : " + birth + "년");
	}

}
