package javaJS;

class JSch06_7{
	public static void main(String args[]) {
		/* ������ this() 
		 * - ����Ŭ�������� �ִ� �����ڿ���  �ٸ� Ŭ�����ִ� ������ ȣ���� �� ���
		 * - �ٸ� ������ ȣ��� ù �ٿ����� ��밡��!!
		 */
		
		/* �������� this  ���� ���� this() ��������!
		 * - �ν��Ͻ� �ڽ��� ����Ű�� ��������
		 * - �ν��Ͻ� �޼�Ʈ(������ ����)���� ��밡��
		 * - ��������(lv)�� �ν��Ͻ� ����(iv)�� ������ �� ���
		 */
		
		/* this �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����Ǿ� �ִ�.
		 * 		��� �ν��Ͻ��޼��忡 ���������� ������ ä�� �����Ѵ�.
		 * this(), this(�Ű�����) ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�. 
		 *                     Ŭ�����̸� ��� this()
		 */
	}  // Ŭ���� �޼���� iv, this ��� �Ұ�!!  �ν��Ͻ� �޼���� ��밡�� 
}
class MyMath2{
	long a, b;   // this.a, this.b ��¥�̸� (this ��������)
		//iv
    MyMath2(int a, int b) { //������    // this ��밡��
   //  iv
		this.a = a;   // lv�� iv �����ҷ���
		this.b  =b;  
	}
	long add()   {   // �ν��Ͻ� �޼���	  // this ��밡��
		return a + b; 	// return this.a + this.b;   
	}
	
	static long add(long a, long b) {  //Ŭ���� �޼���(static �޼�Ʈ)  
		return a + b;                  // this ��� �Ұ�
	}
}
// �ڵ� �ߺ��� �����ҷ��� ���� ȣ��!
class Car2 {  // ù ��
	String color;    // ����
	String gearType; // ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;        // ���� ����
	
	Car2() {  // ù ��
		this("white", "auto",4); // Car2(String color, String geatType, int door) ȣ��
	} // �⺻ ������ 
	Car2(String color){
		this(color, "auto", 4); // Car2(String color, String geatType, int door) ȣ��
	}
	
	Car2(String color, String gearType, int door){
		// this.color �� iv , color �� lv  this �����ϱ����� ���!
		this.color = color;   // this ������ �Ѵ� lv�� ������
		this.gearType = gearType;
		this.door = door;
		// ���� Ŭ���� �������� ��������
		/* Car2(String c, String g, int d) {
		 *  // color �� iv, c�� lv
		 * color = c;
		 * gearType= g;
		 * door = d;
		 * 
		 */
	}
}