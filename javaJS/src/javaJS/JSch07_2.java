package javaJS;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class JSch07_2 { 
	public static void main(String[] args) {
		/* 참조변수 super = this와 거의 같음 //this lv와 iv 구별에 사용
		 * - 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재 // static메서드 내에서 사용불가
		 * - 조상의 멤버를 자신의 멤버와 구별할 때 사용
		 * 저장되는 x가 두개 super.x this.x 둘 다 존재 구별super와 this
		 */
		Child c = new Child();
		c.method();
		Child2 c2 = new Child2();
		c2.method();
		
		/* super() - 조상의 생성자( this() )  참조변수 super와 관계 없음 
		 * - 조상의 생성자를 호출할 때 사용  //상속 - 생성자, 초기화블럭 상속안됨
		 * - 조상의 멤버는 조상의 생성자를 호출해서 초기화
		 * - 조상이 선언한 멤버들을 초기화 할려면 조상의 생성자를 호출하여 조상이 초기화 하게끔 코딩 
		 * class Point {                  class Point3D extends Point{
		 *    int x,y;						 int z;
		 *                                // 자손의 생성자 
		 *    Point(int x, int y) {		  Point3D(int x, int y, int z) { 	
		 *       this.x = x;                 this.x = x;  // 조상의 멤버를 초기화  // 에러는 아니지만 이렇게 하면 안됨!!
		 *       this.y = y;	iv초기화->   	 this.y = y;  // 조상의 멤버를 초기화   // 자손의 선언언한것만 초기화해야함
		 *    }                              this.z = z;
		 * }     							}
		 * 							      }  
		 *          Point3D(int x, int y, int z) {
		 *              super(x,y);  // 조상클래스의 생성자 Point(int x, int y)를 호풀
		 *              this.z=z;    // 자신의 멤버를 초기화 
		 *              
		 * - 생성자의 첫 줄에 반드시 생성자를 호출해야 한다.  //중요!!!!!!// 추가조건  // super(), this() 호풓
		 *   그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입
		 *   class Point{ int x; int y; }
		 *   Point() { this(0.0); }
		 *   Point(int x, int y) {
		 *  //  super(); //Object(); //조상의 기본 생성자 호출하는 코드를 넣는다. 
		 *   	this.x = x;
		 *      this.y = y;
		 *   }   
		 */
		
		
	}
}

class Parent {int x = 10; /* super.x */}

class Child extends Parent {
	int x =20; // this.x
	
	void method() {
		System.out.println("x=" + x); //가까운 쪽 this.x 
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
//
class Parent2 {int x = 10; /* super.x와 this.x 둘 다 가능 */}

class Child2 extends Parent2 {
	void method() {
		System.out.println("x=" + x); //조상 x 
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
