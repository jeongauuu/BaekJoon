import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = 0;

		for (int i = 1; i < N; i++) {
			String s_N = Integer.toString(i);
			int sum = 0;

			for (int j = 0; j < s_N.length(); j++) {
				char t_c = s_N.charAt(j);
				sum = sum + t_c - 48;
			}

			if (i + sum == N) {
				tmp = i;
				break;
			}
		}

		System.out.println(tmp);

		sc.close();
	}
}
