package a018num;

public class a43_loop1while {
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 43번: 반복문1/5: \"while\"");
		System.out.println("1주차 강의 내용...\n"
				+ "\n자바 제어문 -주 제어문"
				+ "\n		주제어1)  if문,  if~else문,  if~else if~else문"
				+ "\n		주제어2)  switch~case문"
				+ "\n		반복문3)  for,  while,  do~while."
				+ "\n	 -보조제어문"
				+ "\n		보조제어1)  break문"
				+ "\n		보조제어2)  continue문");
		
		/*
		 * while(조건){
		 * 		반복적으로 실행되는 영역 (제한 안 두면 무한반복함)
		 * } 
		 * 
		 * 이렇게 입력하면, while(조건)안의 조건은 ""조건"이 true일 경우, 언제까지 (반복할 것이냐)"에 대한 내용.
		 * 
		 */
		System.out.println("\n\n");
		int vv = 0; 
		//변수 vv의 기본값을 0으로 설정해놓고 시작
		//vv의 값이 8보다 작다면 true, 크거나 같다면 false 진행되도록 while을 작성할것임
		while (vv < 8) {
			System.out.println("talk to me, goose."+ vv);
			//이렇게만 해두면 +0이 되어서 무한히 반복하니까 뒤에 vv++를 달아주자
			vv++;
		}
		
		
		

	}

}
