package javaJS;

public class JSch02_2 {

	public static void main(String[] args) {
	//�⺻�� 8�� boolean, char, byte, short, int, long, float, double ���� ���� ����
	//������ �⺻���� ������ ������ String, System �� �޸� �ּҸ� ���� 4byte(40��) �Ǵ� 8byte(160��)
		/*println() ���� �Ǽ��� �ڸ��� ���� �Ұ� ��� ���� 10�����θ� ���
		 */
		System.out.println(10/3);// ��� 3 ����/����
		System.out.println(10.0/3);// ��� 3.333333 �Ǽ�/����
		/* printf() ������� ���� ���� �ٹٲ� x
		 * System.out.printf("%.2f",10.0.3); // 3.33 ("%.2f") ������ 
		 * System.out.printf("%d",0x1A); // 26
		 * System.out.printf("%X",0x1A); // 1A 
		 * ������ JavaAPI -> Formatter ������ Ȯ�� �Ұ�
		 * ���� ��� %b �Ҹ���, %d 10����, %o 8����, %x,%X 16����
		 * �Ǽ� ��� %f �Ǽ� 10���� �ε��Ҽ���, %e,%E ����  %g %f %e�� �����Ѱ� ���
		 * ���� ���ڿ� %c ����, %s ���ڿ� 
		 * ���๮�� \n,%n  �ٹٲ�
		 */
		System.out.printf("%d%n", 15);                         //15 10���� 
		System.out.printf("%o%n", 15);                         //17 8����
		System.out.printf("%x%n", 15);                         //f 16����
		System.out.printf("%s%n", Integer.toBinaryString(15)); //1111 2���� ����->2���� In Integer.toBinaryString()
		System.out.printf("%#o%n", 15);   //���λ� ���̷��� ������ �� #//17 8����
		System.out.printf("%#x%n", 15);   //������ �빮�ڸ� F�� ���  //f 16����
		float f = 123.4567890f;           //float ���ٴ� �� ������ double(15�ڸ�)���°� �� ���� 
		double f1 = 123.456789;
		System.out.printf("%f%n", f);   //���е� �տ������� 7�ڸ� 
		System.out.printf("%f%n", f1);   
		System.out.printf("%e%n", f);   //���� ����  8 �ݿø��Ǽ� ����
		System.out.printf("%g%n", 123.456789);   //7�ڸ� �ݿø�
		System.out.printf("%g%n", 0.00000001);   //���� ����  ���� 0�� ���� ����
		
		System.out.printf("[%5d]%n", 10);   // [   10]  5 �ڸ� �⺻ ����������
		System.out.printf("[%-5d]%n", 10);  // [10   ]  - ��������
		System.out.printf("[%05d]%n", 10);   // [00010] ������ �� 0 -> ���ڸ� ������ 0
		System.out.printf("f1=%14.10f%n", f1);// 14 ��ü�ڸ� .10 �Ҽ��� �Ʒ��ڸ�
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n", url);     // %d �� ����
		System.out.printf("[%20s]%n", url);   //���������� ������ ����
		System.out.printf("[%-20s]%n", url);  //�������� ������ ����
		System.out.printf("[%.8s]%n", url);   // .8 8�ڸ� ������ .�� �ϳ��� ħ
		
	}

}
