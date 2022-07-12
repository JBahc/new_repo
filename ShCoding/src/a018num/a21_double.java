package a018num;

public class a21_double {
	
		public static void main(String[] args) {
			System.out.println("22 0703 일요일. "
					+ "\n생활코딩 21번 강의, 변수2/4 실수 ");
			System.out.println("정수와 실수 둘 중 실수에 관한 강의"
					+ "\n\n");
			System.out.println("정수와 실수에서 실수란?"
					+ "\n실수란 정수 사이사이에 존재하는, 소수점이 붙은 것들");
			System.out.println("\ndouble a;는 실수를 만드는 구문이다. 뒤에 오는 변수a는 오직 실수여야만 한다."
							+ "\n만약 실수가 아닌 정수와 같은 맞지 않는 데이터형식을 넣으면 "
							+ "Type missmatch 에러메세지가 뜬다. "
							+ "\n자바는 strong data type 언어이기 때문에 "
							+ "\n     지정된 데이터타입과 맞지 않으면 실행조차 되지 않으니 나중에 문제가 발생할 소지가 없다.");
		
			double a;
			a=1.1;
			System.out.println(a+2);
		}

}
