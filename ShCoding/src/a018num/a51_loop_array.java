package a018num;

public class a51_loop_array {
	
public static void main(String[] args) {

		
		
		
		System.out.println("22 0705 화요일"
				+ "\n생활코딩 51번: 반복문과 배열의 조화");

		
		
		String[] members = { "골뎅이", "랩독", "코기", "믹스" }; // 데이터타입:문자열 원소를 가진 배열을 변수 members에 담았다.
		for (int dog = 0; dog<members.length; dog++) { //반복문 for 시작 (변수 dog 초기화; 변수dog는 members배열의 원소 총개수보다 작음; 변수 dog+1을 종료조건까지 반복실행해라)
			String member = members[dog]; // String[]가 아니라 String이다 ==> 배열이 아닌 문자열 선언임을 알 수 있음
			System.out.println(member+" 산책 갔다 왔습니다.");
		}
		
		
		/*
		 * 연습으로
		 * 
		 * 치즈태비도 밥 줬습니다.
		 * 고등어태비도 밥 줬습니다.
		 * 카오스도 밥 줬습니다.
		 * 까치고양이도 밥 줬습니다.
		 * 턱시도도 밥 줬습니다.
		 * 
		 * 이렇게 출력되도록 해보자
		 */
		System.out.println("\nㅡㅡㅡㅡㅡ\n");
		
		String[] cats = { "치즈태비", "고등어태비", "카오스", "까치고양이", "턱시도" };
		for (int i=0; i<cats.length; i++) {
			String n=cats[i];
			System.out.println(n+"도 밥 줬습니다.");
		}
		
		
		/*
		 * 연습으로
		 * 
		 * 야식 메뉴로 떡볶이가 어떨까요?
		 * 야식 메뉴로 치킨가 어떨까요?
		 * 야식 메뉴로 족발과 비빔국수가 어떨까요?
		 * 
		 * 이렇게 출력되도록 해보자
		 */
		System.out.println("\nㅡㅡㅡㅡㅡ\n");		
		
		String[] menu= { "떡볶이", "치킨", "족발과 비빔국수" };
		for (int soo=0; soo<menu.length; soo++) {
			String menuNumber = menu[soo];
			System.out.println("야식 메뉴로"+menuNumber+"가 어떨까요?");
		}
		
		
		/*
		 * 연습으로
		 * 
		 * 제1인의아해가도로로질주하오
		 * 제2인의아해가도로로질주하오
		 * ...
		 * 제13인의아해가도로로질주하오
		 * 
		 * 이렇게 출력되도록 해보자
		 */
		System.out.println("\nㅡㅡㅡㅡㅡ\n");
		
		for (int i=1; i<14; i++) {
			System.out.println("제"+i+"인의아해가도로로질주하오");
		}
		
		
		/*
		 * 봉래시장에서 복숭아를 샀습니다.
		 * 봉래시장에서 두부를 샀습니다.
		 * 봉래시장에서 세제를 샀습니다.
		 * 봉래시장에서 과자를 샀습니다.
		 * 봉래시장에서 맥주를 샀습니다.
		 * 
		 * 이렇게 출력되도록 햅좌
		 */
		System.out.println("\nㅡㅡㅡㅡㅡ\n");
		
		String[] prdt = {"복숭아", "두부", "세제", "과자", "맥주"};
		for (int i=0; i<prdt.length; i++) {
			String ii=prdt[i];
			System.out.println("봉래시장에서 "
					+ii
					+ "를 샀습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
