package edu.kh.test.testProject;
      //package(관련된 코드들의 묶음) 명명 규칙 
      //최소 3 레벨 이상 (웹개발의 경우)
      //프로젝트 주소의 기반 (거꾸로)

public class HelloWorld {
	
	public static void main (String[] args) {
		// 실행 구문 (메인 메소드가 있어야 프로젝트 실행 가능)
		System.out.println("Hello World!");
		System.out.println("안녕하세요~@");
		System.out.println("123123"); 
		
		// " " = 문자열을 나타냄
		// "" => 안에 작성된 텍스트(코드)는 단순 문자열로 인식 
	
		System.out.println("1+2"); 
		// 단순 문자열로 인식되어 1+2 그대로 출력
		System.out.println(1+2);
		// 이는 수로 인식하여 연산을 한다, 사칙연산을 인식한다
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식한다
		
		System.out.println("14 * 19 =" + 266);
		//숫자와 숫자끼리의 덧셈은 실제 덧셈 연산결과
        //문자열과 숫자 혹은 문자열과 문자열의 덧셈은 이어쓰기로 인식
		System.out.println("14 * 19 =" + 14 * 19);
		
		//자바는 사칙연산 우선순위를 그대로 따른다. 우선계산을 원하면 ()사용
		
		System.out.println("깃허브 감시 확인");
	}
}