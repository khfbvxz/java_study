package javaJS;

class JSch06_6{
	public static void main(String args[]) {
		/* �����ε� ( overloading ) ��Ȯ�� ��Ī �޼��� �����ε�  c++���� ������ �����ε��� ����
		 * �� Ŭ���� �ȿ� ���� �̸��� �޼��� ���� �� �����ϴ� ��
		 * ����  �޼��� : �޼��� �̸� 1��1�̿����� 
		 * �����ε�  n : 1 
		 * ��ǥ�� ��) void println(boolean x), void println(int x)
		 * 
		 * �����ε��� �����ϱ� ���� ���� �߿�!
		 * - �޼��� �̸��� ���ƾ� �Ѵ�.
		 * - �Ű� ������ ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
		 * - ��ȯ Ÿ���� ������� 
		 * 
		 * int add (int a, int b) { return a+b; }  // �̷���� �����ε� �ƴ� �޼��� �ߺ�������
		 * int add (int x, int y) { return x+y; }
		 * 
		 * int add (int a, int b) { return a+b; }  // �̷� ��쵵 �����ε� �ƴ�
		 * long add (int a , int b) { return (long)(a+b);} // �ߺ����� ��ȯŸ���� ���� x
		 * 
		 * long add (int a , int b) { return a+b;}   // �����ε� ����
		 * long add (long a , long b) { return a+b;}
		 * 
		 */
		MyMath3 mm	= new MyMath3();
		//The method add(int, long) is ambiguos(Ȯ������ ����) for the type Mymath3 
		System.out.println("mm.add(3, 3) ���:"   + mm.add(3,3));
		System.out.println("mm.add(3L, 3) ���:"  + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) ���:"  + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) ���:" + mm.add(3L,3L));
		
		int[] a = {100,200,300};
		System.out.println("int add(int a , int b) - " + mm.add(a));
		
		/* ������ (constructor)
		 * �ν��Ͻ��� ������ ������ ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���' ��ü (iv ����)  iv �ʱ�ȭ
		 * 							= iv �ʱ�ȭ Time t = new Time(); //��� �굵 ������ 
		 * 									  t.hour = 12;
		 * Time t = new Time(12,34,56);   <-  t.minute = 34;      // ���ŷο�
		 *                  ������ ȣ��	    	  t.second = 56;
		 *               ������ �߰������
		 *               
		 * - �̸��� Ŭ���� �̸��� ���ƾ� �Ѵ�. 
		 * - ���ϰ��� ����. (void �Ⱥ���)
		 * - ��� Ŭ������ �ݵ�� �����ڸ� ������ �Ѵ�. 
		 * 
		 *   Ŭ�����̸�(Ÿ�� ������, Ÿ�� ������, ...){
		 *      // �ν��Ͻ� ���� �� ����� �ڵ�.
		 *      // �ַ� �ν��Ͻ� ������ �ʱ�ȭ �ڵ带 ���´�.
		 *   }
		 */
		
		/* �⺻ ������(defult constructor)
		 * - �Ű������� ���� ������ 
		 * - �����ڰ� �ϳ��� ���� ����, �����Ϸ��� �ڵ� �߰�!!
		 * Ŭ�����̸�() {} // �⺻ ������
		 * Point() {}   // PointŬ������ �⺻ ������  ������ ���� �ۼ��ؾ��� 
		 */
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error �߻� -> �⺻�����ڸ� �����ϸ� ���� ������!
	}
}

class Car {
	String color;    // ����
	String geatType; // ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;        // ���� ����
	
	Car() {} // �⺻ ������ 
	Car(String c, String g, int d){ // �Ű������� �ִ� ������ 
		color = c;
		geatType = g;
		door = d;
		/* iv �ʱ�ȭ ���� ������ �ڵ尡 ��������!
		 *  Car c = new Car();
		 *  c.color = "white";       �Ű������� �ִ� ������ ȣ�� �Ѱ� 
		 *  c.geatType = "auto";  -> Car c = new Car("white","auto",4);
		 *  c.door = 4;
		 */
	}
}

class Data_1{  // ������ 0��
	int value; // �⺻�����ڰ� �ڵ� �߰� Data_1() [] ���� �⺻�����ڸ� �߰��ؾ���
}
class Data_2 {  //�Ű������� �ִ� ������.
	int value;
	Data_2() {} // �⺻ ������!! �� �־�ߵ�!!!
	Data_2(int x){
		value = x;
	}
}
//  �����ε��� �ùٸ� �� - �Ű������� �ٸ����� ���� �ǹ��� ��� ���� 
class MyMath3{
	int add (int a, int b) {
		System.out.print("int add(int a , int b) - ");
		return a+b;
	}
	long add (int a, long b) {
		System.out.print("long add(int  a , long b) - ");
		return a+b;
	}
	long add (long a, int b) {
		System.out.print("long add(long  a , int b) - ");
		return a+b;
	}
	long add (long a, long b) {
		System.out.print("long add(long  a , long b) - ");
		return a+b;
	}
	int add(int[] a) {  // �迭�� ��� ����� ���� ����� �����ش�.
		System.out.print("int add(int[] a) -");
		int result = 0;
		for(int i = 0 ; i < a.length ; i++)
			result += a[i];
		return result;
	}
}

