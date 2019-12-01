	package practice;
	
	import java.util.Scanner;
	
	public class Main {
		public static int[][] check;
		public static int[][] map;
		public static int N;
	
		public static void dfs(int x, int y, int rain) {
			check[x][y] = 1;
			int[] dx = {0, 0, -1, 1};
			int[] dy = {-1, 1, 0, 0};
	
			for (int i = 0; i < 4; i++) {
				int n_x = x + dx[i];
				int n_y = y + dy[i];
				if (n_x >= 0 && n_x < N && n_y >= 0 && n_y < N) {
					if (check[n_x][n_y] == 0 && map[n_x][n_y] > rain) {
						dfs(n_x, n_y, rain);
					}
				}
			}
		}
		public static void main(String[] args) {
			Scanner sc = 	new Scanner(System.in);
			N = sc.nextInt();
			map = new int[N][N];
			
			int max = 0;
			int result = 1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
					max = max > map[i][j] ? max : map[i][j];
				}
			}
	
			int cnt;
	
			for (int k = 0; k < max; k++) {
				cnt = 0;
				check = new int[N][N];
	
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (map[i][j] > k && check[i][j] == 0) {
							cnt++;
							dfs(i, j, k);
						}
					}
				}
				result = result < cnt ? cnt : result;
			}
	
			System.out.println(result);
	
		}
	
	}
