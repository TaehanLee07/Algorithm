import java.util.*;
import java.io.*;

public class Main {
	
	static int N, M;
	static int[][] rel;
	static final int INF = 999999999;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		rel = new int[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				rel[i][j] = INF;
				if(i == j) rel[i][j] = 0;
			}
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			rel[a][b] = 1;
			rel[b][a] = 1;
		}
		
		for(int k=1;k<=N;k++) { 
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					rel[i][j] = Math.min(rel[i][j], rel[i][k]+rel[k][j]);
				}
			}
		}
		int temp = INF;
		int result = 0;
		for(int i=1;i<=N;i++) {
			int total = 0;
			for(int j=1;j<=N;j++) {
				total += rel[i][j];
			}
			
			if(temp > total) { 
				temp = total;
				result = i;
			}	
		}
		
		bw.write(result+"");
		bw.flush();
		bw.close();
	}

}
