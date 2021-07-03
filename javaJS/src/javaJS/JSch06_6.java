package javaJS;

class JSch06_6{
	public static void main(String args[]) {
		/* 오버로딩 ( overloading ) 정확한 명칭 메서드 오버로딩  c++에는 연산자 오버로딩이 있음
		 * 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것
		 * 원래  메서드 : 메서드 이름 1대1이여야함 
		 * 오버로딩  n : 1 
		 * 대표적 예) void println(boolean x), void println(int x)
		 * 
		 * 오버로딩이 성립하기 위한 조건 중요!
		 * - 메서드 이름이 같아야 한다.
		 * - 매개 변수의 개수 또는 타입이 달라야 한다.
		 * - 반환 타입은 영향없다 
		 * 
		 * int add (int a, int b) { return a+b; }  // 이런경우 오버로딩 아님 메서드 중복정의임
		 * int add (int x, int y) { return x+y; }
		 * 
		 * int add (int a, int b) { return a+b; }  // 이런 경우도 오버로딩 아님
		 * long add (int a , int b) { return (long)(a+b);} // 중복정의 반환타입은 영향 x
		 * 
		 * long add (int a , int b) { return a+b;}   // 오버로딩 성립
		 * long add (long a , long b) { return a+b;}
		 * 
		 */
		MyMath3 mm	= new MyMath3();
		//The method add(int, long) is ambiguos(확실하지 않음) for the type Mymath3 
		System.out.println("mm.add(3, 3) 결과:"   + mm.add(3,3));
		System.out.println("mm.add(3L, 3) 결과:"  + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과:"  + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과:" + mm.add(3L,3L));
		
		int[] a = {100,200,300};
		System.out.println("int add(int a , int b) - " + mm.add(a));
		
		/* 생성자 (constructor)
		 * 인스턴스가 생성될 떄마다 호출되는 '인스턴스 초기화 메서드' 객체 (iv 묶음)  iv 초기화
		 * 							= iv 초기화 Time t = new Time(); //사실 얘도 생성자 
		 * 									  t.hour = 12;
		 * Time t = new Time(12,34,56);   <-  t.minute = 34;      // 번거로움
		 *                  생성자 호출	    	  t.second = 56;
		 *               생성자 추가햐야함
		 *               
		 * - 이름이 클래스 이름과 같아야 한다. 
		 * - 리턴값이 없다. (void 안붙임)
		 * - 모든 클래스는 반드시 생성자를 가져야 한다. 
		 * 
		 *   클래스이름(타입 변수명, 타입 변수명, ...){
		 *      // 인스턴스 생성 시 수행될 코드.
		 *      // 주로 인스턴스 변수의 초기화 코드를 적는다.
		 *   }
		 */
		
		/* 기본 생성자(defult constructor)
		 * - 매개변수가 없는 생성자 
		 * - 생성자가 하나도 없을 때만, 컴파일러가 자동 추가!!
		 * 클래스이름() {} // 기본 생성자
		 * Point() {}   // Point클래스의 기본 생성자  원래는 직접 작성해야함 
		 */
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error 발생 -> 기본생성자를 생성하면 에러 없어짐!
	}
}

class Car {
	String color;    // 색상
	String geatType; // 변속기 종류 - auto(자동), manual(수동)
	int door;        // 문의 개수
	
	Car() {} // 기본 생성자 
	Car(String c, String g, int d){ // 매개변수가 있는 생성자 
		color = c;
		geatType = g;
		door = d;
		/* iv 초기화 위와 같은데 코드가 간결해짐!
		 *  Car c = new Car();
		 *  c.color = "white";       매개변수가 있는 생성자 호출 한거 
		 *  c.geatType = "auto";  -> Car c = new Car("white","auto",4);
		 *  c.door = 4;
		 */
	}
}

class Data_1{  // 생성자 0개
	int value; // 기본생성자가 자동 추가 Data_1() [] 원래 기본생성자를 추가해야함
}
class Data_2 {  //매개변수가 있는 생성자.
	int value;
	Data_2() {} // 기본 생성자!! 꼭 넣어야됨!!!
	Data_2(int x){
		value = x;
	}
}
//  오버로딩의 올바른 예 - 매개변수는 다르지만 같은 의미의 기능 수행 
class MyMath3{
	int add (int a, int b) {
		System.out.print("int add(int a , int b) - ");
		return a+b;
	}
	long add (int a, long b) {
		System.out.print("long add(int  a , long b) - ");
		return a+b;
	}
	long add (long a, int b) {
		System.out.print("long add(long  a , int b) - ");
		return a+b;
	}
	long add (long a, long b) {
		System.out.print("long add(long  a , long b) - ");
		return a+b;
	}
	int add(int[] a) {  // 배열의 모든 요소의 함을 결과로 돌려준다.
		System.out.print("int add(int[] a) -");
		int result = 0;
		for(int i = 0 ; i < a.length ; i++)
			result += a[i];
		return result;
	}
}

