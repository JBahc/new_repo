package a018num;

public class a47_loop3if_else {
	
	public static void main(String[] args) {

		
		
		
		System.out.println("22 0703 일요일"
				+ "\n생활코딩 47번: 반복문의 중첩");
		System.out.println("1주차 강의 내용...\n"
				+ "\n자바 제어문 -주 제어문"
				+ "\n		주제어1)  if문,  if~else문,  if~else if~else문"
				+ "\n		주제어2)  switch~case문"
				+ "\n		반복문3)  for,  while,  do~while."
				+ "\n	 -보조제어문"
				+ "\n		보조제어1)  break문"
				+ "\n		보조제어2)  continue문\n\n");
		
		
		//if 안에 for가 있거나,
		//for문 안에 또 for문이 있거나.
		
		//  int( 초기화; 종료조건; 반복실행 )
		for (int yy=0; yy<10; yy++) {
			for (int uu=0; uu<2; uu++) {
				System.out.println(yy + "" + uu); 
				//yy+""+uu가 아닌 yy+uu를 하면 그냥 둘을 더한 값이 출력되니까 사이에 ""을 넣어 두자리수가 되게 한다
			}
		}

		System.out.println("/n/n");
		
		for (int ii=0; ii<5; ii++) {
			for (int oo=0; oo<5; oo++) {
				if (ii<3) {	//<==이건 저 위 첫번째 for에서 ii<3으로 고치는게 맞는데 그냥 if를 함 써보고싶어서 써봄
					System.out.println(ii+""+oo);
				}
			}
		}
		
		System.out.println("\n\n");
		/*
		 * 자바 시즌1----절차지향
		 * 		변수
		 * 		조건문
		 * 		반복문
		 * 		메소드
		 * 자바 시즌2---객체지향
		 * 
		 */
		
		
		
		
		

	}

}
