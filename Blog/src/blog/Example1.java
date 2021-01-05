package blog;

import java.util.Scanner;

public class Example1 {
	
public static void main(String[] args) {
	
	String q = "보기중에서 좋아하는 과일을 적으시오.\n"
			+ "포도\n"
			+ "사과\n"
			+ "복숭아\n"
			+ "배\n(종료하려면 x입력)";
	Scanner sc = new Scanner(System.in); 
	String choice = ""; // 변수 초기화
	 
	System.out.println(q); // 질문 출력
	choice = sc.next(); // nextInt(); 를 사용하면 문자를 받을 수 없다.
	
			switch(choice)
			{
			case "포도" : System.out.println("포도를 선택하였습니다."); break;
			case "사과" : System.out.println("사과를 선택하였습니다."); break;
			case "복숭아" : System.out.println("복숭아를 선택하였습니다."); break;
			case "배" : System.out.println("배를 선택하였습니다."); break; // 기타연산자 break
			default : System.out.println("잘못 입력하였습니다."); 						
			}
	}
}