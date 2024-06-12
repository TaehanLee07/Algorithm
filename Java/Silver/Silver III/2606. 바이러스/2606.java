import java.util.Scanner;

public class Main {
	static int map[][];
	static boolean visit[];
	static int n, m, v;
	static int count = 0;
	
	public static int dfs(int i) {
		visit[i] = true;
		
		for(int j=1; j<=n; j++) {
			if(map[i][j] == 1 && visit[j] == false) {
				count ++;
				dfs(j);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();	
		m = scan.nextInt();
		v = 1;	
		map = new int[n+1][n+1];	
		visit = new boolean[n+1];	
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			map[a][b] = map[b][a]= 1;
		}
		
		System.out.println(dfs(1));
		scan.close();
	}
}
