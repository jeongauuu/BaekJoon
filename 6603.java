package practice;

import java.util.Scanner;

public class M {
	static int[] lotto = new int[6];
	static int[] num;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while((N = sc.nextInt()) != 0) {
			num = new int[N];
			for(int i =0;i<N;i++) {
				num[i] = sc.nextInt();
			}
			
			dfs(0,0);
			System.out.println();
			
		}	
	}
	
	public static void dfs(int s, int level) {
		
		if(level ==6) {
			for(int i =0;i<6;i++) {
				System.out.printf("%d ", lotto[i]);
			}
			System.out.println();
			return;
		}
		
		for(int i = s ; i<N;i++) {
			lotto[level] = num[i];
			dfs(i+1,level+1);
		}
	}
	
}
