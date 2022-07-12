package a018num;

public class a20_int {

	public static void main(String[] args) {
		System.out.println("22 0702 토요일."
				+ "\n생활코딩 20번 강의, 변수 1/4 변수.");
		System.out.println("\n\n변수Variable는 변할 수 있는 수를 말하며, "
				+ "\n더 정확히는 문자, 숫자 같은 데이터를 가리키는, 담고 있는 컨테이너이다.");
		System.out.println("int a;는 정수를 만드는 구문이며, 변수 선언이다."
				+ "\n  int는 데이터 형식인 정수integer의 줄임말로, "
				+ "\n        지금은 단순하게 숫자라고 생각해도 무관하다. 오직 숫자만을 담을 수 있다."
				+ "\n        int를 적음으로써 변수에 올 수 있는 \"데이터 타입을 강제\"한 것과 같다."
				+ "\n  a는 변수에게 임의로 지은 이름이다. b, c, g 등 무엇으로 해도 상관없다."
				+ "\n        이 a라는 변수에 숫자가 아닌 다른 형식의 데이터를 넣으면 일절 실행되지 않는다.");
		
		System.out.println("\n"+"a라는 변수integer를 설정하고 그 a를 1이라는 정수로 다시 설정해보자.");
		int a;
		a = 1;
		System.out.println("그리고 println 안에서 해당 변수에 +1, +2를 입력하면 아래와 같은 결과.");
		System.out.println(a+1); //2
		System.out.println(a+2); //3
	}
	
}
