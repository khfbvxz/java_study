package javaJS;
import java.util.*;
public class JSch04_4 {

	public static void main(String[] args) {
		/*break문 자신이 포함된 하나의 반복문을 벗어난다. switch문
		 *무한반복문 while(true){ } // true 생략불가
		 *        for( ; ; ){ }
		 */
//		int sum = 0;
//		int i = 0;
//		while(true) { // 무한 반복문  for(:true:){}
//			if(sum > 100)
//				break;
//			++i;
//			sum+=i;
//		}//while문 끝~ 
//		System.out.println("i="+i);
//		System.out.println("sum="+sum);
		
		/*continue 문
		 * 자신이 포함된 반복문의 끝으로 이동- 다음 반복으로 넘어감
		 * 전체 반복 중에서 특정 조건시 반복을 건너뛸 때 유용
		 */
		
//		for(int i =0;i<=10;i++) {
//			if(i%3==0)
//				continue;
		// 조건식이 참이 되어 continue문이 수행되면 블럭 끝으로 이동
		// break문 과 달리 반복문을 벗어나지 않음!!
//			System.out.println(i);//3의 배수는 출력 안됨
		
		/* 이름붙은 반복문
		 * 반복문에 이름을 붙여서 하나 이상의 반복문을 벗어날 수 있다.
		 * break문은 하나의 반복문 벗어남 허나 중첩 반복문에 벗어날 때
		 * 
		 */
		//for 문에 Loop1이라는 이름을 붙였다. Loop1 : 
		Loop1 : for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5)
//					break Loop1; // 이름이 붙은 반복문을 벗어남
					break; //a로
//					continue Loop1; // 쓰는 방법만 알아두기 //end of Loop1로 
//					continue; // end of for로 
				System.out.println(i+"*"+j+"="+i*j);
				//end of for
			}
			System.out.println();//a
		}//end of Loop1
	}//main의 끝 
}
