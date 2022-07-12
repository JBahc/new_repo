package a018num;

public class a23_variable {
	
	public static void main(String[] args) {
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 23번 강의, 변수4/4 변수의 효용성\n\n");
		System.out.println(100+10);
		System.out.println((100 + 10) / 10);
		System.out.println(((100+10) / 10) - 10);
		System.out.println((((100+10) / 10) - 10) * 10);
		
		System.out.println("\n");
		
		int a=100+10;
		System.out.println(a);
		System.out.println(a/10);
		int b=a/10;
		System.out.println(b-10);
		int c=b/10;
		System.out.println(c*10);
		
		System.out.println("이런 식으로, 변경될 가능성이 높은 것들 위주로 변수를 잘 활용하면 \"중복\"을 제거할 수 있다."
				+ "\n중복을 제거하면 막대한 코드의 가독성이 좋아지고 "
				+ "\n유지보수의 용이성이 좋아져 버그가 발생할 가능성이 낮아진다.");
		

	}

}
