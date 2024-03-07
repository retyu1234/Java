/*
 * 구성요소
 * 1.field
 * 2.constructor
 * 3.method
 */
public class ClassFo {
	
	private int a;
	private char s;
	private float c;

	public static void main(String[] args) {
		ClassFo cf = new ClassFo();    // 이시기에 생성자함수 자동호출
		cf.output(1.2);
		cf.output(11);
		cf.output();
		cf.output(1,2);
		
	
	}
	public void output(int a) {
		System.out.println("a");
	}
	public void output() {
		System.out.println("aming");
	}
	public void output(int a, int b) {
		System.out.println("a,b");
	}
	public void output(double a) {
		System.out.println("b");
	}
}
