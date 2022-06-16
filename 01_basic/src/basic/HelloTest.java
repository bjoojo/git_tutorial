package basic;

public class HelloTest {

	public static void main(String[] args) {
		System.out.println("Hello java!!");
		System.out.print("안녕하세요\n");		
		System.out.print("Hello Java!!\n");
		System.out.println(25+36);
		System.out.println("25+36");
		System.out.println("25"+"36"); // 문자열에서의 +는 덧셈이 아니라 결합
		System.out.println("25 + 36 = 61 ");
		System.out.println("25 + 36 ="+(25+36));
		System.out.println("25 / 36 = " +(25.0 / 36));   //실수 / 정수 = 정수
		System.out.println("25 / 36 = " +((double)25 / 36));	  // 형변환 = 캐스팅 (Casting)	
		System.out.println("25 / 36 = " +String.format("%.3f",(double)25 / 36));   // 소수 이하 n 자리까지 
		System.out.println('A'+3);
		
		// 문자열은 아스키코드가 없다 ( "A"+3 = "A3" )
	}
}
