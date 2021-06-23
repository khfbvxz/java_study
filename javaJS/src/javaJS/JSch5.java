package javaJS;
import java.util.Scanner;
public class JSch5 {

	public static void main(String[] args) {
		/* 배열 "같은타입"의 여러 변수를 하나의 묶음으로 다루는것.
		 * int score1, score2, score3 ...;
		 * int[] score = new int[5] // 저장공간 5개 생성 이름은 없음
		 * // 자동으로 번호 붙어짐  배열의 인덱스 0부터 시작 연속적!
		 * 
		 * 배열의 선언과 생성(생성해야 실제로 저장공간이 만들어짐)
		 * 배열을 다루기 위한 참조변수의 선언 
		 * 타입[] (<- 배열기호) 변수이름; java에서 많이 쓰임 더 선호
		 * 타입 변수이름[]; c언어 쪽 
		 * 
		 *  타입[] 변수이름;         // 배열을 선언 (배열을 다루기 위한 참조변수 선언
		 *  변수이름 = new 타입[길이] // 배열을 생성 (실제 저장공간을 생성)
		 *  int[] score;
		 *  score = new int[5]; // 8행과 차이? 
		 *  배열의 인덱스 - 각 요소에 자동으로 붙는 번호 
		 *             법위 0~배열길이-1 까지
		 */
		
//		int[] score;        //배열 score를 선언 (참조변수)
//		score = new int[5];// 배열의 생성 (int 저장공간x5)
//		int[] score = new int[5]; //배열의 선언과 생성을 동시에~
//		score[3] = 100;
//		System.out.println("score[0]="+score[0]);
//		System.out.println("score[1]="+score[1]);
//		System.out.println("score[2]="+score[2]);
//		System.out.println("score[3]="+score[3]);
//		System.out.println("score[4]="+score[4]);
//		
//		int value = score[3];
//		System.out.println("value="+value);
		
		/* 배열의 길이 
		 * 배열이름.length - 배열의 길이 (int형 상수)
		 * int[] arr = new int[5]; // 배열은 한번 생성하면 (실행하는 동안) 그 길이를 바꿀 수 었다!
		 * int tmp = arr.length; // tmp에 5 저장
		 *  // 길이 바꿀수 x 이유 why-?? 이해안가 다시 보자 ㅋㅋㅋ
		 *         부족하면 새로운 큰 걸 만들고 배열 복사
		 */
//		int[] arr = new int[10];
//		System.out.println("arr.length="+arr.length);
//		
//		for(int i=0 ; i < arr.length ; i++) { //index 범위를 벗어나지 않게 하기 위해 
//			System.out.println("arr["+i+"]"+ arr[i]);
//		}
		/* 배열의 초기화 - 뱌열의 각 요소에 처음으로 값을 저장하는 것. 배열은 자동초기화 int 형태 0
		 * int[] score = new int[5];
		 * score[0]=50; score[1]=60; ...
		 * for문 쓸 쑤도 있음 
		 * 
		 *  int[] score = new int[]{50,60,70,80,90};
		 *  int[] score = {50,60,70,80,90};  // new int[] 생략 가능  99%이거 씀 
		 *  // int[] score; score = {50,60,70,80,90}; 두 줄로 나누면 에러남 기억할 것! 
		 *  
		 */
	

	}


}
