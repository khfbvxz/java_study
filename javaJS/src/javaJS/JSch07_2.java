package javaJS;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class JSch07_2 { 
	public static void main(String[] args) {
		/* �������� super = this�� ���� ���� //this lv�� iv ������ ���
		 * - ��ü �ڽ��� ����Ű�� ��������. �ν��Ͻ� �޼���(������)������ ���� // static�޼��� ������ ���Ұ�
		 * - ������ ����� �ڽ��� ����� ������ �� ���
		 * ����Ǵ� x�� �ΰ� super.x this.x �� �� ���� ����super�� this
		 */
		Child c = new Child();
		c.method();
		Child2 c2 = new Child2();
		c2.method();
		
		/* super() - ������ ������( this() )  �������� super�� ���� ���� 
		 * - ������ �����ڸ� ȣ���� �� ���  //��� - ������, �ʱ�ȭ�� ��Ӿȵ�
		 * - ������ ����� ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ
		 * - ������ ������ ������� �ʱ�ȭ �ҷ��� ������ �����ڸ� ȣ���Ͽ� ������ �ʱ�ȭ �ϰԲ� �ڵ� 
		 * class Point {                  class Point3D extends Point{
		 *    int x,y;						 int z;
		 *                                // �ڼ��� ������ 
		 *    Point(int x, int y) {		  Point3D(int x, int y, int z) { 	
		 *       this.x = x;                 this.x = x;  // ������ ����� �ʱ�ȭ  // ������ �ƴ����� �̷��� �ϸ� �ȵ�!!
		 *       this.y = y;	iv�ʱ�ȭ->   	 this.y = y;  // ������ ����� �ʱ�ȭ   // �ڼ��� ������Ѱ͸� �ʱ�ȭ�ؾ���
		 *    }                              this.z = z;
		 * }     							}
		 * 							      }  
		 *          Point3D(int x, int y, int z) {
		 *              super(x,y);  // ����Ŭ������ ������ Point(int x, int y)�� ȣǮ
		 *              this.z=z;    // �ڽ��� ����� �ʱ�ȭ 
		 *              
		 * - �������� ù �ٿ� �ݵ�� �����ڸ� ȣ���ؾ� �Ѵ�.  //�߿�!!!!!!// �߰�����  // super(), this() ȣ��
		 *   �׷��� ������ �����Ϸ��� �������� ù �ٿ� super();�� ����
		 *   class Point{ int x; int y; }
		 *   Point() { this(0.0); }
		 *   Point(int x, int y) {
		 *  //  super(); //Object(); //������ �⺻ ������ ȣ���ϴ� �ڵ带 �ִ´�. 
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
		System.out.println("x=" + x); //����� �� this.x 
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
//
class Parent2 {int x = 10; /* super.x�� this.x �� �� ���� */}

class Child2 extends Parent2 {
	void method() {
		System.out.println("x=" + x); //���� x 
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
