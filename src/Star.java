import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		
		int tr = scn(sc);    //입력

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= i; j--) { // 공백찍기
			if(i<=5/2) {
				if(i<j-5/2) {
					System.out.println("*");
					
				}else
					System.out.println("1");
			}prt("*");
			if(i>5/2) {
				if(i>j-5/2) {
				System.out.println("*");
				
			}else
				System.out.println("1");
			}
			prtln(); // 줄바꾸기
		}
		}


	}

	public static void prtln() { // 줄바꾸기 함수
		System.out.println();
	}

	public static String prt(String a) { // print 문자열함수
		System.out.print(a);
		return a;
	}
	public static int scn(Scanner sc){      //int 입력함수(별크기 입력용)
		int num=sc.nextInt();
		return num;
		
	}

}
