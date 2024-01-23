package j05_입력;

import java.util.Scanner;

public class Input1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println(scanner.next());
		
		System.out.println("이름을 입력하시오:");
		String name = scanner.next();
		
		System.out.println("나이를 입력하시오");
		String name2 = scanner.next();
		
		
		System.out.println(name + name2);
		System.out.println("이름:" + name);
	}

}
