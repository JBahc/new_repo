package a018num;

public class a24_comment_semicolon {
	
	public static void main(String[] args) {
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 24번 강의, 주석과 세미콜론\n\n");
		
		System.out.println("주석comment은 로직에 대한 설명이나 코드를 비활성화 할 필요가 있을 때 사용하며, "
				+ "\n	프로그래밍적으로 해석되지 않는다. "
				+ "\n	크게 세 가지가 있다:"
				+ "\n		1. 한 줄 주석, "
				+ "\n		2. 여러 줄 주석, "
				+ "\n		3. JavaDoc주석");
		
		// 두개의 변수가 같은 데이터 타입 일 때 아래와 같이 코드를 작성한다.
		System.out.println("\n1. 한 줄 주석:"
				+ "\n	//를 주석 앞에 붙인다.");
		
		/*
		https://opentutorials.org/module/516/6714
	    a = "coding";
	    b = "everybody";
	    System.out.println(a+b);
	    */
		System.out.println("\n2. 여러 줄 주석"
				+ "\n	/*로 시작하여 주석 끝을 /*로 마무리한다.");
		
		/**
		 * Prints an integer and then terminate the line.  This method behaves as
		 * though it invokes <code>{@link #print(int)}</code> and then
		 * <code>{@link #println()}</code>.
		 *
		 * @param x  The <code>int</code> to be printed.
		 */
		System.out.println("\n3. JavaDoc 주석"
				+ "\n	자바의 api문서를 만드는 규약이 있는데, 그러한 문서를 만들 때 사용한다."
				+ "\n	/**로 시작하고,"
				+ "\n	각 주석 앞에 * 를 붙인다."
				+ "\n	주석 마무리는 */로 끝낸다."
				+ "\n	JavaDoc주석을 작성하면 자바가 그 내용을 해석해 아래 코드에 대한 문서를 작성해준다.");
		
		//public void println()에서 println을 메소드라고 부른다.
		
		System.out.println("\n\n세미콜론은 문장statement의 끝을 의미한다."
				+ "\n우리가 출력하고 싶은 따옴표 안의 문장은 정확히는 \"표현식\"이라고 부른다. 이 끝에는 세미콜론을 넣을 필요가 없다."
				+ "\n여러개의 문장 혹은 블록을 안고 있는 {} 뒤에는 세미콜론을 붙이지 않아도 된다.");

		
	}

}
