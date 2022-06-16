package basic;

public class BasicTest {

	public static void main(String[] args) {
		System.out.println('A'+3);
		System.out.println("A"+3);
		System.out.println((char)('A'+3));
		System.out.println((char)('A'+32));
		// 영어 대문자 -> 소문자 차이는 32 
		// 숫자 0 부터 문자0 -> 차이는 48
		
		// 활용 예 : 계산기 . 
		System.out.println(2+5);
		System.out.println('2'+'5');
		System.out.println(('2'-48)+('5'-48));
		// 
		System.out.println(Integer.parseInt("2")); // Integer.parseInt = 정수형  
		System.out.println(Double.parseDouble("5"));//Double.parseDouble = 실수형
	}
}
 