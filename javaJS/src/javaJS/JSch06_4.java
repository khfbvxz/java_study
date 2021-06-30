package javaJS;

class JSch06_4{
	public static void main(String args[]) {
		/* ȣ�� ���� (call stack) // ���� �� �ؾߵ�!
		 * stack : ���� ���� ����, ���� �������� ���δ�.
		 * ������ ������� 1 2 3
		 * ���� �� ���� ������ 3 2 1
		 * �߰��� ���� �ֱ� �Ǵ� �� �Ʒ� �����°� �� �� ����!
		 * 
		 * ȣ�� ���� 
		 * �޼��� ���࿡ �ʿ��� �޸𸮰� �����Ǵ� ����
		 * �޼��尡 ȣ��Ǹ� ȣ�⽺�ÿ� �޸� �Ҵ�, ����Ǹ� ����(����)
		 * main  - (main()�� println()�� ȣ��) > main(���), println (����)
		 * println()�� ����Ǹ� main�� ������·� // �Ʒ��� �ִ� �޼��尡 ���� �޼��带 ȣǮ�� ��
		 * 								   // �� ���� �޼��常 ���� ��, �������� �����
		 * 
		 */

		/* �⺻�� �Ű�����  ���� ���� �� ��
		 * �⺻�� �Ű����� - ������ ���� �б⸸ �� �� �ִ�. (read only) ���� �Ұ�
		 * �÷��� ������(javajungsuk_basic-master.zip�� flash����)
		 * �⺻�� �Ű����� ���� PrimitiveParame.exe
		 * ������ �Ű����� ���� ReferenceParam.exe
		 * 
		 */
		
		Data d = new Data();  //��ü ����
		d.x =10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x );
		System.out.printf("%n");
		
		/* ������ �Ű�����
		 * ������ �Ű����� - ������ ���� �а� ������ �� �ִ�. (read & write)
		 */

		Data2 d2 = new Data2();//��ü ����
		d2.x = 10;
		System.out.println("main() : x = " + d2.x);

		change2(d2);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d2.x);
		System.out.printf("%n");
		
		/* ������ ��ȯŸ�� 
		 * 
		 */
		Data3 d3 = new Data3();//��ü ����  
		d3.x = 10;
		
		Data3 d4 = copy(d3);  // ���� Ŭ�����ȿ� �־ ȣ���� �� �տ� �������� (��������)���� static �޼�Ʈ������ ����
		                      // static �޼���� ��ü �������� ȣ�� ���� 
		//��ȯŸ�԰� ������ Ÿ���� ��ġ�ؾ��� �� ������! 
		System.out.println("d3.x = "+d3.x);
		System.out.println("d4.x = "+d4.x);
	}
	
	static void change(int x) {  // �⺻�� �Ű� ���� �б⸸ ���� 
		x=1000;  //��������         // if change���� x���� �ٲٰ� ������ ���������� �ٲ����   
		System.out.println("change() : x = " + x);
	}
	
	static void change2(Data2 d2) { // ������ �Ű����� // ������ ���� ����� �ּҰ�
		d2.x = 2000;
		System.out.println("change() : x = " + d2.x);
	}
	static Data3 copy(Data3 d3) { 
		// ��ȯŸ�� ������ ��ü�� �ּҸ� ��ȯ or ��ü�� ��ȯ
		Data3 tmp = new Data3(); // ���ο� ��ü tmp�� �����Ѵ�.
		tmp.x = d3.x; 			 // d.x�� ���� tmp.x�� �����Ѵ�.
		return tmp;				 // ������ ��ü�� �ּҸ� ��ȯ�Ѵ�.
	}
}
class Data { int x; }
class Data2 { int x; }
class Data3 { int x; }
