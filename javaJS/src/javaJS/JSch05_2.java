package javaJS;
import java.util.Scanner;
import java.util.Arrays; // ctrl+shift+o �ڵ����� import�� �߰� �߿�!!
public class JSch05_2 {

	public static void main(String[] args) {
		/* String �迭�� ����� ����
		 * String[] name = new String[3] //3���� ���ڿ��� ���� �� �ִ� �迭 ����
		 * String ������ �⺻�� null ��κ��� �⺻�� �⺻�� 0(boolean false
		 * String[] name = new String[] {"Kim", "Park","Yi"};
		 * String[] name = {"Kim", "Park","Yi"}; // �̰� ���� ���� ���� �Ⱦ� 
		 */
//		String[] strArr = { "����", "����", "��"}; //index 0~3-1 0~2
//		System.out.println(Arrays.toString(strArr));
//		for(int i =0;i<10;i++) {
//			//System.out.println((int)(Math.random()*3)); //0~2
//			int tmp = (int)(Math.random()*3);
//			System.out.println(strArr[tmp]); // 0~2
//		}
		
		/* Ŀ�ǵ� ������ ���� �Ϸ¹ޱ� 
		 * https://www.youtube.com/watch?v=8yjC3t7j-eg&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=45
		 * �﷩�� Run Configurations... -> Arguments ����ٰ� �Է� abc 123 "Hello World"
		 * Run �Ʒ� Run Configurations... 
		 * cmd ġ�� Ŭ���� ��ġ alt+enter ġ�� �ҽ����� ��� ���� java�����̰� Ŭ���� ���� ã������ ����
		 * �״��� ��� ���� cd ġ�� ���� ��
		 * Ŭ������ ġ�� abc 123 "Hello World" 
		 * 
		 */
//		System.out.println("�Ű������� ����:"+args.length);
//		for(int i =0;i<args.length;i++) {
//			System.out.println("args["+i+"] = \""+args[i]+"\"" );
		
		/* 2���� �迭 ���̺� ������ �����͸� �����ϱ� ���� �迭
		 * int[][] score = new int[4][3]; // 4�� 3���� 2���� �迭�� ����
		 * 
		 * 2���� �迭�� �ʱ�ȭ		 
		 * int[][] arr = new int[][]{{1,2,3},{4,5,6}};
		 * int[][] arr = {{1,2,3},{4,5,6}}; //new int[][] �� ����
		 * int[][] arr = {
		 * 					{1,2,3}, // ������ ���� �̷��� ���� �� 
		 * 					{4,5,6}  // �����ϸ� �̷��� �ʱ�ȭ
		 * 				 };
		 */
		int[][] score= {
				{ 100, 100, 100 },
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 },
				{ 50, 50, 50 }
		};
//		int sum=0;
//		for(int i = 0; i < score.length; i++) {
//			for(int j =0; j < score[i].length; j++) {
//				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
//				sum += score[i][j];
//			}
//		}
//		System.out.println("sum=" +sum);
		int korTotal = 0, engtotal=0 ,mathtotal=0;
		System.out.println("��ȣ  ����  ����  ����  ����  ���");
		System.out.println("======================");
		
		for(int i = 0; i < score.length;i++) {
			int sum = 0; 		//���κ� ����
			float avg = 0.0f;   //���κ� ���
			korTotal += score[i][0];
			engtotal += score[i][1];
			mathtotal += score[i][2];
			System.out.printf("%3d",i+1);
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n",sum,avg);
			
		}
		System.out.println("===================== ");
		System.out.printf("����:%4d%4d%4d",korTotal,engtotal,mathtotal);
	}
}
