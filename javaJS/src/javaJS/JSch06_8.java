package javaJS;

class JSch06_8{
	public static void main(String args[]) {
		/* ������ �ʱ�ȭ
		 * - ��������(lv)�� ���� �ʱ�ȭ �ؾ��� ( ����� ��!!!!) ���� �ʱ�ȭ �ؾ���
		 * - �������(iv, cv)�� �ڵ� �ʱ�ȭ �ȴ�. 
		 */
		
		/* ��������� �ʱ�ȭ  iv , cv
		 * 1. ����� �ʱ�ȭ(=) ���Կ����� (�����)
		 * class Car{
		 * 		int door = 4;            // �⺻�� ������ �ʱ�ȭ
		 * 		Engine e = new Engine(); // ������ ������ �ʱ�ȭ
		 *                               // ������ ���� null(�⺻��), ��ü�ּ�
		 * 2. �ʱ�ȭ ��
		 * - (iv)�ν��Ͻ� �ʱ�ȭ �� : {} ������ �ʱ�ȭ�ּ� ��� ������������ �ֱ� 
		 * - (cv)Ŭ���� �ʱ�ȭ ��  : static {} 
		 * 
		 * 3. ������ iv �ʱ�ȭ, ������ �ʱ�ȭ
		 *    Car2(String color, String gearType, int door){ // �Ű������ִ� ������
		             this.color = color;   
		             this.gearType = gearType;
		             this.door = door;
		      } 
		      
		 * cb,iv �ʱ�ȭ
		 * 1. �ڵ��ʱ�ȭ 0 
		 * 2. �����ʱ�ȭ  = 
		 * 3. �����ʱ�ȭ  static {}(cv �ʱ�ȭ), ������ (in v �ʱ�ȭ), {}(��� ���� �Ⱦ�)
		 */
		
		/* ��������� �ʱ�ȭ
		 * Ŭ���� ���� �ʱ�ȭ ����(����): Ŭ������ ó�� �ε��� �� �� �ѹ�(�޸𸮿� �ö� ��)
		 * �ν��Ͻ� ���� �ʱ�ȭ ����: �ν��Ͻ��� ������ ������.
		 * 
		 * 
		 */
	}
}

class StaticBlockTest{
	static int[] arr = new int[10]; // ����� �ʱ�ȭ
	
	static {   // Ŭ���� �ʱ�ȭ �� - �迭 arr�� ������ ä���. // cv �����ʱ�ȭ 
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i]= (int)(Math.random()*10)+1; 
		}
	}
}

class InitTest{
	int x;             // �ν��Ͻ� ����  �ڵ��ʱ�ȭ 
	int y = x;         // �ν��Ͻ� ����
	void method() {
//		int i ;      //  ��������  �����ʱ�ȭ �ؾ���
//		int j= i ;   //  ���� , ���������� �ʱ�ȭ���� �ʰ� ���
	}
	static int cv = 1;  //����� �ʱ�ȭ
	int iv = 1;			//����� �ʱ�ȭ
	
	static { cv=2; }   // Ŭ���� �ʱ�ȭ ��
	{ iv=2; }		   // �ν��Ͻ� �ʱ�ȭ ��
	InitTest(){        // ������
		iv=3;
	}
}