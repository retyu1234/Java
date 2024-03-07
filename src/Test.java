import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("학생 수:");
		int n = sc.nextInt();
		String[] name = new String[n];
		int[][] score = new int[n][4];
		float[] avg = new float[n];
		
		String [] scrName = {"name","kor","eng","mat","total","Avg"};

		Test.fo(name, n, n, sc, score, avg,scrName);
		Test.prt(name, n, n, score, avg);

		/*
		 * for (int i = 0; i < name.length; i++) { System.out.print("이름:"); name[i] =
		 * sc.next(); for (int j = 0; j < 3; j++) { System.out.print("점수:"); score[i][j]
		 * = sc.nextInt();
		 * 
		 * score[i][3] += score[i][j]; avg[i] = score[i][3] / 3.f;
		 * 
		 * }
		 */

		/*
		 * } for (int i = 0; i < name.length; i++) { System.out.print(name[i] + "\t");
		 * for (int j = 0; j < 4; j++) { System.out.print(score[i][j] + "\t"); }
		 * System.out.print(avg[i] + "\t"); }
		 */

	}

	public static int stu(Scanner sc) {
		int num = sc.nextInt();
		return num;
	}

	public static void fo(String[] name, int i, int j, Scanner sc, int score[][], float avg[],String scoName[]) {
		for (i = 0; i < name.length; i++) {
			System.out.print(scoName[0]+"입력:");
			name[i] = sc.next();
			for (j = 0; j < 3; j++) {
				System.out.print(scoName[j+1]+"입력:");
				score[i][j] = sc.nextInt();

				score[i][3] += score[i][j];
				avg[i] = score[i][3] / 3.f;
			}
		}
	}

	public static void prt(String name[], int i, int j, int score[][], float avg[]) {
		for (i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(avg[i] + "\t");
		}

	}

}


