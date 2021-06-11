package javaJS;

public class JSch03_1 {

	public static void main(String[] args) {
		/* 형변환 연산자 변수 또는 상수의 타입을 다른차입으로 변환 
		 * (타입)피연산자 ex) double b = 85.4;
		 *                int score = (int)d; //int i = 3.14f; //에러 플롯 범위가 intqhek 더 넓어서 에러 값 손실 
		 * int->char (char)65  'A' 유니코드 문자표 반대는 (int)'A'  65
		 * 자동형변환 컴파일러가 자동으로 형변환 작은값보다 큰값에 넣을때
		 * float f = (float)1234;
		 * int i = (int)3.14f; // 출력 3
		 */
		/* 사직연산자 
		 * int/int=int 소수점 이하 버려짐
		 * 소수점이하를 원하면 둘중하나 또는 둘다 실수로 변환 후 계산
		 * 산술 변환 계산할 때 타입을 자동으로 바꾸게 하는 것
		 *        연산 전에 피연산자의 타입을 일치시키는 것
		 * 중요!! 1. 두 피연산자의 타입을 같게 일치 (보다 큰타입으로 일치 값손실 방지)
		 *       2.피연잔사의 타입이 int보다 작은 타입이면 int로 변환 
		 *        byte+short -> int+int ->int
		 *        char+short -> int+int ->int
		 */
		int a = 1_000_000;
		int b = 2_000_000;
//		long c = a * b;   // a*b = 2,000,000,000,000 오버플로우 발생
		long c = (long)a * b; // 한쪽만 해도 됨 
		System.out.println(c);
		
		// 반올림 Math.round() 실수를 소수점 첫째자리에서 반올림한 정수로 반환
		double pi = 3.141592;
		double shortpi =Math.round(pi*1000)/1000.0; // 1000을 곱하고 다시 1000.0 실수형으로 나누면 
		System.out.println(shortpi);                // 3.142 소수 3째자리까지 나옴 
		System.out.println(pi);                // 3.142 소수 3째자리까지 나옴 
		System.out.println(Math.round(pi));    // 3               // 3.142 소수 3째자리까지 나옴 
		System.out.println(Math.round(pi*1000)/1000);    // 3               // 3.142 소수 3째자리까지 나옴 
		//소수점 아래 짤라낼때
		System.out.println((int)(pi*1000)/1000.0);
		
		//나머지 연산자 % 오른쪽 피연산자로 나누고 남은 나머지를 반환
		//나누는 피연산자는 0이 아닌 정수만 허용 부호 무시 
		System.out.println(10%8);
		System.out.println(10%-8);
		
	}

}
