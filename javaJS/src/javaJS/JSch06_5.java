package javaJS;



class JSch06_5{
	public static void main(String args[]) {
		/* ���ؼ� �� �˾� �� ��!
		 * static �޼��� = Ŭ���� �޼���  iv �����ϸ� ex) Math.random(),Math.round()
		 * - ��ü���� ����!! 'Ŭ�����̸�.�޼����̸�()'���� ȣ��  
		 * - �ν��Ͻ� ���(iv, im)�� ���õ� �۾��� �ϴ� �޼���  im �ν��Ͻ� �޼���
		 * - �޼��� ������ �ν��Ͻ� ���� (iv) ��밡��
		 *  // ������ �޼��带 ������µ� static�� ������ ���� ������ �� �˾ƾ��� 
		 *     ��� �����ϴ³�-> iv�� ������� ���� �� why? iv��뿩��!! 
		 *     static �� ���� �ٿ��� �ұ�?
		 *     �Ӽ�(��� ����) �߿��� ���� �Ӽ��� static�� ���δ�. 
		 *     �ν��Ͻ� ���(iv,im)�� ������� �ʴ� �޼���(��ɹ� ����)�� static�� ���δ�. 
		 *  ��ü=iv����!! ���� ������~~~~~~~~~
		 * �ν��Ͻ� �޼��� static �Ⱥ�����  iv ����ϸ�
		 * - �ν��Ͻ� ������ '��������.�޼����̸�()' ���� ȣ��
		 * - �ν��Ͻ� ���(iv,im)�� ���õ� �۾��� �ϴ� �޼���
		 * - �޼��� ������ �ν��Ͻ� ���� (iv) ��밡��
		 *  ���� �Ӽ�
		 * 
		 */
		System.out.println(MyMath2.add(200L,100L));  // Ŭ���� �޼��� ȣ�� ��ü���� ���� ȣ��~
		MyMath2 mm = new MyMath2();                 // �ν��Ͻ� ����
		mm.a=300L;  //iv
		mm.b=400L;
		System.out.println(mm.add());               // �ν��Ͻ� �޼��� ȣ�� // ���� �� ȣ��~
		
		/* �޼��� ���� ȣ��� ���� 
		 * static �޼��� �ν��Ͻ� ���� (iv)�� ����� �� ����!
		 * sm�� sm ȣ�� ����? yes!
		 * sm�� iv ��� ����? no!  // iv ��ü ���� �� ��� ����!!!!!!!!!
		 * sm�� im ȣ�� ����? no!  // im�� iv�� ����ϴ� �޼����̱� ����
		 * ��? sm�� iv,im�� �� �� ������? // sm ȣ��� ��ü iv���� �� ���� ���� �־ 
		 */
		
	}
}
class MyMath2{
	long a, b;   // iv �ν��Ͻ� ���� 
		
	long add() {    				   // �ν��Ͻ� �޼��� iv���
		return a + b; 			       // iv 
	}
	
	static long add(long a, long b) {  //Ŭ���� �޼��� //lv �������� 
		return a + b;                  // lv �� ����� ��
	}
}
class TestClass{
	void instanceMethod() {}
	static void staticMethod() {}
	void instanceMethod2() {
		instanceMethod();
		staticMethod();   // sm ȣ�� �׻� ����
	}
	static void staticMethod2() {
//		instanceMethod(); // ����  // imȣ�� x ��ü�� �ʿ�!!
		staticMethod();
	}
}
class TestClass2{
	int iv;			// ��ü ���� �� ��밡��
	static int cv;  // ��ü���� ���ص� �޸𸮿� �ö� ������ ��밡��
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv); //������ ��밡�� 
	}
	static void staticMethod() {  //��ü ���� ���� ȣ�� ����
//		System.out.println(iv); // ���� ��ü�� �������� �ְ� �������� �־ �ȵ�!
		System.out.println(cv);
	}
}