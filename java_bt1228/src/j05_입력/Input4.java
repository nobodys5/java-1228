package j05_입력;

import java.util.Scanner;

public class Input4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		System.out.println("이름:" + name);
		
		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt();
		System.out.println("나이:" + age);
		
		System.out.println("주소를 입력하세요");
		String address = scanner.nextLine();
		System.out.println("주소:" + address);
		
		System.out.println("연락처를 입력하세요");
		String phone = scanner.next();
		System.out.println("연락처:" + phone);
		/*
		 * <자기소개 프로그램>
		 * 이름 : 홍길동	next()		name	
		 * 나이 : 18		nextint()	age
		 * 주소 : 부산 진구 가야동	nextLine()	address
		 * 연락처 : 010-3300-4698	next()	phone
		 * 
		 * 
		 * 출력
		 * 사용자의 이름은 홍길동이고 나이는 18세입니다.
		 * 주소는 부산 진구 가야동입니다.
		 * 연락처는 010-3300-4698입니다.
		 */
		
	}

}
