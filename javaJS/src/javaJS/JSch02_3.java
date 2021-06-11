package javaJS;
import java.util.*; // import문 추가 *은 모든 Scanner만 사용할 경우 
public class JSch02_3 {

	public static void main(String[] args) {
		/* 화면에서 입력받기 Scanner
		 * Scanner 화면으로부터 데이터를 입력받는 기능을 하는 클래스
		 * import 문 추가해야됨 7장 자세히 배움
		 * import java.util.*;
		 * Scanner 객체의 생성해야됨 Scanner scanner = new Scanner (System.in)<-화면입력
		 * Scanner 객체 사용  int num = scanner.nextInt();  화면에서 입렵받은 정수를 num에 저장 실수는 Float
		 * String input = scanner.nextLine(); // 화면에서 입력받은 내용을 input에 저장 next.Line() 한 행
		 * int num = Integer.parseInt(input); //문자열(input)을 숫자(num)로 변환    
		 * 숫자->문자열 숫자+"" 문자열->숫자  Integer.paraseInt()                               
		 */
		Scanner scanner = new Scanner (System.in); //입력된 값 녹색
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); 
		System.out.println(num);// 문자가 아닌 숫자가 출력됨
		
		/* 문자와 숫자간의 변환 
		 * 숫자->문자 3+'0' 문자->숫자 '3'-'0'
		 * 숫자->문자열 3+"" 문자->문자열 '3'+""
		 * 문자열-> 숫자 Integer.parseInt("3")
		 * 문자열-> 숫자 Double.parseDouble("3.4")
		 * 문자열 ->문자 "3" -> '3' charAt(0)  "3".charAt(0)
		 */
		String str = "3";
		System.out.println(str.charAt(0)-'0');      // '3' - '0'  = 숫자 3
		System.out.println('3'-'0'+1);              // 4
		System.out.println(Integer.parseInt(str)+1);  // 3  +1
		System.out.println(str + 1);                // 31 앞에 문자열 "3" 이여서 뒤에도 문자렬 "1"로 변환
		System.out.println(3 +'0');                 // 51 '0' 은 숫자로 48
	}

}
