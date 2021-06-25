package javaJS;
import java.util.Scanner;
import java.util.Arrays; // ctrl+shift+o 자동으로 import문 추가 중요!!
public class JSch05_2 {

	public static void main(String[] args) {
		/* String 배열의 선언과 생성
		 * String[] name = new String[3] //3개의 문자열을 담을 수 있는 배열 생성
		 * String 참조형 기본값 null 대부분의 기본형 기본값 0(boolean false
		 * String[] name = new String[] {"Kim", "Park","Yi"};
		 * String[] name = {"Kim", "Park","Yi"}; // 이거 위주 위는 별로 안씀 
		 */
//		String[] strArr = { "가위", "바위", "보"}; //index 0~3-1 0~2
//		System.out.println(Arrays.toString(strArr));
//		for(int i =0;i<10;i++) {
//			//System.out.println((int)(Math.random()*3)); //0~2
//			int tmp = (int)(Math.random()*3);
//			System.out.println(strArr[tmp]); // 0~2
//		}
		
		/* 커맨드 라인을 통해 일력받기 
		 * https://www.youtube.com/watch?v=8yjC3t7j-eg&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=45
		 * 싷랭의 Run Configurations... -> Arguments 여기다가 입력 abc 123 "Hello World"
		 * Run 아래 Run Configurations... 
		 * cmd 치고 클래스 위치 alt+enter 치면 소스파일 경로 나옴 java파일이고 클래스 파일 찾을려면 위로
		 * 그다음 경로 복사 cd 치고 복사 후
		 * 클래스명 치고 abc 123 "Hello World" 
		 * 
		 */
//		System.out.println("매개변수의 개수:"+args.length);
//		for(int i =0;i<args.length;i++) {
//			System.out.println("args["+i+"] = \""+args[i]+"\"" );
		
		/* 2차원 배열 테이블 형태의 데이터를 저장하기 위한 배열
		 * int[][] score = new int[4][3]; // 4행 3열의 2차원 배열을 생성
		 * 
		 * 2차원 배열의 초기화		 
		 * int[][] arr = new int[][]{{1,2,3},{4,5,6}};
		 * int[][] arr = {{1,2,3},{4,5,6}}; //new int[][] 가 생략
		 * int[][] arr = {
		 * 					{1,2,3}, // 가독성 좋게 이렇게 많이 씀 
		 * 					{4,5,6}  // 가능하면 이렇게 초기화
		 * 				 };
		 */
		int[][] score= {
				{ 100, 100, 100 },
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 },
				{ 50, 50, 50 }
		};
//		int sum=0;
//		for(int i = 0; i < score.length; i++) {
//			for(int j =0; j < score[i].length; j++) {
//				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
//				sum += score[i][j];
//			}
//		}
//		System.out.println("sum=" +sum);
		int korTotal = 0, engtotal=0 ,mathtotal=0;
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("======================");
		
		for(int i = 0; i < score.length;i++) {
			int sum = 0; 		//개인별 총점
			float avg = 0.0f;   //개인별 평균
			korTotal += score[i][0];
			engtotal += score[i][1];
			mathtotal += score[i][2];
			System.out.printf("%3d",i+1);
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n",sum,avg);
			
		}
		System.out.println("===================== ");
		System.out.printf("총점:%4d%4d%4d",korTotal,engtotal,mathtotal);
	}
}
