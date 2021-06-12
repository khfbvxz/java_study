package javaJS;
import java.util.*;
public class JSch04_3 {

	public static void main(String[] args) {
		/*while문 do-while문 조건을 만족시키는 동안 블럭{}을 반복 반복횟수를 모를 때 
		 * for문 while문 100% 서로 호환 가능 
		 * int i=1; m// 초기화 
		 * while (조건식){ 
		 * 	// 조건식의 연산결과가 참인 동안, 반복될 문장들을 적는다.
		 *  System.out.println(i); 
		 *  i++;  // 증감식
		 * }
		 */
//		int i=5; // 반복횟수를 넣는다.
//		
//		while(i!=0) {
//			i--; 
//			System.out.println(i + " - I can do it.");
//		}
//		int sum =0, i=0;
//		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
//		while (sum <= 100) {
//			System.out.printf("%d - %d%n",i,sum);
//			sum += ++i;
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하세요.(예:12345)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); //화면을 통해 입력받은 문자열을 tmp에 저장
//		num = Integer.parseInt(tmp);     // 입력받은 문자열(tmp)를 숫자 num으로 변환 
//		
//		while(num!=0) {
//			//numdmf 10으로 나눈 나머지를 sum에 더함 
//			sum += num%10; //sum = sum + num%10;
//			System.out.printf("sum=%3d num=%d%n",sum,num);
//			num /=10; // num = num /10; num을 10으로 나눈 후 num에 저장
//		}
//		int num1 = 12345, sum1=0;
//		for(num1=12345;num1>0;num1=num1/10){
//			System.out.println(num1%10);
//			sum1 += num1 %10;
//			
//		}
//      귀찮아도 꼭 값 변화 확인하고 제대로 값이 나오는 지 확인!!! 
//		System.out.println("각 자리수의 합:"+sum);
//		System.out.println("각 자리수의 합:"+sum1);
		
		/* do - while문 블럭{}을 최소한 한 번 이상 반복 - 사용자 입력받을 때 유용!
		 *do{
		 *	// 조건식의 연산결과가 참일 때 수행될 문장들을 적는다. (처음 한번은 무조건 실행)
		 *}while (조건식); <- 끝에 ' : '을 잊지 않도록 주의
		 */
		int input = 0 , answer = 0;
		
		answer =(int)(Math.random()*100) + 1;// 1~100사이의 랜덤 숫자를 answer에 대입
		Scanner scanner = new Scanner(System.in);
		System.out.println("answer="+answer); // 정답 미리 보기
		// 코드가 중복될 시 do whlie문으로 바꿔보는 시도 
		do {
			System.out.print("1과 100사이의 정수를 입력하시오.>");

			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");	
			}else if (input<answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}while(input!=answer);
		System.out.println("정답입니다..");
	}//main의 끝 
}
