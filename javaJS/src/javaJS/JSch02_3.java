package javaJS;
import java.util.*; // import�� �߰� *�� ��� Scanner�� ����� ��� 
public class JSch02_3 {

	public static void main(String[] args) {
		/* ȭ�鿡�� �Է¹ޱ� Scanner
		 * Scanner ȭ�����κ��� �����͸� �Է¹޴� ����� �ϴ� Ŭ����
		 * import �� �߰��ؾߵ� 7�� �ڼ��� ���
		 * import java.util.*;
		 * Scanner ��ü�� �����ؾߵ� Scanner scanner = new Scanner (System.in)<-ȭ���Է�
		 * Scanner ��ü ���  int num = scanner.nextInt();  ȭ�鿡�� �Էƹ��� ������ num�� ���� �Ǽ��� Float
		 * String input = scanner.nextLine(); // ȭ�鿡�� �Է¹��� ������ input�� ���� next.Line() �� ��
		 * int num = Integer.parseInt(input); //���ڿ�(input)�� ����(num)�� ��ȯ    
		 * ����->���ڿ� ����+"" ���ڿ�->����  Integer.paraseInt()                               
		 */
		Scanner scanner = new Scanner (System.in); //�Էµ� �� ���
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); 
		System.out.println(num);// ���ڰ� �ƴ� ���ڰ� ��µ�
		
		/* ���ڿ� ���ڰ��� ��ȯ 
		 * ����->���� 3+'0' ����->���� '3'-'0'
		 * ����->���ڿ� 3+"" ����->���ڿ� '3'+""
		 * ���ڿ�-> ���� Integer.parseInt("3")
		 * ���ڿ�-> ���� Double.parseDouble("3.4")
		 * ���ڿ� ->���� "3" -> '3' charAt(0)  "3".charAt(0)
		 */
		String str = "3";
		System.out.println(str.charAt(0)-'0');      // '3' - '0'  = ���� 3
		System.out.println('3'-'0'+1);              // 4
		System.out.println(Integer.parseInt(str)+1);  // 3  +1
		System.out.println(str + 1);                // 31 �տ� ���ڿ� "3" �̿��� �ڿ��� ���ڷ� "1"�� ��ȯ
		System.out.println(3 +'0');                 // 51 '0' �� ���ڷ� 48
	}

}
