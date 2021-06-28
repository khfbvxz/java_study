package javaJS;
import java.awt.CardLayout;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class JSch06_2{
	public static void main(String args[]) {
		/* 메서드란? 메서드의 선언부와 구현부
		 * 매서드란  //black box라고도 함
		 * 1. 문장들을 묶어놓은 것. // c언어 함수랑 같은 작용
		 * -작업단위로 문장들의 묶어서 이름을 붙인 것 
		 * 2.값(입력)을 받아서 처리하고, 결과를 반환 (출력) 
		 * 장점 -코드의 중복을 줄일 수 있다. 
		 * 	   -코드의 관리가 쉽다.
		 * 	   -코드를 재사용할 수 있다.
		 * 	   -코드가 간결해서 이해하기 쉬워진다.
		 * 메서드의 작성 
		 * - 반복적으로 수행되는 여러문장을 메서드로 작성
		 * - 하나의 메서드는 한 가지 기능만 수행하도록 작성
		 * 메서드 = 선언부 + 구현부
		 *  // 반환 타입 없을 때 void 
		 * 변환타입 메서드이름 (타입 변수명, 타입 변수명,...)
		 * {
		 * 		//메서드 호출시 수행될 코드 
		 * }
		 * int add(int a, int b) // 매개변수 parameter
		 * {
		 * 		int result = a+b;
		 * 		return result; // 호출한 메서드로 결과를 반환한다. 출력 0~1개 
		 *                     // 작업결과가 여러개면 배열이용or객체로 묶어서
		 * }	
		 * 메서드의 구현부 
		 * 지역변수(lv) : 메서드 내에 선언된 변수 a, b, result  매개변수도 지역변수
		 * 다른 메서드의 이름이 겹쳐도 상관없음 영역이 겹치지 않아야함!
		 */
		
		/* 메서드의 호출 
		 * 매서드 이름(값1, 값2, ...); // 메서드를 호출하는 방법 / 작업에 필요한 값들
		 * print99All();           // void print99All()호출
		 * int result = add(3, 5); // int add(int x, int y)를 호출하고 결과를 result에 저장
		 * 작업결과를 저장할 변수 
		 */
		
		/* 메서드의 실행 흐름
		 *  MyMath mm = new MyMath();  //먼저 인스턴스를 생성한다. 1.
		 *  long value = mm.add(1L, 2L);  // 메서드를 호출  2. 
		 *  long add (long a, long b) {
		 *  	long result = a + b;
		 *  	return result ;      // result -> value 
		 *  }
		 *  1. main 메서드에서 add를 호출한다. 인수 1L과 2L이 메서드 add의 매개변수 a,b에 각각 복사(대입)된다.
		 *  2. 메서드의 add 괄호()안에 있는 문장들이 순서대로 수행된다.
		 *  3. 메서드의 add의 모든 문장이 실행되거나 return문을 만나면, 호출한 메서드(main메서드)로
		 *     되돌아와서 이후의 문장들을 실행한다.
		 */
		
		MyMath mm = new MyMath();  // 객체 생성!!
		long result = mm.max(5l, 3l);  
		long result5 = mm.min(5l, 3l);  
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("max(5L, 3L) = " + result);
		System.out.println("min(5L, 3L) = " + result5);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath{
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
