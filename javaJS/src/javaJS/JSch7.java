package javaJS;
import java.util.Scanner;

public class JSch7 { 
	public static void main(String[] args) {
		/* ���
		 * -������ ů������ ���ο� Ŭ������ �ۼ��ϴ� ��(�ڵ��� ����)
		 * - �� Ŭ������ �θ�� �ڽ����� ���踦 �ξ��ִ� ��.
		 * - �ڼ��� ����(�θ��� �θ�)�� ��� ����� ��� �޴´�.(������, �ʱ�ȭ �� ����)
		 * - �ڼ��� ��� ������ ���󺸴� ���� �� ����. (���ų� ����.)
		 * - �ڼ��� ������ ���� ���⤷ �� ��ġ�� �ʴ´�. 
		 * class �ڽ�Ŭ���� extends �θ� Ŭ���� { // Ȯ�尳�� �̿��� extend
		 * }
		 * 
		 * class Parent{}
		 * class Child(�ڽ�) extends Parent(�θ�){} 
		 */
		SmartTv stv = new SmartTv();
		stv.channel = 10;     // ����Ŭ�����κ��� ��ӹ��� ���
		stv.channelUp();      // ����Ŭ�����κ��� ��ӹ��� ���
		System.out.println(stv.channel);
		stv.displayCaption("Hello world");
		stv.caption = true; // ĸ��(�ڸ�)����� �Ҵ�.
		stv.displayCaption("Hello world~");
		// ������ ������ �ڼ��� ������ ��ĥ �� �ְ� �ڼ��� ������ ���� ������ ��ġ�� ����
		
		/* ���԰��� 
		 * ����(composite)
		 * - Ŭ������ ����� ���������� �����ϴ� ��
		 * - ���� ������ Ŭ������ �����, �� ���� �����ؼ� Ŭ������ �����.
		 * class Circle{
		 * 		Point c = new Point(); //���� class Point{int x; int y;}
		 * 		int r; // ������
		 */
		
		/* Ŭ���� ���� ���� �����ϱ�
		 * ��Ӱ��� '~�� ~�̴�. (is-a)'         ����� ������ ���� �� �ʿ��� ����.
		 * ���԰��� '~�� ~�� ������ �ִ�.(has-a)'  90% ����
		 * 
		 */
	}
}
class Tv{  //�θ� ��� 5��
	boolean power; // �������� (on/off)
	int channel;
	void power()       { power = !power; }
	void channelUp()   { ++channel;  }
	void channelDown() { --channel;  }
}
// �ڽĸ�� 2�� +�θ���5�� =7�� 
class SmartTv extends Tv {   // SmartTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� ����� 
	boolean caption;         // ĸ�ǻ��� (on/off)
	void displayCaption(String text) {
		if(caption) {        // ĸ�� ���°� on(true)�� ���� text�� �����ش�.
			System.out.println(text);
		}
	}
}

