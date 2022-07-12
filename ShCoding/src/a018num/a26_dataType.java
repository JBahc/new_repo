package a018num;

public class a26_dataType {
	
	public static void main(String[] args) {
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 26번 강의, 데이터타입 비교\n\n");
		
		System.out.println("숫자는 정수와 실수로 나뉘고,"
				+ "\n	정수의 데이터타입은 byte, short, int, long으로 나뉘고"
				+ "\n	실수의 데이터타입은 float, double로 나뉜다.");
		
		System.out.println("\n정수의 데이터타입"
				+ "\n	byte는 1byte로, 표현 가능 범위는 ~127."
				+ "\n	short는 2byte로, 표현 가능 범위는 ~32,767."
				+ "\n	int는 4byte로, 표현 가능 범위는 ~2,147,4nn,nnn."
				+ "\n	long은 8byte로, 표현 가능 범위는 ~9,nnn,nnn,nnn,nnn,nnn,nnn."
				+ "\n어떤 데이터타입을 쓰냐에 따라 소모되는 RAM 크기가 바뀐다.");
		
		System.out.println("\n실수의 데이터타입"
				+ "\n	float는 4byte,"
				+ "\n	double은 8byte이다.");
		
		System.out.println("\n문자의 데이터타입"
				+ "char는 2byte이다. 만약 AB를 출력한다면 4byte가 사용되는 것이다.");

	}


}
