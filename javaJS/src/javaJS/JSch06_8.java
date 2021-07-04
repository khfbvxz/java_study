package javaJS;

class JSch06_8{
	public static void main(String args[]) {
		/* 변수의 초기화
		 * - 지역변수(lv)는 수동 초기화 해야함 ( 사용전 꼭!!!!) 직접 초기화 해야함
		 * - 멤버변수(iv, cv)는 자동 초기화 된다. 
		 */
		
		/* 멤버변수의 초기화  iv , cv
		 * 1. 명시적 초기화(=) 대입연산자 (선언시)
		 * class Car{
		 * 		int door = 4;            // 기본형 변수의 초기화
		 * 		Engine e = new Engine(); // 참조형 변수의 초기화
		 *                               // 참조형 변수 null(기본값), 객체주소
		 * 2. 초기화 블럭
		 * - (iv)인스턴스 초기화 블럭 : {} 복잡한 초기화애서 사용 여러문장으로 넣기 
		 * - (cv)클래스 초기화 블럭  : static {} 
		 * 
		 * 3. 생성자 iv 초기화, 복잡한 초기화
		 *    Car2(String color, String gearType, int door){ // 매개변수있는 생성자
		             this.color = color;   
		             this.gearType = gearType;
		             this.door = door;
		      } 
		      
		 * cb,iv 초기화
		 * 1. 자동초기화 0 
		 * 2. 간단초기화  = 
		 * 3. 복잡초기화  static {}(cv 초기화), 생성자 (in v 초기화), {}(얘는 거의 안씀)
		 */
		
		/* 멤버변수의 초기화
		 * 클래스 변수 초기화 시점(언제): 클래스가 처음 로딩될 때 단 한번(메모리에 올라갈 때)
		 * 인스턴스 변수 초기화 시점: 인스턴스가 생성될 때마다.
		 * 
		 * 
		 */
	}
}

class StaticBlockTest{
	static int[] arr = new int[10]; // 명시적 초기화
	
	static {   // 클래스 초기화 블럭 - 배열 arr을 난수로 채운다. // cv 복잡초기화 
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i]= (int)(Math.random()*10)+1; 
		}
	}
}

class InitTest{
	int x;             // 인스턴스 변수  자동초기화 
	int y = x;         // 인스턴스 변수
	void method() {
//		int i ;      //  지역변수  수동초기화 해야함
//		int j= i ;   //  에러 , 지역변수를 초기화하지 않고 사용
	}
	static int cv = 1;  //명시적 초기화
	int iv = 1;			//명시적 초기화
	
	static { cv=2; }   // 클래스 초기화 블럭
	{ iv=2; }		   // 인스턴스 초기화 블럭
	InitTest(){        // 생성자
		iv=3;
	}
}