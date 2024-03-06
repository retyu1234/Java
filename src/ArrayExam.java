/*		
		 * for(int i = 0; i<arr.length;i++) {
		 *  //지역변수지만 배열 선언시 0으로 자동 초기화라 초기화 따로 안해도 생략되어 0으로 초기화
		 *  System.out.println(arr[i]); }
		 

		for (int i : arr) {   // arr은 최초 위치 뿐아니라 전체 크기까지 알고 있음

			System.out.println(i);*/
import java.util.Scanner;
public class ArrayExam {

	public static void main(String[] args) { 
		
/*
 * 한사람의 성적처리 프로그램
 * 입력 : 이름, 국, 영, 수
 * 연산 : 총점, 평균
 * 출력 : 이름 , 국 ,영, 수, 총, 평	
 *
 */
		String name;
		int score[] = new int[4]; // 국영수총
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		//입력 : 이름, 국, 영, 수
		
		
		int sum = 0;
		System.out.print("이름:");

		name = sc.next();
		
	
		for (int i = 0; i < score.length - 1; i++) {
			System.out.print("점수:");

			int kScore = sc.nextInt();
			score[i] = kScore;
			sum += score[i];
		}
		System.out.print(name + "\t");
		for (int i = 0; i < score.length - 1; i++) {
			// 지역변수지만 배열 선언시 0으로 자동 초기화라 초기화 따로 안해도 생략되어 0으로 초기화
			System.out.print(score[i]+ "\t");
		}
		avg = sum / 3.f;
		
		System.out.print(sum + "\t");
		System.out.print(avg + "\t");
				
		//입력 : 이름, 국, 영, 수
		/*
		 * System.out.print("이름:"); name = sc.next(); 
		 * for(int i=0;i<3;i++) {
		 * System.out.print("점수:"); score[i] = sc.nextInt();
		 * 
		 * score[3] += score [i]; } avg = score[3]/3.f; //연산
		 * 
		 * //출력 System.out.print(name+"\t"); for(int sco:score) {
		 * System.out.print(sco+"\t"); } System.out.println(avg);
		 */
		}
		

}
