package a018num;

public class a44_loop2for {
	
	public static void main(String[] args) {
	
		
		
		
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 43번: 반복문2/5: \"for\"");
		System.out.println("1주차 강의 내용...\n"
				+ "\n자바 제어문 -주 제어문"
				+ "\n		주제어1)  if문,  if~else문,  if~else if~else문"
				+ "\n		주제어2)  switch~case문"
				+ "\n		반복문3)  for,  while,  do~while."
				+ "\n	 -보조제어문"
				+ "\n		보조제어1)  break문"
				+ "\n		보조제어2)  continue문");
		
		System.out.println("\n\n");
		
		
		//for문은 while문을 문법적으로 더 간결하게 만들어주기 좋와용
		
		/*
		 * for(변수초기화; 종료조건; 반복실행){
		 * 		반복실행될 구문
		 * }
		 */
			//vv=0;은 변수 초기화.  vv<7은 변수의 종료 조건. vv++은 같이 반복되는 실행
		for (int vv = 0; vv<7; vv++) {
			System.out.println("for문은 while문에 비해 참 짧구나!" + vv);
			
			/* 위의 두 줄을 while문으로 풀면...한오백년 시작입니다
			 *  v = 0;
			 *  while(v<7){
			 *  System.out.println("while문은 정말 길구나"+v);
			 *  v++;
			 *  }
			 *  
			 *  이렇게 길어진다. for문은 심지어 while문과 달리 끝에 v++같은 제한을 안붙여줘도 됨!
			 */
			
		}
		
		System.out.println("\n\n"
				+ "강의영상45 보조제어문 break, continue\n");
		for (int i=0; i<8; i++) {
			if (i==5) {
				break;			
			}
			System.out.println("얍얍." + i);

		}
		
		System.out.println("\n\n이번엔 continue 설명");
		for (int i=0; i<9; i++) {
			if (i==6) {
				continue;
			}System.out.println("continue 연습" +i);
		}
		//결과를 보면 continue 연습6만 빼고 다 출력된걸 볼 수 있음
		//if (i==6) 명령이 맞아떨어졌을 때 그 이후의 로직 실행을 하지 않는 것이 continue이기 때문.
		//하지만 반복문 자체를 멈추는 것은 아니기 때문에 다시 반복문이 실행됨==>i=6이 아닐 때의 명령이 실행되어 출력된 것이다.
		
		
		
		
		
		
		
		

	}

}
