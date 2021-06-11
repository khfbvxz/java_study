package javaJS;

public class JSch03_2 {

	public static void main(String[] args) {
		/*비교 연산자 두 피연산자를 비교해서 true 또는 false
		 * >, <, >=, <=  'A'>'B'->65>66 false
		 * ==, != 
		 * 문자열 비교에는 == 대신 equals()를 사용해야함
		 */
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3==str4);     // false
		System.out.println(str3.equals(str4));
		
		/*논리 연산자 &&(AND) ||(OR)
		 */
		//i는 2의 배수 또는 3의배수지만 6의 배수는 아니다.
		// (i%2==0 || i%3==0) && i%6!=0
		//문자 ch는 숫자 ('0'~'9')이다.
		//'0' <= ch && ch <='9' '0'=48~'9'=57
		//논리 부정연산자 false <=> true
		// ch < 'a' || ch >'z' = !('a' <= ch && ch <= 'z'
		//                             소문자가 아닌지
		
		//조건 연산자 조건식의 결과에 따라 연산결과를 달리한다
		//조건식 ? 식1 : 식2 
		//조건식이 참이면 식1 거짓이면 식2(식에 값이 올수 있음)
		//result = (x > y) ? x : y ;
		//위 식 if문 과 같이 할 수 있음 if문을 간단히 할 수 있음
		//if (x > y) 
		//   result = x;
		//else
		//   result = y;
		
		/* 대입 연산자 오른쪽 피연산자를 왼쪽 피연산자에 저장 후 저장된 값을 반환
		 *  (left)lvalue x=3 rvalue(right)
		 *  복합 대입 연산자 
		 *  ex) i += 3; ->  i = i+3;
		 *      i *= (10 = j); -> i = i * (10 + j);  
		 */
		
	}

}
