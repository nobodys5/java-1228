package j03_연산자;

public class Operation1 {
	public static void main(String[] args) {

		// 관계연산자
		System.out.println(10 > 5);
		
		// 10 > 5 이것을 result 라는 변수에 대입하시오
		boolean result = 10 > 5;
		System.out.println(result);
		
		int num = 7;
		System.out.println(10 > num);
		System.out.println(num < 10);
		// 기준은 무조건 왼쪽!
		
		boolean result2 = num != 10;
		System.out.println(result2);
		
		boolean result3 = num == 10;
		System.out.println(result3);
		System.out.println(!true);
		
		
		
		/*
		 * 논리연산: boolean끼리 연산하는 것
		 * AND연산(&&) - 곱
		 * true && true => true
		 * true && false => false
		 * false && false => false
		 * 
		 * OR연산(||) => 합
		 * true || true = > true
		 * true || false = > true
		 * false || false = > false
		 * 
		 * NOT연산(!)-부정
		 * !true => false
		 * !false => true
		 */
	}

}
