package a018num;

import java.util.Scanner; // 이거 안넣어주면 안 돌아간다. 꼭넣어<<<<<<<<<<<<

public class z_coins {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//[5-6]
		// 큰 금액의 동전을 우선적으로 거슬러 줘야 함.
		int [] coinUnit = {500, 100, 50, 10};
		
		System.out.println("가진 돈을 입력하세요=>");
		
		int money = sc.nextInt();
		System.out.println(money + "원");
		
		for(int i=0; i < coinUnit.length; i++) {
			int soo = money/coinUnit[i];
			System.out.println(coinUnit[i]+"원: "+soo);
			money = money%coinUnit[i];
		}
		
		
		
		
		
	}

}
