import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		int count = 0;
		int n = num;

		for (;;) {
			int n1 = (n / 10) + (n % 10);
			int n2 = (n % 10) * 10 + (n1 % 10);
			count++;
			if (n2 == num)
				break;
			n = n2;
		}
		System.out.println(count);
	}
}
