package javaJS;

public class JSch07_1 { 
	public static void main(String[] args) {
		/* ���� ���(Single Inheritance)
		 * - Java�� ���ϻ�Ӹ��� ����Ѵ�. (C++�� ���� ��� ���) // �ϳ��� �θ� ���
		 * class TvDVD extends Tv, DVD{} // ���� ������ �ϳ��� ���ȴ�.
		 * - ������ ���� Ŭ���� �ϳ��� ��Ӱ����, �����ڴ� ���԰���� �Ѵ�.  
		 */
		
		/* ObjectŬ���� - ��� Ŭ������ �ְ�����
		 * - �θ� ���� Ŭ������ �ڵ������� ObjectŬ������ ��ӹް� �ȴ�.
		 * - ��� Ŭ������ ObjectŬ������ ���ǵ� 11���� �޼��带 ��ӹ޴´�.
		 *   toString(), equals(Object obj), hashCode(),....
		 * class Tv {                        class Tv extends Object { // �����Ϸ��� �ڵ��߰����� �θ� ������
		 * }                           ->    }
		 * class SmartTv extends Tv{         class SmartTv extends Tv{ 
		 * }								 }
		 */
		
		/* (�޼���)�������̵�(overriding) �����
		 * - ��ӹ��� ������ �޼��带 �ڽ��� �°� �����ϴ� ��
		 *  class Point{ 
		 *  	int x;
		 *  	int y;
		 *  	String getLocation(){
		 *  		return "x :"+ x + ", y :" + y;
		 *  	}
		 *  }
		 *  
		 *  class Point3D extends Point{
		 *  	int z;
		 *  	String getLocation() {  // �������̵� ����� ���� �Ұ� 
		 *  		return "x :"+ x + ", y :" + y + ", z :" + z; // ���븸 ���� ����! ������{}
		 *  `	}
		 *  }
		 * 
		 */
		
		/* �������̵��� ����
		 * 1. �����(��ȯŸ��, �޼��� �̸�, �Ű����� ���)�� ����Ŭ������ �޼���� ��ġ�ؾ��Ѵ�.
		 * 2. ���� �����ڸ� ����Ŭ������ �޼��庸�� ���� ������ ������ �� ����. // ( public protected defalt private )
		 * 3. ���ܴ� ���� Ŭ������ �ްŵ庸�� ���� ������ �� ����. //�θ� throws (1) (2) �ڽ� throws (1)
		 */
		
		/* �����ε�vs�������̵�
		 * �����ε�   ������ ���� ���ο� �޼��带 �����ϴ� �� (new) (�̸��� ����) ��Ӱ� ����x
		 * �������̵�  ��ӹ��� �޼����� ������ �����ϴ� �� (change, modify)  
		 */
	}
}