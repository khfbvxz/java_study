package javaJS;
import java.util.Scanner;

class JSch61{
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel����"+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel����"+ t2.channel + "�Դϴ�.");
		
		t1.channel=7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		t2=t1; // �������� t1�� ���� t2�� ����
		System.out.println("t1�� channel����"+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel����"+ t2.channel + "�Դϴ�.");
		
		/* ��ü �迭 == �������� �迭
		 * Tv tv1. tv2, tv3;   ->  
		 *  Tv[] tvArr = new Tv[3]; //���̰� 3�� TvŸ���� �������� �迭
		 * // ��ü�� �����ؼ� �迭�� �� ����� ����
		 * tvArr[0] = new Tv();	
		 * tvArr[1] = new Tv();	  // �ȿ��� ��ü���� �����ߵ�!! ����� ����
		 * tvArr[2] = new Tv();	
		 * 
 		 * Tv[] tvArr = {new Tv(), new Tv(), new Tv() }; // ���� 3������ ������ 
		 */
	}
}