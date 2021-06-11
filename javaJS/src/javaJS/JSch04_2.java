package javaJS;
import java.util.*;
public class JSch04_2 {

	public static void main(String[] args) {
		/* for문 조건을 만족하는 동안 블럭{}을 반복 반복횟수를 알 때 적합!
		 * int i; // scope(범위) 선언위치부터 선언된 블럭의 끝까지 scope 좁을수록 좋음 
		 * for(int i=1;i<=5;i++){ // 현재 i는 제어변수 for문 안에서만 밖에서 쓰이고 싶을때 밖에서 선언
		 * 
		 * 		System.out.println("I can do it.");
		 * } 
		 * for(초기화 ; 조건식 ; 증감식) //밖에 선언하면 생략가능 < 이 부분은 더 자세히 보자!
		 */
//		for (int i=1; i <= 3; i++) {  // 블럭{} 안의 문장을 3번 반복
// 		for (int i=1; i <= 10; i=i+2) {  // 블럭{} 안의 문장을 5번 반복
// 		for (int i=1; i <= 10; i=i*2) {  // 블럭{} 안의 문장을 4번 반복
// 		for (int i=10; i >= 1; i--) {  // 블럭{} 안의 문장을 10번 반복 //조건 주의 증감 주의 !!!!
// 		for (int i=1, j=10; i<= 10; i++,j--) {  // i는 증가 j는 감소 for문에 변수 두개 가능 대신 타입 같아야함!
//			System.out.println("Hello");
//			System.out.println("i="+i+"j="+j); // i 값의 변화를 보고 싶을 때 
//		}

//		int sum1 = 0; //합계를 저장하기 위한 변수
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		System.out.println(sum);
//		for(int i = 1; i <= 5 ; i++) {
//			sum1 += i;
//			System.out.printf("1부터 %2d 까지의 합 : %2d%n", i,sum1);
//		}
		
		/* 중첩 for문 중첩 두번이상 가능 보통 2중만 3중이상 잘 안씀 
		 * 
		 */
		//구구단
//		for(int i=2; i<=9; i++ ) { // 2단 i * j
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println(); // 줄 바꿈 
//		}
		for(int i=1;i<=10;i++) {
			//System.out.println("**********");
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
