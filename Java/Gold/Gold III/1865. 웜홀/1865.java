import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());
        ArrayList<String> answers = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int N, M, W, p1, p2, cost;
            st = new StringTokenizer(bf.readLine());

            N = Integer.parseInt(st.nextToken());//지점의 개수
            M = Integer.parseInt(st.nextToken());//도로의 개수
            W = Integer.parseInt(st.nextToken());//웜홀의 개수

            int[][] dist = new int[N + 1][N + 1];
            for (int j = 0; j < N + 1; j++) {
                Arrays.fill(dist[j], 987654321);
                dist[j][j] = 0;
            }

            for (int j = 0; j < M; j++) {//도로
                st = new StringTokenizer(bf.readLine());

                p1 = Integer.parseInt(st.nextToken());
                p2 = Integer.parseInt(st.nextToken());
                cost = Integer.parseInt(st.nextToken());

                if (cost < dist[p1][p2]) {
                    dist[p1][p2] = cost;
                    dist[p2][p1] = cost;
                }
            }

            for (int j = 0; j < W; j++) {
                st = new StringTokenizer(bf.readLine());

                p1 = Integer.parseInt(st.nextToken());
                p2 = Integer.parseInt(st.nextToken());
                cost = Integer.parseInt(st.nextToken()) * -1;

                dist[p1][p2] = cost;
            }

            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    for (int l = 1; l <= N; l++) {
                        dist[k][l] = Math.min(dist[k][l], dist[k][j] + dist[j][l]);
                    }
                }
            }

            for (int j = 1; j <= N; j++) {
                if (dist[j][j] < 0) {
                    answers.add("YES");
                    break;
                }

                if (j == N) {
                    answers.add("NO");
                }
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.println(answers.get(i));
        }
    }
}
