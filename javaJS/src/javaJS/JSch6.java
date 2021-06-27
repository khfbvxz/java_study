package javaJS;
import java.util.Scanner;

public class JSch6 { //메인메서드가 있는 클래스 있는 이름이 소스파일과 일치해야되!!!!!!
	public static void main(String[] args) {
		/* 객체지향 언어  매우 중요! 프로그래밍 언어 + 객체지향 개념(규칙)
		 * 코드의 재사용성이 높고, 유지보수가 용이 중복코드제거
		 * oop(object-oriented programing) 핵심개념
		 * 1.캡슐화 2.상속 3.추상화 4.다형성
		 */

		/* 클래스와 객체
		 * 클래스의 정의 클래스란 객체를 정의해 놓은것
		 * 클래스의 용도 클래스는 객체를 생성하는데 사용
		 * 
		 * 객체의 정의 실제로 존재하는 것. 사물 또는 개념
		 * 객체의 용도 객체가 가지고 있는 기능과 속성에 따라 다름
		 * 
		 * 객체의 구성요소 - 속성(변수)과 기능(매서드) 
		 * 객체 모든 인스턴스를 대표하는 일반적 용어
		 * 인스턴스 특정 클래스로부터 생성된 객체(예 Tv인스턴스 )
		 */
		
		/* 한 파일 여러 클래스 작성하기 
		 * public class가 있는 경우 소스파일의 이름은 반드시 public class의 이름과 일치해야 한다
		 * public class가 하나도 없는 경우 소스파일의 이름은 'Hello2.java','Hello3.java' 둘다 가능 
		 * Hello2.java
		 */
		
		/* 객체의 생성
		 * 클래스명 변수명;          // 클래스의 객체를 참조하기 위한 참조변수를 선언
		 * 변수명 = new 클래스명();  // 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
		 * Tv t;  				// Tv클래스 타입의 참조변수 t를 선언  참조변수 중요 
		 * t = new Tv();        // Tv인스턴스를 생성한 후, 생선된 Tv인스턴스의 주소를 t에 저장
		 * Tv t = new Tv();
		 */
		
		/* 객체의 사용
		 * t.channel = 7;     //Tv인스턴스의 멤버변수 channel의 값을 7로한다.
		 * t.channelDown();   //Tv인스턴스의 매서드 channelDown()을 호출한다.
		 * 
		 */
		Tv t;                
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재채널은"+t.channel+"입니다.");
	}
}

class Tv {   // 
	//Tv의 속성(멤버변수)
	String colorString;  // 색상
	boolean power;       // 전원상태 (on/off)
	int channel;         // 채널
	
	// Tv의 기능(메서드)
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}


