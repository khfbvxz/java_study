package javaJS;

public class JSch03_1 {

	public static void main(String[] args) {
		/* ����ȯ ������ ���� �Ǵ� ����� Ÿ���� �ٸ��������� ��ȯ 
		 * (Ÿ��)�ǿ����� ex) double b = 85.4;
		 *                int score = (int)d; //int i = 3.14f; //���� �÷� ������ intqhek �� �о ���� �� �ս� 
		 * int->char (char)65  'A' �����ڵ� ����ǥ �ݴ�� (int)'A'  65
		 * �ڵ�����ȯ �����Ϸ��� �ڵ����� ����ȯ ���������� ū���� ������
		 * float f = (float)1234;
		 * int i = (int)3.14f; // ��� 3
		 */
		/* ���������� 
		 * int/int=int �Ҽ��� ���� ������
		 * �Ҽ������ϸ� ���ϸ� �����ϳ� �Ǵ� �Ѵ� �Ǽ��� ��ȯ �� ���
		 * ��� ��ȯ ����� �� Ÿ���� �ڵ����� �ٲٰ� �ϴ� ��
		 *        ���� ���� �ǿ������� Ÿ���� ��ġ��Ű�� ��
		 * �߿�!! 1. �� �ǿ������� Ÿ���� ���� ��ġ (���� ūŸ������ ��ġ ���ս� ����)
		 *       2.�ǿ��ܻ��� Ÿ���� int���� ���� Ÿ���̸� int�� ��ȯ 
		 *        byte+short -> int+int ->int
		 *        char+short -> int+int ->int
		 */
		int a = 1_000_000;
		int b = 2_000_000;
//		long c = a * b;   // a*b = 2,000,000,000,000 �����÷ο� �߻�
		long c = (long)a * b; // ���ʸ� �ص� �� 
		System.out.println(c);
		
		// �ݿø� Math.round() �Ǽ��� �Ҽ��� ù°�ڸ����� �ݿø��� ������ ��ȯ
		double pi = 3.141592;
		double shortpi =Math.round(pi*1000)/1000.0; // 1000�� ���ϰ� �ٽ� 1000.0 �Ǽ������� ������ 
		System.out.println(shortpi);                // 3.142 �Ҽ� 3°�ڸ����� ���� 
		System.out.println(pi);                // 3.142 �Ҽ� 3°�ڸ����� ���� 
		System.out.println(Math.round(pi));    // 3               // 3.142 �Ҽ� 3°�ڸ����� ���� 
		System.out.println(Math.round(pi*1000)/1000);    // 3               // 3.142 �Ҽ� 3°�ڸ����� ���� 
		//�Ҽ��� �Ʒ� ©�󳾶�
		System.out.println((int)(pi*1000)/1000.0);
		
		//������ ������ % ������ �ǿ����ڷ� ������ ���� �������� ��ȯ
		//������ �ǿ����ڴ� 0�� �ƴ� ������ ��� ��ȣ ���� 
		System.out.println(10%8);
		System.out.println(10%-8);
		
	}

}
