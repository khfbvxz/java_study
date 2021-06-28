package javaJS;
import java.awt.CardLayout;
import java.util.Scanner;

class JSch06_1{
	public static void main(String args[]) {
		 /* 클래스 1. 설계도 2. 데이터+함수 3. 사용자 정의타입
		  * 클래스 == 데이터 + 함수 
		  * 1.변수 하나의 데이터를 저장할 수 있는 공간
		  * 2.배열 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간 
		  * 3.구조체 서로 관련된 여러 데이터(종류 관계x)를 하나로 저장할 수 있는 공간  서로 관계가있는 것을 하나로 묶을 수 있음
		  * 4.클래스 데이터와 함수의 결합(구조체 + 함수)
		  * 
		  * 사용자 정의 타입 - 원하는 타입을 직접 만들 수 있다. 
		  */
		
		/* 선언위치(3가지)에 따른 변수 종류 
		 * class Variables        //클래스 영역          영역 1. 클래스 영역 - iv , cv (static+iv)
		 * {                       (선언문만 가능, 순서x       2. 메서드 영역 - lv 
		 * 		int iv;    // 인스턴스 변수                         객체생성 필요 o  객체생성시 만들어짐
		 * 		static int cv // 클래스 변수 (static 변수, 공유 변수)  객체생성 필요 x  클래스가 메모리에 올라갈떄 생성됨 
		 * 		void method()
		 * 		{
		 * 			int lv = 0;   // 지역변수 메서드 영역              메서드 종료시 자동제거 
		 * 		}
		 * }
		 */
		
		/* 클래스 변수와 인스턴스 변수 차이점
		 * ex) 카드 하트7 스페이드 4
		 * 속성 무늬 숫자    개별 객체마다 다르게 유지되어야 되어야 하는 값 
		 *     폭 넓이     공통 
		 * 개별적인것 iv 공통적인것 cv (static)
		 * class Card{
		 * 		String kind;    //무늬
		 * 		int number;		//숫자
		 * 		static int width = 100;  //폭
		 * 		static int height = 250; //넓이
		 * }
		 * 
		 * Card c = new Card(); //객체 생성
		 * c.kind = "HEART";
		 * c.number = 5;         //객체들
		 * c.width = 200;   // cv Card.width = 200;   이렇게 써야함 
		 * c.height = 300; 	      Card.height = 300;  cv는 앞에 클래스 이름
		 * 
		 * cv는 1개 iv는 객체마다 1개씩   //github javajungsuk_basic-master폴더 flash폴더
		 * 	플래쉬 동영상 중요하니깐 봐		// MemberVar.exe 
		 */
		System.out.println("Card.with=" + Card.width);
		System.out.println("Card.height=" + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은" + c1.kind + "," + c1.number + "이며 크기는(" + c1.width + ", " + c1.height +")");
		System.out.println("c2은" + c2.kind + "," + c2.number + "이며 크기는(" + c2.width + ", " + c1.height +")");
		System.out.println("c1ㅇ의 width와 height를 각각 50, 80으로 변경합니다.");
		
		Card.width = 50;  //  c1.width = 50; 
		Card.height = 80; // 오해 없게 적어야함 cv!
		
		System.out.println("c1은" + c1.kind + "," + c1.number + "이며 크기는(" + c1.width + ", " + c1.height +")");
		System.out.println("c2은" + c2.kind + "," + c2.number + "이며 크기는(" + c2.width + ", " + c1.height +")");
	}
}

class Card{
	String kind;    //무늬
	int number;		//숫자
	static int width = 100;  //폭
	static int height = 250; //넓이
}