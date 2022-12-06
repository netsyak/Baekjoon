package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();

		for (int i = 1; i <= s; i++) {
			// ' '(공백에 대한) 부분을 출력하는 for 문 필요
			// * 출력하sms For문 필요
			for (int j = 1; j <= s-i; j++)
				System.out.print(' ');
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
