package practice;

import java.util.Scanner;

public class M {
	static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int x = a*d + b*c;
		int y = b*d;
		
		int gcd = gcd(x,y);
		
		System.out.printf("%d %d", x/gcd, y/gcd);
		
		
	}	
}
