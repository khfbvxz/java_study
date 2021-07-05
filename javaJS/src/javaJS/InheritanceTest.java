package javaJS;



class Point extends Object{
	int x;
	int y;
}
//class Circle extends Point{ // 상속
//	int r; 
//}
class Circle {    // 포함
	Point p = new Point();
	int r;
}
public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle(); // 참조변수의 초기화 
		c.p.x = 1;  // c.x 상속  c.p.x는 포함
	    c.p.y = 2;
	    c.r = 3; 
	    System.out.println("c.p.x=" + c.p.x);
	    System.out.println("c.p.y=" + c.p.y);
	    System.out.println("c.r=" + c.r);
	    System.out.println(c.toString());   //Circle@762efe5d 객체의 주소값~
	    System.out.println(c);              // println기능 참조변수를 출력하면 toString()랑 같음
	    Circle c2 = new Circle(); // 참조변수의 초기화 
	    System.out.println(c2.toString());   //Circle@5d22bbb7 객체의 주소값~
	    
	}

}
