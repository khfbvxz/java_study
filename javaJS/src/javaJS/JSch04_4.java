package javaJS;
import java.util.*;
public class JSch04_4 {

	public static void main(String[] args) {
		/*break�� �ڽ��� ���Ե� �ϳ��� �ݺ����� �����. switch��
		 *���ѹݺ��� while(true){ } // true �����Ұ�
		 *        for( ; ; ){ }
		 */
//		int sum = 0;
//		int i = 0;
//		while(true) { // ���� �ݺ���  for(:true:){}
//			if(sum > 100)
//				break;
//			++i;
//			sum+=i;
//		}//while�� ��~ 
//		System.out.println("i="+i);
//		System.out.println("sum="+sum);
		
		/*continue ��
		 * �ڽ��� ���Ե� �ݺ����� ������ �̵�- ���� �ݺ����� �Ѿ
		 * ��ü �ݺ� �߿��� Ư�� ���ǽ� �ݺ��� �ǳʶ� �� ����
		 */
		
//		for(int i =0;i<=10;i++) {
//			if(i%3==0)
//				continue;
		// ���ǽ��� ���� �Ǿ� continue���� ����Ǹ� �� ������ �̵�
		// break�� �� �޸� �ݺ����� ����� ����!!
//			System.out.println(i);//3�� ����� ��� �ȵ�
		
		/* �̸����� �ݺ���
		 * �ݺ����� �̸��� �ٿ��� �ϳ� �̻��� �ݺ����� ��� �� �ִ�.
		 * break���� �ϳ��� �ݺ��� ��� �㳪 ��ø �ݺ����� ��� ��
		 * 
		 */
		//for ���� Loop1�̶�� �̸��� �ٿ���. Loop1 : 
		Loop1 : for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5)
//					break Loop1; // �̸��� ���� �ݺ����� ���
					break; //a��
//					continue Loop1; // ���� ����� �˾Ƶα� //end of Loop1�� 
//					continue; // end of for�� 
				System.out.println(i+"*"+j+"="+i*j);
				//end of for
			}
			System.out.println();//a
		}//end of Loop1
	}//main�� �� 
}
