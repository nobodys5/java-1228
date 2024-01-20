package b_Chapter02;

//while문
//: 일반적으로 반복 횟수가 지정되어 있지 않을 때 사용하는 반복문

//조건을 검사하고 해당 조건이 true인 경우 코드 블럭을 실행하는 반복문
//: if문의 반복 형태
public class D_While {
	public static void main(String[] args) {
		// 기본 구조
//		while (조건) {
//			조건이 True일 때 실행할 코드
//			>> 반복 실행할 코드 블럭이 종료되면 조건을 다시 검사
//			>> true면 반복 false면 탈출
		
//		while문 예시
		int i = 1; // for문과의 차이점은 사용할 변수가 미리 선언되어야 함
		while (i <= 5) {
			// 무한 루프
			// : 조건이 항상 참으로 루프가 종료되지 않는 경우
			System.out.println(i);
			
			// 조건이 거짓이 될 수있도록 아래와 같이 로직설정
			break;
			
		
		}
	}

}
