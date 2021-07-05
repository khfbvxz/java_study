package javaJS;



class Point{
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
	}

}
