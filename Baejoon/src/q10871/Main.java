package q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int inp = sc.nextInt();
			a[i] = inp;
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
		sc.close();

	}
}
