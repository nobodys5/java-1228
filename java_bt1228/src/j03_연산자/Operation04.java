package j03_연산자;

public class Operation04 {
	public static void main(String[] args) {
		boolean result;
		String result2;
		
		System.out.println( 10 > 5);
		System.out.println( 10 < 5);
	
		result = 10 > 5;
		result2 = 10 > 5 ? "O" : "X";
		System.out.println(result2);
		
		int height = 170;
		String result3;
		
		result3 = height > 170 ? "A"
				: height > 160 ? "B"
				: height > 150 ? "C"
				: "D";
				System.out.println(result3);
	}

}
