package javaJS;



class JSch06_5{
	public static void main(String args[]) {
		/* 비교해서 잘 알아 둘 것!
		 * static 메서드 = 클래스 메서드  iv 사용안하면 ex) Math.random(),Math.round()
		 * - 객체생성 없이!! '클래스이름.메서드이름()'으로 호출  
		 * - 인스턴스 멤버(iv, im)와 관련된 작업을 하는 메서드  im 인스턴스 메서드
		 * - 메서드 내에서 인스턴스 변수 (iv) 사용가능
		 *  // 본인이 메서드를 만들었는데 static을 붙일지 말지 결정할 줄 알아야함 
		 *     어떻게 결정하는냐-> iv를 사용하지 않을 떄 why? iv사용여부!! 
		 *     static 을 언제 붙여야 할까?
		 *     속성(멤버 변수) 중에서 공통 속성에 static을 붙인다. 
		 *     인스턴스 멤버(iv,im)을 사용하지 않는 메서드(명령문 집합)에 static을 붙인다. 
		 *  객체=iv묶음!! 변수 묶어논거~~~~~~~~~
		 * 인스턴스 메서드 static 안붙은거  iv 사용하면
		 * - 인스턴스 생성후 '참조변수.메서드이름()' 으로 호출
		 * - 인스턴스 멤버(iv,im)와 관련된 작업을 하는 메서드
		 * - 메서드 내에서 인스턴스 변수 (iv) 사용가능
		 *  개별 속성
		 * 
		 */
		System.out.println(MyMath2.add(200L,100L));  // 클래스 메서드 호출 객체생성 없이 호출~
		MyMath2 mm = new MyMath2();                 // 인스턴스 생성
		mm.a=300L;  //iv
		mm.b=400L;
		System.out.println(mm.add());               // 인스턴스 메서드 호출 // 생성 후 호출~
		
		/* 메서드 간의 호출과 참조 
		 * static 메서드 인스턴스 변수 (iv)를 사용할 수 없다!
		 * sm은 sm 호출 가능? yes!
		 * sm은 iv 사용 가능? no!  // iv 객체 생성 후 사용 가능!!!!!!!!!
		 * sm은 im 호출 가능? no!  // im은 iv를 사용하는 메서드이기 떄문
		 * 왜? sm은 iv,im을 쓸 수 없나요? // sm 호출시 객체 iv묶음 이 없을 수도 있어서 
		 */
		
	}
}
class MyMath2{
	long a, b;   // iv 인스턴스 변수 
		
	long add() {    				   // 인스턴스 메서드 iv사용
		return a + b; 			       // iv 
	}
	
	static long add(long a, long b) {  //클래스 메서드 //lv 지역변수 
		return a + b;                  // lv 임 가까운 쪽
	}
}
class TestClass{
	void instanceMethod() {}
	static void staticMethod() {}
	void instanceMethod2() {
		instanceMethod();
		staticMethod();   // sm 호출 항상 가능
	}
	static void staticMethod2() {
//		instanceMethod(); // 에러  // im호출 x 객체가 필요!!
		staticMethod();
	}
}
class TestClass2{
	int iv;			// 객체 생성 후 사용가능
	static int cv;  // 객체생성 안해도 메모리에 올라감 언제나 사용가능
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv); //언제든 사용가능 
	}
	static void staticMethod() {  //객체 생성 없이 호출 가능
//		System.out.println(iv); // 에러 객체가 있을수도 있고 없을수도 있어서 안됨!
		System.out.println(cv);
	}
}