package javaJS;
import java.util.Scanner;
import java.util.Arrays; // ctrl+shift+o �ڵ����� import�� �߰� �߿�!!
public class JSch05_1 {

	public static void main(String[] args) {
		/*�迭�� ��� 
		 * �迭�� ����ҷ��� for�� �̿� 
		 * for�� �����ϸ� System.out.println(iArr[i]);
		 *  System.out.println(Arrays.toString(iArr)); Arrays Ŭ���� �̿� �迭�� ������ ���ڿ��� ���� ��ȯ
		 *  ���̾� �˾��� 
		 */
//		int[]  iArr = { 100,95,80,70,60}; // ���̰� 5�� int �迭 
//		// �迭�� ����Ű�� �������� iArr�� ���� ��� 
//		System.out.println(iArr); // [I@7637f22 �� ���� �������� ���ڿ��� ��� @ ��ġ �� �ּ� 
////		 
//		for(int i=0;i<iArr.length;i++) {
//			System.out.println(iArr[i]);
//		}
//		System.out.println(Arrays.toString(iArr)); // ��� [100, 95, 80, 70, 60]
//		
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		for(int i=0;i<iArr1.length;i++) {
//			iArr1[i] = i+1;  //1~10�� ���ڸ� ������� 
//		}
//		for(int i=0;i<iArr.length;i++) {
//			iArr2[i]= (int)(Math.random()*10)+1; //1~10�� ���� �迭 
//		}
//		for(int i=0;i<iArr1.length;i++) {
//			System.out.print(iArr1[i]+",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr1);
//		System.out.println(iArr2);
		
		/* �迭�� Ȱ�� 
		 * 
		 */
		//�迭�� ���հ� ���
//		int sum =0;
//		float average =0f;
//		int[] score = {100, 88, 100, 100, 90};
//		for(int i =0; i<score.length;i++) {
//			sum += score[i];
//		}
//		average = sum / (float)score.length; // ��� ����� float Ÿ������ ������ ����ȯ 
//		System.out.println("���� : "+sum);
//		System.out.println("��� : "+average);
		
		// �ִ밪�� �ּҰ�
//		int[] score1 = {79,88,91,33,100,55,95};
//		int max = score1[0]; //�迭�� ù���� ������ �ִ밪�� �ʱ�ȭ
//		int min = score1[0]; //�迭�� ù���� ������ �ּҰ��� �ʱ�ȭ
//		
//		for(int i=1;i<score1.length;i++) { // �� ù��°������ �ʱ�ȭ �߱� ������ �ι��� ������ �б����� i=1;
//			if(score1[i] > max) {
//				max = score1[i];
//			} else if (score1[i]<min) {
//				min = score1[i];
//			}
//		}//end for
//		System.out.println("�ִ밪 : "+ max);
//		System.out.println("�ּҰ� : "+ min);

		//���� shuffle
		int[] numArr = {0,1,2,3,4,5,6,7,8,9}; //index �� 10 
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0;i<100;i++) {
			int n = (int)(Math.random()*10); // 0~9 �� �� ���� ����ȣ ��´�.
			int tmp = numArr[0];
			numArr[0]= numArr[n];    // numArr[0]�� numArr[n]�� ���� ���� �ٲ۴�. 
			numArr[n]=tmp;
		//	System.out.println(Arrays.toString(numArr)); // ��ȭ�� ������ ��������� for �ȿ�  
		}
		System.out.println(Arrays.toString(numArr)); //Arrays.toString() �迭�� ��Ҹ� ���η� ��� 
		for(int j=0;j<numArr.length;j++) {
			System.out.println(numArr[j]);     // �迭�� ��� ���� ��� 
		}
		
	}


}
