package javaJS;
import java.util.Scanner;
public class JSch4 {

	public static void main(String[] args) {
		/* ���ǹ�(if��, switch��) ������ �����Ҷ��� {}�� ���� 0~1�� 
		 * �ݺ���(for��, while��) ������ �����ϴ� ���� {}�� ���� 0~n��
		 * flow control statement ��� (���ǹ�,�ݺ���)
		 * str.equalsIgnoreCase("yes") ���ڿ� str�� ������ "yes"�� �� ��ҹ��� ����X
		 *{} �� ���������� �ϳ��� ������ �� 
		 */
		//int score1 = 80;
		//if(score1 > 60) 
		{ //����
			System.out.println("�հ��Դϴ�."); //tap���� �鿩�����ϸ� ������ ������ 
		}//�� 
		
		/*if-else�� ������ �ϳ�
		 *if(���ǽ�){
		 *	//���ǽ��� ���� �� ����� �����
		 *}else {
		 *	//���ǽ��� �����϶� ����� �����
		 *}
		 */
		
		/*if -else if �� �������� ���ǽ��� ������
		  *if(���ǽ�1){
		 *	//���ǽ�1�� ���� �� ����� �����
		 *}else if (���ǽ�2){
		 *	//���ǽ�2�� �������� ���� �� ����� ����� 
		 *}else {
		 *	//���ǽ��� �����϶� ����� �����
		 *} 
		 */
//		int score = 0;     // ������ �����ϱ� ���� ����
//		char grade = ' ';  // ������ �����ϱ� ���� ���� �������� �ʱ�ȭ
//		
//		System.out.print("������ �Է��ϼ���>");
//		Scanner scanner = new Scanner(System.in); 
//		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ���� 
//		
//		if(score >= 90) {        //90�� �̻��̸� A����
//			grade = 'A';
//		} else if (score >= 80){ //80�� �̻��̸� B���� 
//			grade = 'B';         //(80<=score && score<90) 
//			            //�տ� if������ ó���ǰ� �������ϱ� ���ǿ� �κ� ��������
//			
//		} else if (score >= 70){ //70�� �̻��̸� C����
//			grade = 'C';         //(70<=score && score<80) 
//		} else {                 //������ D����
//			grade ='D';
//		}
//		System.out.println("����� ������ "+ grade +"�Դϴ�.");
	
		//��ø if�� - if�� �ȿ� if�� 
		int score = 0;     // ������ �����ϱ� ���� ����
		char grade = ' ', opt ='0';  // ������ �����ϱ� ���� ���� �������� �ʱ�ȭ

		System.out.print("������ �Է����ּ���>");
		Scanner scanner = new Scanner(System.in); 
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ���� 
		System.out.printf("����� ������ %d�Դϴ�.%n",score);
		if(score >= 90) {        //90�� �̻��̸� A����
			grade = 'A';
			if(score>=98 ) {
				opt ='+';
			} else if (score < 94) {
				opt ='-';
			}
		} else if (score >= 80){ //80�� �̻��̸� B���� 
			grade = 'B';         //(80<=score && score<90) 
			//�տ� if������ ó���ǰ� �������ϱ� ���ǿ� �κ� ��������
			if(score>=88 ) {
				opt ='+';
			} else if (score < 84) {
				opt ='-';
			}
		} else if (score >= 70){ //70�� �̻��̸� C����
			grade = 'C';         //(70<=score && score<80) 
			if(score>=78 ) {
				opt ='+';
			} else if (score < 74) {
				opt ='-';
			}
		} else {                 //������ D����
			grade ='D';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.%n",grade,opt);		
	}


}
