package javaJS;

public class JSch03_2 {

	public static void main(String[] args) {
		/*�� ������ �� �ǿ����ڸ� ���ؼ� true �Ǵ� false
		 * >, <, >=, <=  'A'>'B'->65>66 false
		 * ==, != 
		 * ���ڿ� �񱳿��� == ��� equals()�� ����ؾ���
		 */
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3==str4);     // false
		System.out.println(str3.equals(str4));
		
		/*�� ������ &&(AND) ||(OR)
		 */
		//i�� 2�� ��� �Ǵ� 3�ǹ������ 6�� ����� �ƴϴ�.
		// (i%2==0 || i%3==0) && i%6!=0
		//���� ch�� ���� ('0'~'9')�̴�.
		//'0' <= ch && ch <='9' '0'=48~'9'=57
		//�� ���������� false <=> true
		// ch < 'a' || ch >'z' = !('a' <= ch && ch <= 'z'
		//                             �ҹ��ڰ� �ƴ���
		
		//���� ������ ���ǽ��� ����� ���� �������� �޸��Ѵ�
		//���ǽ� ? ��1 : ��2 
		//���ǽ��� ���̸� ��1 �����̸� ��2(�Ŀ� ���� �ü� ����)
		//result = (x > y) ? x : y ;
		//�� �� if�� �� ���� �� �� ���� if���� ������ �� �� ����
		//if (x > y) 
		//   result = x;
		//else
		//   result = y;
		
		/* ���� ������ ������ �ǿ����ڸ� ���� �ǿ����ڿ� ���� �� ����� ���� ��ȯ
		 *  (left)lvalue x=3 rvalue(right)
		 *  ���� ���� ������ 
		 *  ex) i += 3; ->  i = i+3;
		 *      i *= (10 = j); -> i = i * (10 + j);  
		 */
		
	}

}
