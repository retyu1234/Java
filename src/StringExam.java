
public class StringExam {

	public static void main(String[] args) {
		
		String str = new String("Super");      // new ---- str str1 위치가 다름
		String str1 = new String("Super");
		System.out.println(str);
		System.out.println(str1); 
		
		if(str1 == str) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		if(str1.equals(str)) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
	String str3 = "bat";       // str3, str4 같은 위치 (new를 명시 안하면 해당 값이 있는지 확인 후 생성, 같은 값 있을 시 해당 위치의 값을 불러옴)
	String str4 = "bat";
	System.out.println(str3);
	System.out.println(str4); 
	
	if(str3 == str4) {
		System.out.println("same");
	}else {
		System.out.println("diff");
	}
	if(str1.equals(str)) {
		System.out.println("same");
	}else {
		System.out.println("diff");
		                                         // String class 는 값 변경 x 새로 만듦
	}
}



}
