package javaJS;

class Point3 {
	int x;
	int y;
	String getLocation() {
		return "x :"+ x + ", y :" + y;
	}
}
class Point3D2 extends Point3{
	int z;
	// ������ getLocation()�� �������̵�
	String getLocation() {  // �������̵� ����� ���� �Ұ� 
		return "x :"+ x + ", y :" + y + ", z :" + z; // ���븸 ���� ����! ������{}
	}
}
class MyPoint3 extends Object{
	int x;
	int y;
	public MyPoint3(int x, int y) {
		this.x = x; 
		this.y = y; 
	}
	//ObjectŬ������ toString()�� �������̵�
	public String toString() {
		return "x :"+ x + ", y :" + y;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
//		Point3D2 p = new Point3D2();
//		p.x = 3; 
//		p.y = 5;
//		p.z = 7;
//		System.out.println(p.getLocation());

		MyPoint3 p = new MyPoint3(1,2);
//		p.x = 3;
//		p.y = 5;
		System.out.println(p);
		
//		System.out.println(p.toString());
//		System.out.println("p.x="+p.x);
//		System.out.println("p.y="+p.y);
		
	}

}
