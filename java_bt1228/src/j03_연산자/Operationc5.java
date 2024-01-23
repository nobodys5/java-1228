package j03_연산자;

public class Operationc5 {
	public static void main(String[] args) {
		String str = "안녕";
		System.out.println(str.length());
		
		/*
		 * pw
		 * 비밀번호가  8 ~ 16자리가 되어야함.
		 * 8 ~ 16 자리를 충족하면 비밀번호가 확인되었습니다.
		 * 비밀번호자릿수를 맞춰주세요
		 * 비밀번호 미작성 시 비밀번호를 입력하세요
		 */
		
		String pw = "121212";
		String result;
		System.out.println(pw.length());
		int pwCount = pw.length();
		    //변수명 에 패스워드 길이를 담는다
		
		result = pwCount > 7 && pwCount < 17 ? "비밀번호가 확인되었습니다."
				: pwCount == 0 ? "비밀번호를 입력하세요"
				: pwCount < 8 || pwCount > 16 ? "비밀번호자릿수를 맞춰주세요"
				: "404";		
			System.out.println(result);
		
	}

}
