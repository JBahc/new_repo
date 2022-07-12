package a018num;

public class z_test_day05_test1 {
	
	public static void main(String[] args) {
		int[] arr[] = new int[5][5];
		int cnt=0;   // 1씩 증가시키면서 arr에 저장하되, 아래와 같이 저장하기
		int x=0, y=0;  //배열의 인덱스로 사용할 변수를 만듦
		
		
		
		for (int k=0; k<2; k++) {
		/////////////		
			for(int i=0; i<4-2*k; i++) {
				arr[x+k][y+k] = ++cnt;
				y++;
			}
			//5~8방향으로 꺾기 입력
			if(x + y == 4-2*k) {
				for (int i=0; i<4-2*k; i++) {
					arr[x+k][y+k] = ++cnt;
					x++;
				}
			}
			
			if(x==y) { //9~12
				for (int i=0; i<4-2*k; i++) {
					arr[x+k][y+k] = ++cnt;
					y--;
				}
			}
			
			if(x + y ==4-2*k) { //13~16
				for (int i=0; i<4-2*k; i++) {
					arr[x+k][y+k] = ++cnt;
					x--;
				}
			}
		/////////////
		} //k변수 사용한 for루프 닫기
		//i<4에서 i<4-2*k로 바꾸기
		//arr[x][y]를 arr[x+k][y+k]로 바꾸기
		//if(x+y==4)를 x+y==4-2*k로 바꾸기
		arr[x+2][y+2] = ++cnt; //이것도 추가
			
		
		
		System.out.println("ㅡㅡㅡㅡㅡ");
		
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}//for -----
			System.out.println();
		}//for-----------

	}

}
