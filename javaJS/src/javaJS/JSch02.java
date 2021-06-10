package javaJS;

public class JSch02 {

	public static void main(String[] args) {
		System.out.println(6+3);// 덧셈 뺄셈 등 계산 결과 출력
		System.out.println("6+3");// " " 큰 따옴표 사이 그대로 출력
		
		int x1 = 100; // x : 변수(하나의 값을 저장하기위한 공간,
		// x = 200;    
		//리터럴 : 그 자체로 값을 의미 100, 200 
		final int y1 =300; // y는 상수 
		// y=200; 
		System.out.println(x1);// " " 큰 따옴표 사이 그대로 출력
		System.out.println(y1);
		/* 리터럴의 접두사 및 접미사
		 * 접미사 : 정수형 L , 실수형 f ,d  */
		boolean power = true; //true or false 
		byte b = 127; // -128~127
		int oct = 010;//8진수, 10진수로8
		int hex = 0x10;//16진수 10진수로 16 범위 약 +-20억
		long l=1_000_000_000L;//long 법위 -2^63 ~ 2^63-1 
	    float f = 3.14f; // 접미사 f 생략 불가
	    double d = 3.14; // 접미사 d 생략 가능 
	    //3.14f 는 double 법위가 더 넓기 때문에 가능 
		System.out.println(power);
		System.out.println(b);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		// 리터럴 값 확인
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		/*문자와 문자열
		 * char ch = 'a'; '':// 에러 ''사이 하나의 문자 필요
		 * String s = "ABC"; "";//빈 문자열
		 */
		char ch = 'A';
		
		int i = 'A'; //A의 문자 코드 65 출력
		System.out.println(ch); 
		System.out.println(i); 
		String s1 = "ABC"; // String(< 클래스) s1="ABC";
		//String s2 = new String ("ABC"); 이후에 
		String str = "";
		String str1 = "ABCD";
		String str2 = "123";
		String str3 = str1 + str2;
		String name = "JA" + "VA";
		String str4 = name + 8.0;
		System.out.println(s1); 
		System.out.println(str); //빈 문자열 (empty string)
		System.out.println(str3); //문자열 합치기
		System.out.println(name); 
		System.out.println(7+" "); // 숫자+문자 = 문자+숫자 = 문자+문자 =문자
		System.out.println(" "+7); 
		System.out.println(7+""); 
		System.out.println(""+""); 
		System.out.println(7+7+""); // 앞에 두개 더하고 문자열 됨 결합순서 주의
		System.out.println(""+7+7); // 문자열이 된후 문자+문자 가 됨
		
	}

}
