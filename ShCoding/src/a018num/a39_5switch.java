package a018num;

public class a39_5switch {
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 39번 강의, 조건문5: switch~case문.");
		System.out.println("주 제어문에는"
				+ "\n조건문 if, "
				+ "\n  if ~ else,"
				+ "\n  if ~ else if ~ else"
				+ "\n스위치 switch ~ case문"
				+ "\n반복문 for,"
				+ "\n  while,"
				+ "\n  do ~ while 이 있다. 이 클래스는 스위치~케이스."
				+ "\n\n"
				+ "switch문은 사용할 수 있는 데이터타입이 제한된다. "
				+ "\n랩퍼wrapper클래스인 \n"
				+ "	byte, short, char, int, enum, \n"
				+ "	String, Character, Byte, Short, Integer만 사용.");
		
		System.out.println("\n"
				+ "switch(1)");
		switch(1) {
		case 1 :
			System.out.println("	switch(1)이라고 설정했기 때문에 case1,2,3중 case1 이하가 모두 출력되었다.");
		case 2 :
			System.out.println("	switch(2)이라고 설정했기 때문에 case1,2,3중 case2 이하가 모두 출력되었다.");
		case 3 :
			System.out.println("	switch(3)이라고 설정했기 때문에 case1,2,3중 case3 이하가 모두 출력되었다.");
		}
		
		
		System.out.println("\n"
				+ "case n 이하의 출력 없이 하나의 케이스만 출력하고 싶다면 break;를 입력하자");
		switch(2) {
		case 1 :
			System.out.println("	switch(1)이라고 설정했기 때문에 case1,2,3중 case1 출력");
			break;
		case 2 :
			System.out.println("	switch(2)이라고 설정했기 때문에 case1,2,3중 case2 출력");
			break;
		case 3 :
			System.out.println("	switch(3)이라고 설정했기 때문에 case1,2,3중 case3 출력.");
			break;
		}
		
		
		System.out.println("\n\n"
				+ "위 스위치문을 이번엔 변수integer를 이용해 if조건문으로 바꿔보기.");
		int vv = 1;
		if(vv == 1) {
			System.out.println("하나");
		} else if (vv == 2) {
			System.out.println("둘");
		} else if (vv == 3) {
			System.out.println("셋 끝입니다.");
		}

		
		System.out.println("\n\n"
				+ "스위치 케이스 브레이크에 디폴트를 추가하면 어떻게 되는지 보기");
		switch(5) {
		default:
			System.out.println("	DEFAULT출력됨 : 기본값default는 스위치문 안에만 들어간다면"
					+ "\n		케이스 맨 위든 아래든, 어디에 들어가도 상관x "
					+ "\n		단, 맨 위에 넣는다면 여느 케이스와 같이 break를 붙여줘야 함.");
			break;
		case 1 :
			System.out.println("	switch(1)이라고 설정했기 때문에 case1,2,3중 case1 출력");
			break;
		case 2 :
			System.out.println("	switch(2)이라고 설정했기 때문에 case1,2,3중 case2 출력");
			break;
		case 3 :
			System.out.println("	switch(3)이라고 설정했기 때문에 case1,2,3중 case3 출력.");
			break;
		}
		
		
		

	}

}
