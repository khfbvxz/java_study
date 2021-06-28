package javaJS;
import java.awt.CardLayout;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class JSch06_2{
	public static void main(String args[]) {
		/* �޼����? �޼����� ����ο� ������
		 * �ż����  //black box��� ��
		 * 1. ������� ������� ��. // c��� �Լ��� ���� �ۿ�
		 * -�۾������� ������� ��� �̸��� ���� �� 
		 * 2.��(�Է�)�� �޾Ƽ� ó���ϰ�, ����� ��ȯ (���) 
		 * ���� -�ڵ��� �ߺ��� ���� �� �ִ�. 
		 * 	   -�ڵ��� ������ ����.
		 * 	   -�ڵ带 ������ �� �ִ�.
		 * 	   -�ڵ尡 �����ؼ� �����ϱ� ��������.
		 * �޼����� �ۼ� 
		 * - �ݺ������� ����Ǵ� ���������� �޼���� �ۼ�
		 * - �ϳ��� �޼���� �� ���� ��ɸ� �����ϵ��� �ۼ�
		 * �޼��� = ����� + ������
		 *  // ��ȯ Ÿ�� ���� �� void 
		 * ��ȯŸ�� �޼����̸� (Ÿ�� ������, Ÿ�� ������,...)
		 * {
		 * 		//�޼��� ȣ��� ����� �ڵ� 
		 * }
		 * int add(int a, int b) // �Ű����� parameter
		 * {
		 * 		int result = a+b;
		 * 		return result; // ȣ���� �޼���� ����� ��ȯ�Ѵ�. ��� 0~1�� 
		 *                     // �۾������ �������� �迭�̿�or��ü�� ���
		 * }	
		 * �޼����� ������ 
		 * ��������(lv) : �޼��� ���� ����� ���� a, b, result  �Ű������� ��������
		 * �ٸ� �޼����� �̸��� ���ĵ� ������� ������ ��ġ�� �ʾƾ���!
		 */
		
		/* �޼����� ȣ�� 
		 * �ż��� �̸�(��1, ��2, ...); // �޼��带 ȣ���ϴ� ��� / �۾��� �ʿ��� ����
		 * print99All();           // void print99All()ȣ��
		 * int result = add(3, 5); // int add(int x, int y)�� ȣ���ϰ� ����� result�� ����
		 * �۾������ ������ ���� 
		 */
		
		/* �޼����� ���� �帧
		 *  MyMath mm = new MyMath();  //���� �ν��Ͻ��� �����Ѵ�. 1.
		 *  long value = mm.add(1L, 2L);  // �޼��带 ȣ��  2. 
		 *  long add (long a, long b) {
		 *  	long result = a + b;
		 *  	return result ;      // result -> value 
		 *  }
		 *  1. main �޼��忡�� add�� ȣ���Ѵ�. �μ� 1L�� 2L�� �޼��� add�� �Ű����� a,b�� ���� ����(����)�ȴ�.
		 *  2. �޼����� add ��ȣ()�ȿ� �ִ� ������� ������� ����ȴ�.
		 *  3. �޼����� add�� ��� ������ ����ǰų� return���� ������, ȣ���� �޼���(main�޼���)��
		 *     �ǵ��ƿͼ� ������ ������� �����Ѵ�.
		 */
		
		MyMath mm = new MyMath();  // ��ü ����!!
		long result = mm.max(5l, 3l);  
		long result5 = mm.min(5l, 3l);  
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("max(5L, 3L) = " + result);
		System.out.println("min(5L, 3L) = " + result5);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath{
	long add(long a, long b) {  //�޼���� Ŭ���� �������� ���� ����
		long result = a + b;
		return result;
		//return a + b; // ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
	// �� ���� �޾Ƽ� �� �߿� ū ���� ��ȯ�ϴ� �޼��带 �ۼ��ϱ��
	long max(long a, long b) {
		long result = 0; 
		if(a>b) {
			result = a;
		} else {
			result = b;
		}
		return result;
		//result a > b ? a: b;
	}
	long min(long a, long b) {
//		long result = 0;
		return a < b ? a : b;
		
	}
	long subtract(long a, long b) { return a - b;}
	long multiply(long a, long b) { return a * b;}
	double divide(double a, double b) { return a / b;}
}
