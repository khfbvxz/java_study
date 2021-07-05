package javaJS;
import java.util.Scanner;

public class JSch7 { 
	public static void main(String[] args) {
		/* 상속
		 * -기존의 킁래스로 새로운 클래스를 작성하는 것(코드의 재사용)
		 * - 두 클래스를 부모와 자식으로 관계를 맺어주는 것.
		 * - 자손은 조상(부모의 부모)의 모든 멤버를 상속 받는다.(생성자, 초기화 블럭 제외)
		 * - 자손의 멤버 개수는 조상보다 적을 수 없다. (같거나 많다.)
		 * - 자손의 변경은 조상에 영향ㅇ ㄹ 미치지 않는다. 
		 * class 자식클래스 extends 부모 클래스 { // 확장개념 이여서 extend
		 * }
		 * 
		 * class Parent{}
		 * class Child(자식) extends Parent(부모){} 
		 */
		SmartTv stv = new SmartTv();
		stv.channel = 10;     // 조상클래스로부터 상속받은 멤버
		stv.channelUp();      // 조상클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello world");
		stv.caption = true; // 캡션(자막)기능을 켠다.
		stv.displayCaption("Hello world~");
		// 조상의 변경은 자손의 영향을 미칠 수 있고 자손의 변경은 조상에 영향을 끼치지 않음
		
		/* 포함관계 
		 * 포함(composite)
		 * - 클래스의 멤버로 참조변수를 선언하는 것
		 * - 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다.
		 * class Circle{
		 * 		Point c = new Point(); //원점 class Point{int x; int y;}
		 * 		int r; // 반지름
		 */
		
		/* 클래스 간의 관계 결정하기
		 * 상속관계 '~은 ~이다. (is-a)'         상속은 제약이 많아 꼭 필요할 때만.
		 * 포함관계 '~은 ~을 가지고 있다.(has-a)'  90% 포함
		 * 
		 */
	}
}
class Tv{  //부모 멤버 5개
	boolean power; // 전원상태 (on/off)
	int channel;
	void power()       { power = !power; }
	void channelUp()   { ++channel;  }
	void channelDown() { --channel;  }
}
// 자식멤버 2개 +부모멤버5개 =7개 
class SmartTv extends Tv {   // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 
	boolean caption;         // 캡션상태 (on/off)
	void displayCaption(String text) {
		if(caption) {        // 캡션 상태가 on(true)일 떄만 text응 보여준다.
			System.out.println(text);
		}
	}
}

