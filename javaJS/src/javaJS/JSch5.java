package javaJS;
import java.util.Scanner;
public class JSch5 {

	public static void main(String[] args) {
		/* �迭 "����Ÿ��"�� ���� ������ �ϳ��� �������� �ٷ�°�.
		 * int score1, score2, score3 ...;
		 * int[] score = new int[5] // ������� 5�� ���� �̸��� ����
		 * // �ڵ����� ��ȣ �پ���  �迭�� �ε��� 0���� ���� ������!
		 * 
		 * �迭�� ����� ����(�����ؾ� ������ ��������� �������)
		 * �迭�� �ٷ�� ���� ���������� ���� 
		 * Ÿ��[] (<- �迭��ȣ) �����̸�; java���� ���� ���� �� ��ȣ
		 * Ÿ�� �����̸�[]; c��� �� 
		 * 
		 *  Ÿ��[] �����̸�;         // �迭�� ���� (�迭�� �ٷ�� ���� �������� ����
		 *  �����̸� = new Ÿ��[����] // �迭�� ���� (���� ��������� ����)
		 *  int[] score;
		 *  score = new int[5]; // 8��� ����? 
		 *  �迭�� �ε��� - �� ��ҿ� �ڵ����� �ٴ� ��ȣ 
		 *             ���� 0~�迭����-1 ����
		 */
		
//		int[] score;        //�迭 score�� ���� (��������)
//		score = new int[5];// �迭�� ���� (int �������x5)
//		int[] score = new int[5]; //�迭�� ����� ������ ���ÿ�~
//		score[3] = 100;
//		System.out.println("score[0]="+score[0]);
//		System.out.println("score[1]="+score[1]);
//		System.out.println("score[2]="+score[2]);
//		System.out.println("score[3]="+score[3]);
//		System.out.println("score[4]="+score[4]);
//		
//		int value = score[3];
//		System.out.println("value="+value);
		
		/* �迭�� ���� 
		 * �迭�̸�.length - �迭�� ���� (int�� ���)
		 * int[] arr = new int[5]; // �迭�� �ѹ� �����ϸ� (�����ϴ� ����) �� ���̸� �ٲ� �� ����!
		 * int tmp = arr.length; // tmp�� 5 ����
		 *  // ���� �ٲܼ� x ���� why-?? ���ؾȰ� �ٽ� ���� ������
		 *         �����ϸ� ���ο� ū �� ����� �迭 ����
		 */
//		int[] arr = new int[10];
//		System.out.println("arr.length="+arr.length);
//		
//		for(int i=0 ; i < arr.length ; i++) { //index ������ ����� �ʰ� �ϱ� ���� 
//			System.out.println("arr["+i+"]"+ arr[i]);
//		}
		/* �迭�� �ʱ�ȭ - ���� �� ��ҿ� ó������ ���� �����ϴ� ��. �迭�� �ڵ��ʱ�ȭ int ���� 0
		 * int[] score = new int[5];
		 * score[0]=50; score[1]=60; ...
		 * for�� �� ���� ���� 
		 * 
		 *  int[] score = new int[]{50,60,70,80,90};
		 *  int[] score = {50,60,70,80,90};  // new int[] ���� ����  99%�̰� �� 
		 *  // int[] score; score = {50,60,70,80,90}; �� �ٷ� ������ ������ ����� ��! 
		 *  
		 */
	

	}


}
