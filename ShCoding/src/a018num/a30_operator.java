package a018num;

public class a30_operator {
	
	public static void main(String[] args) {
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 30번 강의, 연산자operator");
		
		System.out.println("\n\n연산자operator는 특정 작업을 하기 위해 사용하는 기호를 말한다."
				+ "\n 대입 연산자: x=1과 같은. "
				+ "\n 산술 연산자: +-*/%와 같은."
				+ "\n 비교 연산자"
				+ "\n 논리 연산자: 조건문."
				+ "\n 등이 있다.");

		System.out.println("\n산술Arithmetic연산자는 수학적 계산에 사용되는 연산자다."
				+ "\n + - * / 그리고 나머지를 말하는 %가 있다.\n");
		
		System.out.println("만약 산술연산자 +를 이용해 int result=1+2;라는 변수를 작성하면");
		//result의 값은 3
		int result=1+2;
		System.out.println(result + "\n");
		
		System.out.println("이 상태에서 산술연산자 -를 이용해 int result=result-1;라는 변수를 작성하면");
		//3-1을 시켰으니 1이 출력
		result = result-1;
		System.out.println(result + "\n");
		
		System.out.println("그리고 다시 산술연산자 *를 이용해 int result=result*4;라는 변수를 작성하면");
		//2*4 시켰으니 8이 나온다.
		result= result*4;
		System.out.println(result + "\n");
		
		System.out.println("이후 또 다시, 산술연산자 %를 이용해 int result=result%3;라는 변수를 작성하면");
		//8/3의 나머지값을 물었으니 2가 나온다.
		result = result%3;
		System.out.println(result);
		System.out.println("\n\n");
		
		
		int a=3;
		System.out.println(0%a);
		System.out.println(1%a);
		System.out.println(2%a);
		System.out.println(3%a);
		System.out.println(4%a);
		System.out.println(5%a);
		System.out.println(6%a);
		System.out.println(7%a);
		System.out.println(8%a);
		System.out.println(9%a);
		System.out.println(10%a);
		System.out.println(11%a);
		System.out.println("이렇게 %를 잘 사용하면 순환하는 값을 만들 수 있다. 이것은 나중에 요긴하게 쓰인다.");
		
		System.out.println("\n+는 숫자와 숫자를 더할 때도 사용되지만, "
				+ "\n 문자열과 문자열을 결합할 때도 사용한다.");
		String firstString = "this is ";
		String secontString = "a concatenated string. ";
		String thirdString = firstString+secontString;
		System.out.println(thirdString);
		
		//맥도날드...춥다... 첫차 빨리...
		
		
		
		
	}

}
