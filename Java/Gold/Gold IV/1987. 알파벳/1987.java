import java.io.*;
import java.util.*;

public class Main {
    static int answer = 1;
    static char[][] map;
    static int R,C;
    static boolean[] visited;
    static int max = 0;
    
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st1.nextToken());
        C = Integer.parseInt(st1.nextToken());
        
        map = new char[R][C];
        visited = new boolean[26]; //알파벳 개수
        
        for(int r = 0 ; r < R ; r++) {
            String S = br.readLine();
            for(int c = 0 ; c < C ; c++) {
                map[r][c] = S.charAt(c);
            }
        }

        visited[map[0][0] - 'A'] = true;

        backTracking(0, 0);

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }
    
    static void backTracking(int r, int c) {

        for(int i = 0 ; i < 4 ; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(isValid(nr, nc)) {
                visited[map[nr][nc] - 'A'] = true;
                answer++;
                backTracking(nr, nc);
                visited[map[nr][nc] - 'A'] = false;
                answer--;
            }
        }

        max = Math.max(answer, max);
    }

    static boolean isValid(int r, int c) {
        if(r >= 0 && r < R && c >= 0 && c < C && !visited[map[r][c] - 'A']) return true;
        return false;
    }
}
