package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
// 위 for 는 행
// 안 for 는 열		

		/*
		 * for (int i = 0; i < s; i++) 
		 * { for (int j = 0; j <= i; j++) {
		 * System.out.print("*"); 
		 * } System.out.println(); 
		 * }
		 *  } 
		 */

		
		for (int i = 0; i < s; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}