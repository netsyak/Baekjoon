package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i <= arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int i = 0;
		int j = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < (arr.length); j++) {
				sum += arr[j];
				int a=i;
				int b=j;
				if (sum - arr[a] - arr[b] == 100) {
				}
				System.out.println(arr[j]);
			}
			break;
		}
		sc.close();
	}
}
