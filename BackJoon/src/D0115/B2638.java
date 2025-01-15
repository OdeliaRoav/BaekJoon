package D0115;

import java.util.Scanner;

public class B2638 {
	static int h, w;
	static int[][] ar, visited;

	public static void printArr() {
		System.out.println("--- Arr ------------------");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printVisited() {
		System.out.println("--- Visited ------------------");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(visited[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean checkCheese() {
		boolean isCheese = false;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == 1) {
					isCheese = true;
				}
			}
		}

		return isCheese;
	}

	public static void r(int ph, int pw) {
		visited[ph][pw] = 1;
		// 탈출 조건
		if (ar[ph][pw] == 1) {
			ar[ph][pw] = 2;
			return;
		}

		// recursive

		// UP
		if (ph >= 1 && visited[ph - 1][pw] == 0)
			r(ph - 1, pw);

		// DOWN
		if (ph < h - 1 && visited[ph + 1][pw] == 0)
			r(ph + 1, pw);

		// LEFT
		if (pw >= 1 && visited[ph][pw - 1] == 0)
			r(ph, pw - 1);

		// RIGHT
		if (pw < w - 1 && visited[ph][pw + 1] == 0)
			r(ph, pw + 1);
	}

	public static void initVisited() {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				visited[i][j] = 0;
			}
		}
	}

	public static void meltingCheese() {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == 2) {
					ar[i][j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		ar = new int[h][w];
		visited = new int[h][w];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int time = 0;
		int cCheese = 0;
		do {
			time++;
			initVisited();

//			printArr();
//			printVisited();

			cCheese = countingCheese();
			r(0, 0);
			meltingCheese();
			
//			printArr();
//			printVisited();

		} while (checkCheese());
		System.out.println(time);
		System.out.println(cCheese);
	}

	private static int countingCheese() {
		int c = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == 1) {
					c++;
				}
			}
		}
		return c;
	}
}