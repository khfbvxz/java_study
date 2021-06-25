package javaJS;
import java.util.Scanner;
import java.util.Arrays; // ctrl+shift+o 자동으로 import문 추가 중요!!
public class JSch05_1 {

	public static void main(String[] args) {
		/*배열의 출력 
		 * 배열을 출력할려면 for문 이용 
		 * for문 불편하면 System.out.println(iArr[i]);
		 *  System.out.println(Arrays.toString(iArr)); Arrays 클래스 이용 배열의 내용을 문자열로 만들어서 반환
		 *  많이씀 알아줘 
		 */
//		int[]  iArr = { 100,95,80,70,60}; // 길이가 5인 int 배열 
//		// 배열을 가리키는 참조변수 iArr의 값을 출력 
//		System.out.println(iArr); // [I@7637f22 와 같은 형식의의 문자열이 출력 @ 위치 뒤 주소 
////		 
//		for(int i=0;i<iArr.length;i++) {
//			System.out.println(iArr[i]);
//		}
//		System.out.println(Arrays.toString(iArr)); // 출력 [100, 95, 80, 70, 60]
//		
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		for(int i=0;i<iArr1.length;i++) {
//			iArr1[i] = i+1;  //1~10의 숫자를 순서대로 
//		}
//		for(int i=0;i<iArr.length;i++) {
//			iArr2[i]= (int)(Math.random()*10)+1; //1~10의 값을 배열 
//		}
//		for(int i=0;i<iArr1.length;i++) {
//			System.out.print(iArr1[i]+",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr1);
//		System.out.println(iArr2);
		
		/* 배열의 활용 
		 * 
		 */
		//배열의 총합과 평균
//		int sum =0;
//		float average =0f;
//		int[] score = {100, 88, 100, 100, 90};
//		for(int i =0; i<score.length;i++) {
//			sum += score[i];
//		}
//		average = sum / (float)score.length; // 계산 결과를 float 타입으로 얻으려 형변환 
//		System.out.println("총합 : "+sum);
//		System.out.println("평균 : "+average);
		
		// 최대값과 최소값
//		int[] score1 = {79,88,91,33,100,55,95};
//		int max = score1[0]; //배열의 첫번쨰 값으로 최대값을 초기화
//		int min = score1[0]; //배열의 첫번쨰 값으로 최소값을 초기화
//		
//		for(int i=1;i<score1.length;i++) { // 위 첫번째값으로 초기화 했기 때문에 두번쨰 값부터 읽기위해 i=1;
//			if(score1[i] > max) {
//				max = score1[i];
//			} else if (score1[i]<min) {
//				min = score1[i];
//			}
//		}//end for
//		System.out.println("최대값 : "+ max);
//		System.out.println("최소값 : "+ min);

		//섞기 shuffle
		int[] numArr = {0,1,2,3,4,5,6,7,8,9}; //index 값 10 
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0;i<100;i++) {
			int n = (int)(Math.random()*10); // 0~9 중 한 값을 임의호 얻는다.
			int tmp = numArr[0];
			numArr[0]= numArr[n];    // numArr[0]과 numArr[n]의 값을 서로 바꾼다. 
			numArr[n]=tmp;
		//	System.out.println(Arrays.toString(numArr)); // 변화는 과정을 보고싶을땐 for 안에  
		}
		System.out.println(Arrays.toString(numArr)); //Arrays.toString() 배열의 요소를 가로로 출력 
		for(int j=0;j<numArr.length;j++) {
			System.out.println(numArr[j]);     // 배열의 요소 값을 출력 
		}
		
	}


}
