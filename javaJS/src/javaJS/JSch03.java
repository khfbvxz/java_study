package javaJS;

public class JSch03 {

	public static void main(String[] args) {
		/*연산자 
		 * 산술 연산자 + - *  / %
		 * 비교 연산자 > < >= <= == !=
		 * 논리 연산자 &&(AND) ||(OR) !
		 * 대입연산자
		 * 기타 (type) ?:(삼항연산자) instanceof 
		 * 연산자 우선순위
		 * 산술 > 비교 > 논리 > 대입   
		 * 단항(1) > 단항(2) > 삼함(3) 
		 * 단항 연산자와 대입 연산자를 제외한 모든 연산의 진행발향 왼쪽에서 오른쪽 
		 * 증감 연산자 ++  피연산자의 값을 1 증가   
		 * 감소 연산자 --  피연산자의 값을 1 감소
		 * 전위형 j = ++i; 값이 먼저 증    ++ㅑ;
		 *                            j = i ;  
		 * 후위형 j = i++; 값이 나중에 증가  j = i;
		 *                             i++
		 *부호면산자 '-' 피연산자의 부호를 반대로                             
		 *                             
		 */
		int i=3, j=0;
		j = i; // 후위형
		i++;
		System.out.println("j=i++; 실행 후 , i=" + i +", j="+j);
		i=3;
		j=0;
		++i;
		j = i; // 전위형
		System.out.println("j=++i; 실행 후 , i=" + i +", j="+j);
	}

}
