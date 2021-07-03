package javaJS;

class JSch06_7{
	public static void main(String args[]) {
		/* 생성자 this() 
		 * - 같은클래스에서 있는 생성자에서  다른 클래스있는 생성자 호출할 떄 사용
		 * - 다른 생성자 호출시 첫 줄에서만 사용가능!!
		 */
		
		/* 참조변수 this  같지 않음 this() 생성자임!
		 * - 인스턴스 자신을 가리키는 참조변수
		 * - 인스턴스 메서트(생성자 포함)에서 사용가능
		 * - 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용
		 */
		
		/* this 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
		 * 		모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다.
		 * this(), this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출할 떄 사용한다. 
		 *                     클래스이름 대신 this()
		 */
	}  // 클래스 메서드는 iv, this 사용 불가!!  인스턴스 메서드는 사용가능 
}
class MyMath2{
	long a, b;   // this.a, this.b 진짜이름 (this 생략가능)
		//iv
    MyMath2(int a, int b) { //생성자    // this 사용가능
   //  iv
		this.a = a;   // lv와 iv 구별할려고
		this.b  =b;  
	}
	long add()   {   // 인스턴스 메서드	  // this 사용가능
		return a + b; 	// return this.a + this.b;   
	}
	
	static long add(long a, long b) {  //클래스 메서드(static 메서트)  
		return a + b;                  // this 사용 불가
	}
}
// 코드 중복을 제거할려고 서로 호출!
class Car2 {  // 첫 줄
	String color;    // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door;        // 문의 개수
	
	Car2() {  // 첫 줄
		this("white", "auto",4); // Car2(String color, String geatType, int door) 호출
	} // 기본 생성자 
	Car2(String color){
		this(color, "auto", 4); // Car2(String color, String geatType, int door) 호출
	}
	
	Car2(String color, String gearType, int door){
		// this.color 는 iv , color 는 lv  this 구별하기위해 사용!
		this.color = color;   // this 없으면 둘다 lv도 간주함
		this.gearType = gearType;
		this.door = door;
		// 같은 클래스 내에서는 생략가능
		/* Car2(String c, String g, int d) {
		 *  // color 는 iv, c는 lv
		 * color = c;
		 * gearType= g;
		 * door = d;
		 * 
		 */
	}
}