package javaJS;
import java.util.*;
public class JSch04_3 {

	public static void main(String[] args) {
		/*while�� do-while�� ������ ������Ű�� ���� ��{}�� �ݺ� �ݺ�Ƚ���� �� �� 
		 * for�� while�� 100% ���� ȣȯ ���� 
		 * int i=1; m// �ʱ�ȭ 
		 * while (���ǽ�){ 
		 * 	// ���ǽ��� �������� ���� ����, �ݺ��� ������� ���´�.
		 *  System.out.println(i); 
		 *  i++;  // ������
		 * }
		 */
//		int i=5; // �ݺ�Ƚ���� �ִ´�.
//		
//		while(i!=0) {
//			i--; 
//			System.out.println(i + " - I can do it.");
//		}
//		int sum =0, i=0;
//		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
//		while (sum <= 100) {
//			System.out.printf("%d - %d%n",i,sum);
//			sum += ++i;
//		int num = 0, sum = 0;
//		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); //ȭ���� ���� �Է¹��� ���ڿ��� tmp�� ����
//		num = Integer.parseInt(tmp);     // �Է¹��� ���ڿ�(tmp)�� ���� num���� ��ȯ 
//		
//		while(num!=0) {
//			//numdmf 10���� ���� �������� sum�� ���� 
//			sum += num%10; //sum = sum + num%10;
//			System.out.printf("sum=%3d num=%d%n",sum,num);
//			num /=10; // num = num /10; num�� 10���� ���� �� num�� ����
//		}
//		int num1 = 12345, sum1=0;
//		for(num1=12345;num1>0;num1=num1/10){
//			System.out.println(num1%10);
//			sum1 += num1 %10;
//			
//		}
//      �����Ƶ� �� �� ��ȭ Ȯ���ϰ� ����� ���� ������ �� Ȯ��!!! 
//		System.out.println("�� �ڸ����� ��:"+sum);
//		System.out.println("�� �ڸ����� ��:"+sum1);
		
		/* do - while�� ��{}�� �ּ��� �� �� �̻� �ݺ� - ����� �Է¹��� �� ����!
		 *do{
		 *	// ���ǽ��� �������� ���� �� ����� ������� ���´�. (ó�� �ѹ��� ������ ����)
		 *}while (���ǽ�); <- ���� ' : '�� ���� �ʵ��� ����
		 */
		int input = 0 , answer = 0;
		
		answer =(int)(Math.random()*100) + 1;// 1~100������ ���� ���ڸ� answer�� ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("answer="+answer); // ���� �̸� ����
		// �ڵ尡 �ߺ��� �� do whlie������ �ٲ㺸�� �õ� 
		do {
			System.out.print("1�� 100������ ������ �Է��Ͻÿ�.>");

			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");	
			}else if (input<answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		}while(input!=answer);
		System.out.println("�����Դϴ�..");
	}//main�� �� 
}
