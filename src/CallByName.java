import java.util.Scanner;

public class CallByName {

	public static void main(String[] args) {

		int a = CallByName.prt1(); // 메소드의 변수 정의
		String op = CallByName.prt3();
		int b = CallByName.prt2();

		switch (op) {
		case "+":
			System.out.println(a + "" + op + "" + b + "=" + (a + b));
			break;
		case "-":
			System.out.println(a + "" + op + "" + b + "=" + (a - b));
			break;
		case "*":
			System.out.println(a + "" + op + "" + b + "=" + (a * b));
			break;
		case "/":
			System.out.println(a + "" + op + "" + b + "=" + ((double) a / b));
			break;
		default:
			System.out.println("잘못된 입력");
		}

	}

	public static int prt1() { // 첫번째 수 입력 static method 생성
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		int num1 = sc.nextInt();

		return num1;

	}

	public static int prt2() { // 두번째 수 입력 static method 생성
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("두번째 숫자를 입력해주세요");
		int num2 = sc.nextInt();

		return num2;
	}

	public static String prt3() { // 연산자 입력 static method 생성
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("연산자를 입력해주세요");
		String op = sc.next();

		return op;
	}
}
		 
		
		
		
		
		
		
		
		
		
		
		/*		CallByName.disp2();
		
		CallByName cbn = new CallByName();
		
		cbn.disp1();
		cbn.disp2();
		
		int num = 100;
		
		num = cbn.disp3(num); // num = 이라고 =이 있어야 num++ 적용
		System.out.println(num);
		
		String str = new String("Superman");
		System.out.println(str);
		// TODO Auto-generated method stub
		cbn.disp4(str);              //stack str     string " superman"   

	}
	public void disp4(String s) {   // stack s ---> string "superman"
		System.out.println(s);
	}
	public int disp3(int num) {
		System.out.println(num);
		num++;
		System.out.println(num);
		
		return num;
	}
		
	public void disp1() {
		System.out.println("call by name 1");
	
	}
	public static void disp2() {
		System.out.println("call by name 2");
	}*/


