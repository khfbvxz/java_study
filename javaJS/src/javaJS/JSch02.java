package javaJS;

public class JSch02 {

	public static void main(String[] args) {
		System.out.println(6+3);// ���� ���� �� ��� ��� ���
		System.out.println("6+3");// " " ū ����ǥ ���� �״�� ���
		
		int x1 = 100; // x : ����(�ϳ��� ���� �����ϱ����� ����,
		// x = 200;    
		//���ͷ� : �� ��ü�� ���� �ǹ� 100, 200 
		final int y1 =300; // y�� ��� 
		// y=200; 
		System.out.println(x1);// " " ū ����ǥ ���� �״�� ���
		System.out.println(y1);
		/* ���ͷ��� ���λ� �� ���̻�
		 * ���̻� : ������ L , �Ǽ��� f ,d  */
		boolean power = true; //true or false 
		byte b = 127; // -128~127
		int oct = 010;//8����, 10������8
		int hex = 0x10;//16���� 10������ 16 ���� �� +-20��
		long l=1_000_000_000L;//long ���� -2^63 ~ 2^63-1 
	    float f = 3.14f; // ���̻� f ���� �Ұ�
	    double d = 3.14; // ���̻� d ���� ���� 
	    //3.14f �� double ������ �� �б� ������ ���� 
		System.out.println(power);
		System.out.println(b);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		// ���ͷ� �� Ȯ��
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		/*���ڿ� ���ڿ�
		 * char ch = 'a'; '':// ���� ''���� �ϳ��� ���� �ʿ�
		 * String s = "ABC"; "";//�� ���ڿ�
		 */
		char ch = 'A';
		
		int i = 'A'; //A�� ���� �ڵ� 65 ���
		System.out.println(ch); 
		System.out.println(i); 
		String s1 = "ABC"; // String(< Ŭ����) s1="ABC";
		//String s2 = new String ("ABC"); ���Ŀ� 
		String str = "";
		String str1 = "ABCD";
		String str2 = "123";
		String str3 = str1 + str2;
		String name = "JA" + "VA";
		String str4 = name + 8.0;
		System.out.println(s1); 
		System.out.println(str); //�� ���ڿ� (empty string)
		System.out.println(str3); //���ڿ� ��ġ��
		System.out.println(name); 
		System.out.println(7+" "); // ����+���� = ����+���� = ����+���� =����
		System.out.println(" "+7); 
		System.out.println(7+""); 
		System.out.println(""+""); 
		System.out.println(7+7+""); // �տ� �ΰ� ���ϰ� ���ڿ� �� ���ռ��� ����
		System.out.println(""+7+7); // ���ڿ��� ���� ����+���� �� ��
		
	}

}
