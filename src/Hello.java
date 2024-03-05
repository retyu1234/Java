/* java 100% 상속구조
 * java 100% 객체지향언어 -> 무조건 객체사용 -> class
 * 
 * 시작과 끝을 담당하는 함수 => main 함수
 * 함수 => function => method (비슷한 의미)
 */
//import java.lang.*; 이 처음에 생략되어서 import 되어있음(String...)
import java.util.Scanner;

public class Hello {

	public static void main(String []args) { //프로그램을 시작해주고 끝내줌
		//datatype 변수명;
		//변수명 = 값; == 초기화 (=은 대입 == 같다)
		//변수 - 지역변수 : local variable method 안에 선언되어지는 변수
		             // : 지역변수는 항상 초기화를 해야한다
       Scanner sc;
       sc = new Scanner(System.in); //System.in : 내키보드를 인식하겠다
	
       System.out.println("홀수입력 :"); 
       int num = sc.nextInt();
        
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i <= num / 2) {
					if (i + j <= num / 2 - 1) {
						System.out.print(" ");

					} else if (j - i >= num / 2 + 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				} else if (i > num / 2) {
					if (i-j >= num / 2 + 1) {
						System.out.print(" ");
					} else if (i + j >= num / 2 * 3 + 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				}

			}System.out.println();
		}

	}

}
		

		/*
		 * for(int i=0;i<10;i++) {
		 * 
		 * }
		 */
		/*
		 * int i = 0; while(i<10) { System.out.println(); i++; }
		 */
       
       
		/*
		 * for (int a = 1; a <= 9; a++) { for (int b = 2; b <= 9; b++) {
		 * System.out.print(b + "*" + a + "=" + (a * b) + "\t"); } System.out.println();
		 * }
		 */



/*		int a = 1;
		while (a < 10) {
			int b = 2;
			while (b < 10) {
				System.out.print(b + "*" + a + "=" + (a * b) + "\t");
				b++;
			}
			System.out.println();
			a++;
		}

	}*/


       
       
       
       
       
       
       
       
       
       
       
       
       /*
	 * 사칙연산계산기( +,-,*,/)
	 * 
	 * 3 + 4
	 * 
	 * 3 + 4 = 7
	 * 
	 */
/*	int num1 = sc.nextInt();
	String op = sc.next();
	int num2 = sc.nextInt();
	if (op.equals("+")) {
		System.out.println(num1 + "" + op + "" + num2 + "=" + (num1 + num2));
	} else if (op.equals("-")) {
		System.out.println(num1 + "" + op + "" + num2 + "=" + (num1 - num2));
	} else if (op.equals("*")) {
		System.out.println(num1 + "" + op + "" + num2 + "=" + (num1 * num2));
	} else if (op.equals("/")) {
		System.out.println(num1 + "" + op + "" + num2 + "=" + ((double) num1 / num2));
	} else
		System.out.println("잘못된 입력");
}
     */
     
		/*
		 * switch(op) { case"+": System.out.println(num1+""+op+""+num2+"="+(num1+num2));
		 * break; case"-": System.out.println(num1+""+op+""+num2+"="+(num1-num2));
		 * break; case"*": System.out.println(num1+""+op+""+num2+"="+(num1*num2));
		 * break; case"/":
		 * System.out.println(num1+""+op+""+num2+"="+(double)num1/num2)); break; default
		 * : System.out.println("잘못된 입력");
		 */
     
       
       
       /*
	 * System.out.println("첫번째 숫자를 입력하세요"); int a = sc.nextInt();
	 * System.out.println("두번째 숫자를 입력하세요"); int b = sc.nextInt();
	 * System.out.println("연산자를 입력하세요"); String c = sc.next(); switch(c) { case "+":
	 * System.out.println(a+b); break; case "-": System.out.println(a-b); break;
	 * case"*": System.out.println(a*b); break; case"/": System.out.println(a/b);
	 * default: System.out.println("잘못된 입력"); };
	 */
    	
      
       
     /*  int a = sc.nextInt();
       int b = sc.nextInt();
       
       if(a>b) {
    	   System.out.println(a);
       }else if(a<b) {
    	   System.out.println(b);
       }else System.out.println("같다");*/
       
   /*    String str = sc.next();
       int num = sc.nextInt();
       
       System.out.println(str);
       System.out.println(num);
       
       num = 10;
       System.out.println(num);
       int num = 10;
       if(num>3) {
    	   System.out.println("Hello");
    	   
       }System.out.println("bye");*/
       
       
/*		int num;
		num = 10; 
	
		char ch = 'A'; //"" 문자열 ''문자
	System.out.println(ch);
	System.out.println((int)ch);
	System.out.println(num);
	
     int a=3;
    System.out.println(a<<5);
    
    int i=5;
    ++i;
    System.out.println(i);
    
    i=5;
    int j=i++;
    System.out.println(j);
    
    i=5;
    j=0;
    j=i++;
 
    System.out.println("j=i++; 실행후, i=" + i +",j="+j);
    
    i=5;
    j=5;
    System.out.println(i++);
    System.out.println(++j);
    System.out.println("i="+i +",j="+j);
    i = -10;
    i = +i;
    System.out.println(i);
    i = -i;
    System.out.println(i);
    	
    a = 10;
    int b = 4;
    System.out.printf("%d + %d =%d%n", a, b, a+b);
    System.out.printf("%d - %d =%d%n", a, b, a-b);
    System.out.printf("%d * %d =%d%n", a, b, a*b);
    System.out.printf("%d / %d =%d%n", a, b, a/b);
    System.out.printf("%d / %f =%f%n", a, (float)b, a/(float)b);
    
    byte d = 10;
    byte e = 20;
    byte c = (byte)(d+e);
    System.out.println(c);
   
   long ab=1000000 *1000000;
   long bc=1000000 *1000000L;
   System.out.println(ab);
   System.out.println(bc);
   
   a=1000000;
   int result1 = a*a/a;
   int result2 = a/a*a;
   System.out.printf("%d*%d/%d=%d%n",a,a,a,result1);
   System.out.printf("%d/%d*%d=%d%n",a,a,a,result2);
   
   
   System.out.println("Hello");
   System.out.println(333);
   System.out.print("Hello");
   System.out.print(333);
   
   
   System.out.print("Hello\n");
   System.out.print(333);*/
   
   
   

    
  /*  
	Hello hello; //hello는 레퍼런스 변수
	hello = new Hello(); // 객체 생성
*/



