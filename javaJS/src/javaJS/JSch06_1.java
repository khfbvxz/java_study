package javaJS;
import java.awt.CardLayout;
import java.util.Scanner;

class JSch06_1{
	public static void main(String args[]) {
		 /* Ŭ���� 1. ���赵 2. ������+�Լ� 3. ����� ����Ÿ��
		  * Ŭ���� == ������ + �Լ� 
		  * 1.���� �ϳ��� �����͸� ������ �� �ִ� ����
		  * 2.�迭 ���� ������ ���� �����͸� �ϳ��� ������ �� �ִ� ���� 
		  * 3.����ü ���� ���õ� ���� ������(���� ����x)�� �ϳ��� ������ �� �ִ� ����  ���� ���谡�ִ� ���� �ϳ��� ���� �� ����
		  * 4.Ŭ���� �����Ϳ� �Լ��� ����(����ü + �Լ�)
		  * 
		  * ����� ���� Ÿ�� - ���ϴ� Ÿ���� ���� ���� �� �ִ�. 
		  */
		
		/* ������ġ(3����)�� ���� ���� ���� 
		 * class Variables        //Ŭ���� ����          ���� 1. Ŭ���� ���� - iv , cv (static+iv)
		 * {                       (���𹮸� ����, ����x       2. �޼��� ���� - lv 
		 * 		int iv;    // �ν��Ͻ� ����                         ��ü���� �ʿ� o  ��ü������ �������
		 * 		static int cv // Ŭ���� ���� (static ����, ���� ����)  ��ü���� �ʿ� x  Ŭ������ �޸𸮿� �ö󰥋� ������ 
		 * 		void method()
		 * 		{
		 * 			int lv = 0;   // �������� �޼��� ����              �޼��� ����� �ڵ����� 
		 * 		}
		 * }
		 */
		
		/* Ŭ���� ������ �ν��Ͻ� ���� ������
		 * ex) ī�� ��Ʈ7 �����̵� 4
		 * �Ӽ� ���� ����    ���� ��ü���� �ٸ��� �����Ǿ�� �Ǿ�� �ϴ� �� 
		 *     �� ����     ���� 
		 * �������ΰ� iv �������ΰ� cv (static)
		 * class Card{
		 * 		String kind;    //����
		 * 		int number;		//����
		 * 		static int width = 100;  //��
		 * 		static int height = 250; //����
		 * }
		 * 
		 * Card c = new Card(); //��ü ����
		 * c.kind = "HEART";
		 * c.number = 5;         //��ü��
		 * c.width = 200;   // cv Card.width = 200;   �̷��� ����� 
		 * c.height = 300; 	      Card.height = 300;  cv�� �տ� Ŭ���� �̸�
		 * 
		 * cv�� 1�� iv�� ��ü���� 1����   //github javajungsuk_basic-master���� flash����
		 * 	�÷��� ������ �߿��ϴϱ� ��		// MemberVar.exe 
		 */
		System.out.println("Card.with=" + Card.width);
		System.out.println("Card.height=" + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1��" + c1.kind + "," + c1.number + "�̸� ũ���(" + c1.width + ", " + c1.height +")");
		System.out.println("c2��" + c2.kind + "," + c2.number + "�̸� ũ���(" + c2.width + ", " + c1.height +")");
		System.out.println("c1���� width�� height�� ���� 50, 80���� �����մϴ�.");
		
		Card.width = 50;  //  c1.width = 50; 
		Card.height = 80; // ���� ���� ������� cv!
		
		System.out.println("c1��" + c1.kind + "," + c1.number + "�̸� ũ���(" + c1.width + ", " + c1.height +")");
		System.out.println("c2��" + c2.kind + "," + c2.number + "�̸� ũ���(" + c2.width + ", " + c1.height +")");
	}
}

class Card{
	String kind;    //����
	int number;		//����
	static int width = 100;  //��
	static int height = 250; //����
}