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
		
		/* String Ŭ���� �� char[] �� �ż���(���)�� �����Ѱ�
		 * String Ŭ���� = char[] + �ż���(���)  // ���ڹ� 
		 * String Ŭ������ ������ ������ �� ����. (read only)  
		 * �ֿ� �ż���
		 * char charAt(int index)               ���ڿ����� �ش�����(index)�� �ִ� ���ڸ� ��ȯ�Ѵ�.
		 * int length()							���ڿ��� ���̸� ��ȯ�Ѵ�.
		 * String substring(int from, int to)	���ڿ����� �ش� ���� (from~to)�� ���ڿ��� ��ȯ�Ѵ� (to�� ���� �� ��)
		 * boolean equals(Object obj)			���ڿ��� ������ ������ Ȯ���Ѵ�. ������ true �ٸ��� false
		 * char[] toCharArray() 				���ڿ��� ���ڹ迭 (char[])�� ��ȯ�ؼ� ��ȯ�Ѵ�. 
		 */
		
//		String str = "ABCDE";
//		char ch = str.charAt(2);
//		String str2 = str.substring(1,4);
//		String str3 = str.substring(1, str.length());
//		String str4 = str.substring(1);
//		
//		System.out.println(ch);
//		System.out.println(str2); //BCD
//		System.out.println(str3); //
//		System.out.println(str4); //1���� ������ 
		 
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
//		int korTotal = 0, engtotal=0 ,mathtotal=0;
//		System.out.println("��ȣ  ����  ����  ����  ����  ���");
//		System.out.println("======================");
//		
//		for(int i = 0; i < score.length;i++) {
//			int sum = 0; 		//���κ� ����
//			float avg = 0.0f;   //���κ� ���
//			korTotal += score[i][0];
//			engtotal += score[i][1];
//			mathtotal += score[i][2];
//			System.out.printf("%3d",i+1);
//			
//			for(int j = 0; j < score[i].length; j++) {
//				sum += score[i][j];
//				System.out.printf("%5d",score[i][j]);
//			}
//			avg = sum/(float)score[i].length;
//			System.out.printf("%5d %5.1f%n",sum,avg);
//			
//		}
//		System.out.println("===================== ");
//		System.out.printf("����:%4d%4d%4d",korTotal,engtotal,mathtotal);
		
		/* Arrays�� �迭 �ٷ�� MathŬ���� ���а��� �ż��� ��Ƴ��� ex) round() random()
		 * �迭�� �񱳿� ��� - equals() toString()  == �������� �� ���̹Ƿ� �ȵ�!
		 * int[] arr = {0,1,2,3,4};
		 * int[][] arr2D= {{11,12}, {21,22}};
		 * System.out.println(Arrays.toString(arr));         // [0, 1, 2, 3 ,4]  //1����
		 * System.out.println(Arrays.deepToString(arr2D));   // [[11, 22], [21, 22]]
		 * 
		 * String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		 * String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		 * System.out.println(Arrays.equals(str2D,str2D2));       //false  // 1���� �迭�� �� 
		 * System.out.println(Arrays.deepEquals(str2D,str2D2));   // true  //2���� �������϶� deep!! 
		 * 
		 * �迭�� ���� copyOf(), copyOfRange()
		 * int[] arr = {0,1,2,3,4};
		 * int[] arr2 = Arrays.copyOf(arr, arr.length);// arr2=[0,1,2,3,4]
		 * int[] arr3 = Arrays.copyOf(arr, 3);         // arr3=[0,1,2]  7�̸�  [0,1,2,3,4,0,0]
		 * int[] arr4 = Arrays.copyOfRange(arr, 2, 4); // arr4=[2,3]
		 * int[] arr5 = Arrays.copyOfRange(arr, 0, 7); // arr5=[0,1,2,3,4,0,0]
		 * 
		 * �迭�� ���� sort()
		 * int[] arr= {3,2,0,1,4};
		 * Arrays.sort(arr); // �迭 arr�� �����Ѵ�.    
		 * System.out println(Arrays.toString(arr)); // [0,1,2,3,4] // �������� ����
		 */
		  String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		  String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		  System.out.println(Arrays.equals(str2D,str2D2));       //false  // 1���� �迭�� �� 
		  System.out.println(Arrays.deepEquals(str2D,str2D2));   // true  //2���� �������϶� deep!! 
		  
	}
}
