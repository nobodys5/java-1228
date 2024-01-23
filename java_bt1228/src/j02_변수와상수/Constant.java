package j02_변수와상수;

public class Constant {
	public static void main(String[] args) {

		int MAX_NUMBER = 100;
		int MIN_NUMBER = 0;
		
		int number = 10;
		
		number = 30;
		
		
		System.out.println("최댓값:" + MAX_NUMBER);
		System.out.println("현재값:" + number);
		System.out.println("최솟값:" + MIN_NUMBER);
		
		
		/*
		 * 상수 : 변하지 않는 수
		 * 상수임을 표시하는 법 -> 자료형 앞에 final 적기
		 * 상수표현법 -> 전부다 대문자로 작성 -> 카멜이 안되니 스네이크_언더바로 작성
		 * 상수는 무조건 초기화필수
		 */
	}

}
