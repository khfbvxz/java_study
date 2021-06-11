package javaJS;

public class JSch02_2 {

	public static void main(String[] args) {
	//기본형 8개 boolean, char, byte, short, int, long, float, double 실제 값을 저장
	//참조형 기본형을 제외한 나머지 String, System 등 메모리 주소를 저장 4byte(40억) 또는 8byte(160경)
		/*println() 단점 실수의 자리수 조절 불가 모든 정수 10진수로만 출력
		 */
		System.out.println(10/3);// 출력 3 정수/정수
		System.out.println(10.0/3);// 출력 3.333333 실수/정수
		/* printf() 출력형식 지정 가능 줄바꿈 x
		 * System.out.printf("%.2f",10.0.3); // 3.33 ("%.2f") 지시자 
		 * System.out.printf("%d",0x1A); // 26
		 * System.out.printf("%X",0x1A); // 1A 
		 * 지시자 JavaAPI -> Formatter 지시자 확인 할것
		 * 정수 출력 %b 불리언, %d 10진수, %o 8진수, %x,%X 16진수
		 * 실수 출력 %f 실수 10진수 부동소수점, %e,%E 지수  %g %f %e중 간략한거 출력
		 * 문자 문자열 %c 문자, %s 문자열 
		 * 개행문자 \n,%n  줄바꿈
		 */
		System.out.printf("%d%n", 15);                         //15 10진수 
		System.out.printf("%o%n", 15);                         //17 8진수
		System.out.printf("%x%n", 15);                         //f 16진수
		System.out.printf("%s%n", Integer.toBinaryString(15)); //1111 2진수 정수->2진수 In Integer.toBinaryString()
		System.out.printf("%#o%n", 15);   //접두사 붙이려면 지시자 앞 #//17 8진수
		System.out.printf("%#x%n", 15);   //지시자 대문자면 F로 출력  //f 16진수
		float f = 123.4567890f;           //float 보다는 더 정밀한 double(15자리)쓰는게 더 좋음 
		double f1 = 123.456789;
		System.out.printf("%f%n", f);   //정밀도 앞에서부터 7자리 
		System.out.printf("%f%n", f1);   
		System.out.printf("%e%n", f);   //지수 형식  8 반올림되서 나옴
		System.out.printf("%g%n", 123.456789);   //7자리 반올림
		System.out.printf("%g%n", 0.00000001);   //지수 형식  숫자 0이 많을 경유
		
		System.out.printf("[%5d]%n", 10);   // [   10]  5 자리 기본 오른쪽정렬
		System.out.printf("[%-5d]%n", 10);  // [10   ]  - 왼쪽정렬
		System.out.printf("[%05d]%n", 10);   // [00010] 지시자 앞 0 -> 빈자리 공백대신 0
		System.out.printf("f1=%14.10f%n", f1);// 14 전체자리 .10 소수점 아래자리
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n", url);     // %d 랑 같음
		System.out.printf("[%20s]%n", url);   //오른쪽정렬 나머지 공백
		System.out.printf("[%-20s]%n", url);  //왼쪽정렬 나머지 공백
		System.out.printf("[%.8s]%n", url);   // .8 8자리 까지만 .도 하나로 침
		
	}

}
