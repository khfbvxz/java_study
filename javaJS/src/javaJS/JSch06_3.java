package javaJS;
class JSch06_3{
	public static void main(String args[]) {
		/* return �� 
		 * ���� ���� �޼��带 �����ϰ� ȣ���� ������ �ǵ��ư���.
		 * ��ȯŸ���� void�� �� return�� ��������
		 * ��ȯŸ���� void�� �ƴ� ��� �ݵ�� return�� �ʿ�!!
		 * ex
		 * int max(int a, int b){
		 * 		if(a>b)
		 * 			return a; // ���ǽ��� ���� ���� ����ȴ�
		 *         // �̰� ������ why? ���� �����̿��� ������ �� ���� 
		 * 		else
		 * 			return b; // ���� ���� ������ �� ���� return�� �ۼ�!!!
		 * }
		 */
		
		/* ��ȯ�� return �� �� �۾������ ��ȯ�� �� Ÿ���� ��ġ or �ڵ�����ȯ(char,byte,short -> int)�� �����ؾ���!
		 *      ����� ������ ������ Ÿ�Ե� ���ƾ���!
		 */
		MyMath1 mm = new MyMath1();  // ��ü ����!!
		long result = mm.max(5l, 3l);  
		long result5 = mm.min(5l, 3l);  
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(9);
		System.out.println("max(5L, 3L) = " + result);
		System.out.println("min(5L, 3L) = " + result5);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		
	}
}

class MyMath1{
	void printGugudan(int dan) {
		if(!(2<= dan && dan <= 9 ))
			return; // dan�� ���� 2~9���� �ƴѰ��, ȣ���� ������ �׳� �ǵ��ư���.
		for(int i =1 ; i <=9 ; i++) {
			System.out.printf("%d * %d = %d%n", dan , i ,dan * i);
		}
		return; // ��ȯ Ÿ���� void �̹Ƿ� ��������. �����Ϸ� �ڵ��߰�
		//�޼��尡 �۾��� ������ �� �Ź� ����� �ٵ� ����
		//���� ������ �� ��ȯŸ���� void�� �� 

	}
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
