package javaJS;
import java.util.*;
public class JSch04_2 {

	public static void main(String[] args) {
		/* for�� ������ �����ϴ� ���� ��{}�� �ݺ� �ݺ�Ƚ���� �� �� ����!
		 * int i; // scope(����) ������ġ���� ����� ���� ������ scope �������� ���� 
		 * for(int i=1;i<=5;i++){ // ���� i�� ����� for�� �ȿ����� �ۿ��� ���̰� ������ �ۿ��� ����
		 * 
		 * 		System.out.println("I can do it.");
		 * } 
		 * for(�ʱ�ȭ ; ���ǽ� ; ������) //�ۿ� �����ϸ� �������� < �� �κ��� �� �ڼ��� ����!
		 */
//		for (int i=1; i <= 3; i++) {  // ��{} ���� ������ 3�� �ݺ�
// 		for (int i=1; i <= 10; i=i+2) {  // ��{} ���� ������ 5�� �ݺ�
// 		for (int i=1; i <= 10; i=i*2) {  // ��{} ���� ������ 4�� �ݺ�
// 		for (int i=10; i >= 1; i--) {  // ��{} ���� ������ 10�� �ݺ� //���� ���� ���� ���� !!!!
// 		for (int i=1, j=10; i<= 10; i++,j--) {  // i�� ���� j�� ���� for���� ���� �ΰ� ���� ��� Ÿ�� ���ƾ���!
//			System.out.println("Hello");
//			System.out.println("i="+i+"j="+j); // i ���� ��ȭ�� ���� ���� �� 
//		}

//		int sum1 = 0; //�հ踦 �����ϱ� ���� ����
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		System.out.println(sum);
//		for(int i = 1; i <= 5 ; i++) {
//			sum1 += i;
//			System.out.printf("1���� %2d ������ �� : %2d%n", i,sum1);
//		}
		
		/* ��ø for�� ��ø �ι��̻� ���� ���� 2�߸� 3���̻� �� �Ⱦ� 
		 * 
		 */
		//������
//		for(int i=2; i<=9; i++ ) { // 2�� i * j
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println(); // �� �ٲ� 
//		}
		for(int i=1;i<=10;i++) {
			//System.out.println("**********");
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
