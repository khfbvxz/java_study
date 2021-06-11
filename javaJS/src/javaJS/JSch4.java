package javaJS;
import java.util.Scanner;
public class JSch4 {

	public static void main(String[] args) {
		/* 조건문(if문, switch문) 조건을 만족할때만 {}를 수행 0~1번 
		 * 반복문(for문, while문) 조건을 만족하는 동안 {}를 수행 0~n번
		 * flow control statement 제어문 (조건문,반복문)
		 * str.equalsIgnoreCase("yes") 문자열 str의 내용이 "yes"일 때 대소문자 구분X
		 *{} 블럭 여러문장을 하나로 묶어줄 때 
		 */
		//int score1 = 80;
		//if(score1 > 60) 
		{ //시작
			System.out.println("합격입니다."); //tap으로 들여쓰기하면 가독성 좋아짐 
		}//끝 
		
		/*if-else문 둘중의 하나
		 *if(조건식){
		 *	//조건식이 참일 때 수행될 문장들
		 *}else {
		 *	//조건식이 거짓일때 수행될 문장들
		 *}
		 */
		
		/*if -else if 문 여러개의 조건식을 포함함
		  *if(조건식1){
		 *	//조건식1이 참일 때 수행될 문장들
		 *}else if (조건식2){
		 *	//조건식2의 연산결과가 참일 때 수행될 문장들 
		 *}else {
		 *	//조건식이 거짓일때 수행될 문장들
		 *} 
		 */
//		int score = 0;     // 점수를 저장하기 위한 변수
//		char grade = ' ';  // 학점을 저장하기 위한 변수 공백으로 초기화
//		
//		System.out.print("점수를 입력하세요>");
//		Scanner scanner = new Scanner(System.in); 
//		score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장 
//		
//		if(score >= 90) {        //90점 이상이면 A학점
//			grade = 'A';
//		} else if (score >= 80){ //80점 이상이면 B학점 
//			grade = 'B';         //(80<=score && score<90) 
//			            //앞에 if문에서 처리되고 내려오니깐 조건에 부분 생략가능
//			
//		} else if (score >= 70){ //70점 이상이면 C학점
//			grade = 'C';         //(70<=score && score<80) 
//		} else {                 //나머지 D학점
//			grade ='D';
//		}
//		System.out.println("당신의 학점은 "+ grade +"입니다.");
	
		//중첩 if문 - if문 안에 if문 
		int score = 0;     // 점수를 저장하기 위한 변수
		char grade = ' ', opt ='0';  // 학점을 저장하기 위한 변수 공백으로 초기화

		System.out.print("점수를 입력해주세요>");
		Scanner scanner = new Scanner(System.in); 
		score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장 
		System.out.printf("당신의 학점은 %d입니다.%n",score);
		if(score >= 90) {        //90점 이상이면 A학점
			grade = 'A';
			if(score>=98 ) {
				opt ='+';
			} else if (score < 94) {
				opt ='-';
			}
		} else if (score >= 80){ //80점 이상이면 B학점 
			grade = 'B';         //(80<=score && score<90) 
			//앞에 if문에서 처리되고 내려오니깐 조건에 부분 생략가능
			if(score>=88 ) {
				opt ='+';
			} else if (score < 84) {
				opt ='-';
			}
		} else if (score >= 70){ //70점 이상이면 C학점
			grade = 'C';         //(70<=score && score<80) 
			if(score>=78 ) {
				opt ='+';
			} else if (score < 74) {
				opt ='-';
			}
		} else {                 //나머지 D학점
			grade ='D';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n",grade,opt);		
	}


}
