package a018num;

public class a50_array3 {
	
	public static void main(String[] args) {

		
		
		
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 50번: 배열 3/6-제어");
		System.out.println("드디어 2주차 시작\n");
		
		
		/*
		 * 아래 예제를 통해
		 * 배열을 정의하는 또다른 방법,
		 * 배열에 담긴 데이터의 개수를 확인하는 법 이 두가지가 목표
		 */
		
		
		//String[] classGroup = { "김동동", "최사과", "박배", "송자두", "원소element" };
		String[] classGroup = new String[5]; //최대 100개까지만 가능하며 그 이상의 배열은 나중에...
		classGroup[0] = "김동동";
		System.out.println(classGroup.length);
		classGroup[1] = "최사과";
		System.out.println(classGroup.length);
		classGroup[2] = "박배";
		System.out.println(classGroup.length);
		classGroup[3] = "송자두";
		System.out.println(classGroup.length);
		classGroup[4] = "원소";
		System.out.println(classGroup.length);
		
		
		
		
		
		
		
		
	}

}
