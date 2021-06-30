package javaJS;
class JSch06_3{
	public static void main(String args[]) {
		/* return 문 
		 * 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
		 * 반환타입이 void일 때 return문 생략가능
		 * 반환타입이 void가 아닌 경우 반드시 return문 필요!!
		 * ex
		 * int max(int a, int b){
		 * 		if(a>b)
		 * 			return a; // 조건식이 참일 떄만 실행된다
		 *         // 이건 에러뜸 why? 참일 때만이여서 거짓일 때 에러 
		 * 		else
		 * 			return b; // 참일 때와 거짓일 때 각각 return문 작성!!!
		 * }
		 */
		
		/* 반환값 return 옆 즉 작업결과로 반환될 값 타입이 일치 or 자동형변환(char,byte,short -> int)이 가능해야함!
		 *      결과를 저장할 변수의 타입도 같아야함!
		 */
		MyMath1 mm = new MyMath1();  // 객체 생성!!
		long result = mm.max(5l, 3l);  
		long result5 = mm.min(5l, 3l);  
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(9);
		System.out.println("max(5L, 3L) = " + result);
		System.out.println("min(5L, 3L) = " + result5);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		
	}
}

class MyMath1{
	void printGugudan(int dan) {
		if(!(2<= dan && dan <= 9 ))
			return; // dan의 값이 2~9단이 아닌경우, 호출한 곳으로 그냥 되돌아간다.
		for(int i =1 ; i <=9 ; i++) {
			System.out.printf("%d * %d = %d%n", dan , i ,dan * i);
		}
		return; // 반환 타입이 void 이므로 생략가능. 컴파일러 자동추가
		//메서드가 작업을 마쳤을 떄 매번 써야함 근데 생략
		//생략 가능할 때 반환타입이 void일 때 

	}
	long add(long a, long b) {  //메서드는 클래스 영역에만 정의 가능
		long result = a + b;
		return result;
		//return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	// 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드를 작성하기오
	long max(long a, long b) {
		long result = 0; 
		if(a>b) {
			result = a;
		} else {
			result = b;
		}
		return result;
		//result a > b ? a: b;
	}
	long min(long a, long b) {
		//		long result = 0;
		return a < b ? a : b;

	}
	long subtract(long a, long b) { return a - b;}
	long multiply(long a, long b) { return a * b;}
	double divide(double a, double b) { return a / b;}
}
