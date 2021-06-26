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
		
		/* String 클래스 는 char[] 와 매서드(기능)를 결합한것
		 * String 클래스 = char[] + 매서드(기능)  // 문자뱌열 
		 * String 클래스는 내용을 변경할 수 없다. (read only)  
		 * 주요 매서드
		 * char charAt(int index)               문자열에서 해당위피(index)에 있는 문자를 반환한다.
		 * int length()							문자열의 길이를 반환한다.
		 * String substring(int from, int to)	문자열에서 해당 범위 (from~to)의 문자열을 반환한다 (to는 포함 안 됨)
		 * boolean equals(Object obj)			문자열의 내용이 같은지 확인한다. 같은면 true 다르면 false
		 * char[] toCharArray() 				문자열을 문자배열 (char[])로 변환해서 반환한다. 
		 */
		
//		String str = "ABCDE";
//		char ch = str.charAt(2);
//		String str2 = str.substring(1,4);
//		String str3 = str.substring(1, str.length());
//		String str4 = str.substring(1);
//		
//		System.out.println(ch);
//		System.out.println(str2); //BCD
//		System.out.println(str3); //
//		System.out.println(str4); //1부터 끝까지 
		 
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
//		int korTotal = 0, engtotal=0 ,mathtotal=0;
//		System.out.println("번호  국어  영어  수학  총점  평균");
//		System.out.println("======================");
//		
//		for(int i = 0; i < score.length;i++) {
//			int sum = 0; 		//개인별 총점
//			float avg = 0.0f;   //개인별 평균
//			korTotal += score[i][0];
//			engtotal += score[i][1];
//			mathtotal += score[i][2];
//			System.out.printf("%3d",i+1);
//			
//			for(int j = 0; j < score[i].length; j++) {
//				sum += score[i][j];
//				System.out.printf("%5d",score[i][j]);
//			}
//			avg = sum/(float)score[i].length;
//			System.out.printf("%5d %5.1f%n",sum,avg);
//			
//		}
//		System.out.println("===================== ");
//		System.out.printf("총점:%4d%4d%4d",korTotal,engtotal,mathtotal);
		
		/* Arrays로 배열 다루기 Math클래스 수학관련 매서드 모아놓음 ex) round() random()
		 * 배열의 비교와 출력 - equals() toString()  == 참조변수 값 비교이므로 안됨!
		 * int[] arr = {0,1,2,3,4};
		 * int[][] arr2D= {{11,12}, {21,22}};
		 * System.out.println(Arrays.toString(arr));         // [0, 1, 2, 3 ,4]  //1차원
		 * System.out.println(Arrays.deepToString(arr2D));   // [[11, 22], [21, 22]]
		 * 
		 * String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		 * String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		 * System.out.println(Arrays.equals(str2D,str2D2));       //false  // 1차원 배열일 떄 
		 * System.out.println(Arrays.deepEquals(str2D,str2D2));   // true  //2차원 다차원일때 deep!! 
		 * 
		 * 배열의 복사 copyOf(), copyOfRange()
		 * int[] arr = {0,1,2,3,4};
		 * int[] arr2 = Arrays.copyOf(arr, arr.length);// arr2=[0,1,2,3,4]
		 * int[] arr3 = Arrays.copyOf(arr, 3);         // arr3=[0,1,2]  7이면  [0,1,2,3,4,0,0]
		 * int[] arr4 = Arrays.copyOfRange(arr, 2, 4); // arr4=[2,3]
		 * int[] arr5 = Arrays.copyOfRange(arr, 0, 7); // arr5=[0,1,2,3,4,0,0]
		 * 
		 * 배열의 정렬 sort()
		 * int[] arr= {3,2,0,1,4};
		 * Arrays.sort(arr); // 배열 arr을 정렬한다.    
		 * System.out println(Arrays.toString(arr)); // [0,1,2,3,4] // 오름차순 정렬
		 */
		  String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		  String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		  System.out.println(Arrays.equals(str2D,str2D2));       //false  // 1차원 배열일 떄 
		  System.out.println(Arrays.deepEquals(str2D,str2D2));   // true  //2차원 다차원일때 deep!! 
		  
	}
}
