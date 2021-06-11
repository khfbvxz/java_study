package javaJS;
import java.util.Scanner;
public class JSch04_1 {

	public static void main(String[] args) {
		/* switch 문 처리해야 하는 경우의 수가 많을 때 유용한 조건문 
		 * switch -> if문 항상 가능 / if->switch문  바꿀 수 있는지 고민 if문이 복잡할 때
		 * 제약조건 1. switch문의 조건식 결과는 정수 또는 문자열이어야함
		 *       2. case문의 값은 정수 상수(문자), 문자열만 가능하며 중복x 변수x 실수x 
		 * switch(조건식) { 조건식은 정수나 문자열                //1. 조건식 계산
		 * 	case 값1 :            					      //2. 조건식의 결과와 일치하는 case문으로 이동한다.
		 * 		//조석식의 결과가 값1일 때 수행될 문장들             //이후의 문장들을 수행한다.  
		 *		break;  //switch문을 벗어남 빼먹지 말것!!		  //break문이나 switch문이 끝을 만나면 switch문 전체를 빠져나간다
		 * 	case 값2 :
		 * 		//조석식의 결과가 값2일 때 수행될 문장들
		 *		break;
		 *	default :
		 *		//조건식의 결과와 일치하는 case문이 없을 때 break 없어도됨!
		 *}
		 */
//		System.out.print("현재 월을 입력하세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 mouth에 저장
//		
//		switch (month) {
//			case 3: case 4: case 5:
//				System.out.println("현재의 계절은 봄입니다.");			
//				break; //break문 조심
//			case 6: case 7: case 8:
//				System.out.println("현재의 계절은 여름입니다.");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("현재의 계절은 가을입니다.");
//				break;
//			default:
//	//  	case 12: case 1: case 2:
//				System.out.println("현재의 계절은 겨울입니다.");
//	    }
//				
		/*임의의 정수 만들기 Math.random() 0.0과 1.0 사이의 임의의 double 값을 반환 
		 * 0.0 < =Math.random() < 1.0
		 * 1. 각 변에 3을 곱한다.
		 * 0.0 * 3 <= Math.random() < 1.0 * 3
		 * 2. 각 변을 int형으로 변환한다.
		 * (int)0.0 <= (int)(Math.random() * 3) < (int)1.0
		 * 0 <= (int)(Math.random() * 3) < 3
		 * 3. 각 변에 1을 더한다.
		 * 0+1 <= (int)(Math.random() * 3)+1 < 3+1
		 * 1 <= (int)(Math.random() * 3)+1 < 4
		 */
		int num = 0;
		for (int i = 1; i<=10; i++) {
//			System.out.println(Math.random()); // 범위 0.0 <= x < 1.0 사이
//			System.out.println(Math.random()*10); // 범위 0.0 <= x < 10.0 사이
//			System.out.println((int)(Math.random()*10)); // 범위 0 <= x < 10 사이
//			System.out.println((int)(Math.random()*10)+1); // 범위 1 <= x < 11 사이
			//-5~5 
			System.out.println((int)(Math.random()*11)-5); // 범위 -5 <= x < 6 사이
		}
	
	}
}
