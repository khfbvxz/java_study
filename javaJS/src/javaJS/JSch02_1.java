package javaJS;

public class JSch02_1 {

	public static void main(String[] args) {
		//�� ������ �� ��ȯ
		int x = 4, y =2 ;
		int temp;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		temp = x;  //1. x�� ���� temp�� ����
		x = y;     //2. y�� ���� x ����  
		y = temp ; //3. temp�� ���� y�� ����
		System.out.println("x="+x);// '+'�� ���� �տ� ���ڸ� ���϶��� ���
		System.out.println("y="+y);
		
		
		
	}

}
