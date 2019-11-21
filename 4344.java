import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();
		
		for(int i =0; i< C ; i++) {
			int N = sc.nextInt();
			int[] score = new int[N];
			double sum = 0;
			double count=0;
			double avg =0;
			
			for(int j =0; j< N ; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			avg = sum/N;
			
			for(int k =0; k< score.length ; k++) {
				if(score[k]>avg) {
					count ++;
				}
			}
			
			System.out.printf("%.3f%% %n", (count/N)*100 );
		}

		sc.close();

	}

}
