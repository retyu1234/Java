import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in); // System.in : 내키보드를 인식하겠다

		int num1, num2;
		char ch;
		char ans = 'n';
		double result = 0;
		Method calc = new Method();

		do {
			// 입력함수 호출
			num1 = calc. inputInt(sc);     
			ch = calc.inputChar(sc);
			num2 = calc. inputInt(sc);
			// 연산함수 호출
			switch (ch) {
			case '+':
				result = calc.add(num1, num2);
				break;
			case '-':
				result = calc.sub(num1, num2);
				break;
			case '*':
				result = calc.mul(num1, num2);
				break;
			case '/':
				result = calc.div(num1, num2);
				break;
			}
			// 출혁함수 호출
			calc.disp(num1, ch, num2, result);

			System.out.println("계속 : (Y,y)");
			ans = calc.inputChar(sc);
		} while (ans == 'y' || ans == 'Y');
	}

	public void disp(int num1, char ch, int num2, double result) {
		System.out.println(num1 + "" + ch + "" + num2 + "=" + result);

	}

	public int inputInt(Scanner sc) {
		int num = sc.nextInt();
		return num;
	}

	public char inputChar(Scanner sc) {
		char ch = sc.next().charAt(0);
		return ch;

	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public double div(double num1, double num2) {
		return num1 / num2;
	}

}

