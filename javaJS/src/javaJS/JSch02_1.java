package javaJS;

public class JSch02_1 {

	public static void main(String[] args) {
		//두 변수의 값 교환
		int x = 4, y =2 ;
		int temp;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		temp = x;  //1. x의 값을 temp에 저장
		x = y;     //2. y의 값을 x 저장  
		y = temp ; //3. temp의 값을 y에 저장
		System.out.println("x="+x);// '+'는 숫자 앞에 글자를 붙일떼도 사용
		System.out.println("y="+y);
		
		
		
	}

}
