package a018num;

public class a48_array {
	
	public static void main(String[] args) {

		
		
		
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 48번: 배열");
		System.out.println("드디어 2주차 시작\n");
			
		//문자열로 구성된 배열이라고 정의함 ==> 이것을 classGroup이라는 변수에 담음 ==> 이 classGroup이라는 변수에 담긴 배열은 String[]이라는 부분을 통해서 문자열데이터타입String의 모임[]이다, 라는걸 확인 가능
							// 배열을 선언할 때는 소괄호가 아니라 중괄호로. 값과 값은 ,로 구분.
		String[] classGroup = { "김동동", "최사과", "박배", "송자두", "원소element", "대괄호 안의 것은 인덱스" };
		
		
		//배열의 제어
									//[0]에서 저 대괄호 안에 있는 0을 index색인이라고 부름
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[0]+", "+classGroup[3]);
		System.out.println(classGroup[4]+"\n\n");
		
		
		/*
		 * 배열을 정의하는 또다른 방법,
		 * 배열에 담긴 데이터의 개수를 확인하는 법 이 두가지 목적으로 아래 시작.
		 */
		
		String[] NclassGroup = new String[4]; // new String[4]는 원소들의 데이터타입이 문자열인 배열을 선언했는데 그 원소 개수는 총 4개라는 뜻. 그리고 그 배열을 변수 NclassGroup에 넣었다.
		NclassGroup[0] = "김동동";
		System.out.println(NclassGroup.length);
		NclassGroup[1] = "최사과";
		System.out.println(NclassGroup.length);
		NclassGroup[2] = "박배";
		System.out.println(NclassGroup.length);
		NclassGroup[3] = "송자두";
		System.out.println(NclassGroup.length);
		
		
		
		
		
		
		
		

	}

}
