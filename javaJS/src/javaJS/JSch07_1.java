package javaJS;

public class JSch07_1 { 
	public static void main(String[] args) {
		/* 단일 상속(Single Inheritance)
		 * - Java는 단일상속만을 허용한다. (C++은 다중 상속 허용) // 하나의 부모만 상속
		 * class TvDVD extends Tv, DVD{} // 에러 조상은 하나만 허용된다.
		 * - 비중이 높은 클래스 하나만 상속관계로, 나머자는 포함관계로 한다.  
		 */
		
		/* Object클래스 - 모든 클래스의 최고조상
		 * - 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다.
		 * - 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.
		 *   toString(), equals(Object obj), hashCode(),....
		 * class Tv {                        class Tv extends Object { // 컴파일러가 자동추가해줌 부모가 없을떼
		 * }                           ->    }
		 * class SmartTv extends Tv{         class SmartTv extends Tv{ 
		 * }								 }
		 */
		
		/* (메서드)오버라이딩(overriding) 덮어쓰다
		 * - 상속받은 조상의 메서드를 자신의 맞게 변경하는 것
		 *  class Point{ 
		 *  	int x;
		 *  	int y;
		 *  	String getLocation(){
		 *  		return "x :"+ x + ", y :" + y;
		 *  	}
		 *  }
		 *  
		 *  class Point3D extends Point{
		 *  	int z;
		 *  	String getLocation() {  // 오버라이딩 선언부 변경 불가 
		 *  		return "x :"+ x + ", y :" + y + ", z :" + z; // 내용만 변경 가능! 구현부{}
		 *  `	}
		 *  }
		 * 
		 */
		
		/* 오버라이딩의 조건
		 * 1. 선언부(반환타입, 메서드 이름, 매개변수 목록)가 조상클래스의 메서드와 일치해야한다.
		 * 2. 접근 제어자를 조상클랫흐의 메서드보다 좁은 법위로 변경할 수 없다. // ( public protected defalt private )
		 * 3. 예외는 조상 클래스의 메거드보다 많이 선언할 수 없다. //부모 throws (1) (2) 자식 throws (1)
		 */
		
		/* 오버로딩vs오버라이딩
		 * 오버로딩   기존에 없는 새로운 메서드를 정의하는 것 (new) (이름이 같은) 상속과 관계x
		 * 오버라이딩  상속받은 메서드의 내용을 변경하는 것 (change, modify)  
		 */
	}
}