package javaJS;



class Point extends Object{
	int x;
	int y;
}
//class Circle extends Point{ // ���
//	int r; 
//}
class Circle {    // ����
	Point p = new Point();
	int r;
}
public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle(); // ���������� �ʱ�ȭ 
		c.p.x = 1;  // c.x ���  c.p.x�� ����
	    c.p.y = 2;
	    c.r = 3; 
	    System.out.println("c.p.x=" + c.p.x);
	    System.out.println("c.p.y=" + c.p.y);
	    System.out.println("c.r=" + c.r);
	    System.out.println(c.toString());   //Circle@762efe5d ��ü�� �ּҰ�~
	    System.out.println(c);              // println��� ���������� ����ϸ� toString()�� ����
	    Circle c2 = new Circle(); // ���������� �ʱ�ȭ 
	    System.out.println(c2.toString());   //Circle@5d22bbb7 ��ü�� �ּҰ�~
	    
	}

}
