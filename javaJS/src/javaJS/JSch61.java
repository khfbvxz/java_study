package javaJS;
import java.util.Scanner;

class JSch61{
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은"+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은"+ t2.channel + "입니다.");
		
		t1.channel=7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		t2=t1; // 참조변수 t1의 값을 t2에 저장
		System.out.println("t1의 channel값은"+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은"+ t2.channel + "입니다.");
		
		/* 객체 배열 == 참조변수 배열
		 * Tv tv1. tv2, tv3;   ->  
		 *  Tv[] tvArr = new Tv[3]; //길이가 3인 Tv타입의 참조변수 배열
		 * // 객체를 생성해서 배열의 각 요소의 저장
		 * tvArr[0] = new Tv();	
		 * tvArr[1] = new Tv();	  // 안에다 객체들을 만들어야됨!! 까먹지 말것
		 * tvArr[2] = new Tv();	
		 * 
 		 * Tv[] tvArr = {new Tv(), new Tv(), new Tv() }; // 위의 3문장을 간단히 
		 */
	}
}