package a018num;

public class a51_array5for_reach {
	
public static void main(String[] args) {

		
		
		
		System.out.println("22 0705 화요일"
				+ "\n생활코딩 52번: 배열5/6, for ~ reach");
//죽겠구
		
		String[] members = { "골뎅이", "랩독", "코기", "믹스" };
		for (String e : members) {
			System.out.println(e+" 산책 다녀왔습니다.");
		}
		
		System.out.println("\n - - - - - -\n");
		
		for (int a = 0; a<members.length; a++) {
			String o=members[a];
			System.out.println(o+" 산책 다녀왔습니다.");
		}
		
		
		
		

	}

}
