package javaJS;
import java.util.Scanner;
public class JSch04_1 {

	public static void main(String[] args) {
		/* switch �� ó���ؾ� �ϴ� ����� ���� ���� �� ������ ���ǹ� 
		 * switch -> if�� �׻� ���� / if->switch��  �ٲ� �� �ִ��� ��� if���� ������ ��
		 * �������� 1. switch���� ���ǽ� ����� ���� �Ǵ� ���ڿ��̾����
		 *       2. case���� ���� ���� ���(����), ���ڿ��� �����ϸ� �ߺ�x ����x �Ǽ�x 
		 * switch(���ǽ�) { ���ǽ��� ������ ���ڿ�                //1. ���ǽ� ���
		 * 	case ��1 :            					      //2. ���ǽ��� ����� ��ġ�ϴ� case������ �̵��Ѵ�.
		 * 		//�������� ����� ��1�� �� ����� �����             //������ ������� �����Ѵ�.  
		 *		break;  //switch���� ��� ������ ����!!		  //break���̳� switch���� ���� ������ switch�� ��ü�� ����������
		 * 	case ��2 :
		 * 		//�������� ����� ��2�� �� ����� �����
		 *		break;
		 *	default :
		 *		//���ǽ��� ����� ��ġ�ϴ� case���� ���� �� break �����!
		 *}
		 */
//		System.out.print("���� ���� �Է��ϼ���.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� mouth�� ����
//		
//		switch (month) {
//			case 3: case 4: case 5:
//				System.out.println("������ ������ ���Դϴ�.");			
//				break; //break�� ����
//			case 6: case 7: case 8:
//				System.out.println("������ ������ �����Դϴ�.");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("������ ������ �����Դϴ�.");
//				break;
//			default:
//	//  	case 12: case 1: case 2:
//				System.out.println("������ ������ �ܿ��Դϴ�.");
//	    }
//				
		/*������ ���� ����� Math.random() 0.0�� 1.0 ������ ������ double ���� ��ȯ 
		 * 0.0 < =Math.random() < 1.0
		 * 1. �� ���� 3�� ���Ѵ�.
		 * 0.0 * 3 <= Math.random() < 1.0 * 3
		 * 2. �� ���� int������ ��ȯ�Ѵ�.
		 * (int)0.0 <= (int)(Math.random() * 3) < (int)1.0
		 * 0 <= (int)(Math.random() * 3) < 3
		 * 3. �� ���� 1�� ���Ѵ�.
		 * 0+1 <= (int)(Math.random() * 3)+1 < 3+1
		 * 1 <= (int)(Math.random() * 3)+1 < 4
		 */
		int num = 0;
		for (int i = 1; i<=10; i++) {
//			System.out.println(Math.random()); // ���� 0.0 <= x < 1.0 ����
//			System.out.println(Math.random()*10); // ���� 0.0 <= x < 10.0 ����
//			System.out.println((int)(Math.random()*10)); // ���� 0 <= x < 10 ����
//			System.out.println((int)(Math.random()*10)+1); // ���� 1 <= x < 11 ����
			//-5~5 
			System.out.println((int)(Math.random()*11)-5); // ���� -5 <= x < 6 ����
		}
	
	}
}
