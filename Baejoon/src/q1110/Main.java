package q1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;

		int num = sc.nextInt();
		sc.close();
		for (;;) {
			int n1 = (num / 10) + (num % 10);
//			System.out.println("n1 :"+n1);
			int n2 = (num%10)*10;
//			System.out.println("n2 :"+n2);
			int n3 = n2+n1;
//			System.out.println("n3 :"+n3);
			count++;
			System.out.println(count);
			if (num == n3) {

				break;
			}
		}
//		System.out.println(count);
	}
}