package j04_문자열;

public class String2 {
public static void main(String[] args) {
	
	String address = "부산광역시 서구 부민동";
	System.out.println(address.replace(' ','-'));// 스페이스를 다른단어로 바꿔줌 replace
	
	String address2 = "부산광역시 연제구 연산동";
	String replaceAddress = address2.replaceAll("연 ", "홍");// 문자열을 다른단어로 바꿔줌 replace all
	System.out.println(replaceAddress);
	
	/*
	 *  01033004698
	 *  -> 번호 저장완료
	 *  
	 *  010-3300-4698
	 *  ->01033004698 번호 저장완료
	 *  
	 *  010/3300/4698
	 *  ->01033004698 번호 저장완료
	 *  
	 *  010-3300-466987
	 *  -> 번호가 옳바르지 않습니다.
	 *  
	 *  삼항연산자, replace 등을 사용
	 */
	
	String phoneNumber = "01033004698";
	
	String result = phoneNumber.length() == 11 ? "번호 저장완료"
				 	: phoneNumber.length() != 13 ? "번호가 옳바르지 않습니다."
				 	: phoneNumber.replaceAll("/", "").replaceAll("-", "");
	System.out.println(result);
	
	String phoneNumbers2 = "010/3300/4698 , 010/1234/5678";
	// 011-3300-4698/011-1234-5678
	String result2 = phoneNumbers2.replaceAll("010", "011")
			.replaceAll("/", "-")
			.replaceAll(",", "/");
	System.out.println(result2);
				 	
}
}
