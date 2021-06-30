package javaJS;

class JSch06_4{
	public static void main(String args[]) {
		/* 호출 스택 (call stack) // 이해 잘 해야됨!
		 * stack : 밑이 막힌 상자, 위에 차곡차곡 쌓인다.
		 * 넣을때 순서대로 1 2 3
		 * 꺼낼 때 제일 위부터 3 2 1
		 * 중간에 끼워 넣기 또는 맨 아래 꺼내는거 할 수 없음!
		 * 
		 * 호출 스택 
		 * 메서드 수행에 필요한 메모리가 제공되는 공간
		 * 메서드가 호출되면 호출스택에 메모리 할당, 종요되면 해제(제거)
		 * main  - (main()이 println()을 호출) > main(대기), println (실행)
		 * println()이 종료되면 main이 실행상태로 // 아래에 있는 메서드가 위의 메서드를 호풀한 것
		 * 								   // 맨 위의 메서드만 실행 중, 나머지는 대기중
		 * 
		 */

		/* 기본형 매개변수  연습 많이 할 것
		 * 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다. (read only) 변경 불가
		 * 플래시 동영상(javajungsuk_basic-master.zip의 flash폴더)
		 * 기본형 매개변수 예제 PrimitiveParame.exe
		 * 참조형 매개변수 예제 ReferenceParam.exe
		 * 
		 */
		
		Data d = new Data();  //객체 생성
		d.x =10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x );
		System.out.printf("%n");
		
		/* 참조형 매개변수
		 * 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다. (read & write)
		 */

		Data2 d2 = new Data2();//객체 생성
		d2.x = 10;
		System.out.println("main() : x = " + d2.x);

		change2(d2);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d2.x);
		System.out.printf("%n");
		
		/* 참조형 반환타입 
		 * 
		 */
		Data3 d3 = new Data3();//객체 생성  
		d3.x = 10;
		
		Data3 d4 = copy(d3);  // 같은 클래스안에 있어서 호출할 때 앞에 참조변수 (생략가능)없음 static 메서트여서도 있음
		                      // static 메서드는 객체 생성없이 호출 가능 
		//반환타입과 변수의 타입이 일치해야함 즉 참조형! 
		System.out.println("d3.x = "+d3.x);
		System.out.println("d4.x = "+d4.x);
	}
	
	static void change(int x) {  // 기본형 매개 변수 읽기만 가능 
		x=1000;  //지역변수         // if change에서 x값을 바꾸고 싶으면 참초형으로 바꿔야함   
		System.out.println("change() : x = " + x);
	}
	
	static void change2(Data2 d2) { // 참조형 매개변수 // 메인의 값이 복사됨 주소가
		d2.x = 2000;
		System.out.println("change() : x = " + d2.x);
	}
	static Data3 copy(Data3 d3) { 
		// 반환타입 참조형 객체의 주소를 반환 or 객체를 반환
		Data3 tmp = new Data3(); // 새로운 객체 tmp를 생성한다.
		tmp.x = d3.x; 			 // d.x의 값을 tmp.x에 복사한다.
		return tmp;				 // 복사한 객체의 주소를 반환한다.
	}
}
class Data { int x; }
class Data2 { int x; }
class Data3 { int x; }
