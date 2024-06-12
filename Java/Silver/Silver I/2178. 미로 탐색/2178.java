import java.util.*;

public class Main {
    static boolean[][] map;
    static boolean[][] visit;
    static int n;
    static int m;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        map = new boolean[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    map[i][j] = true;
                }
            }
        }

        System.out.println(bfs(0, 0));
    }

    private static int bfs(int x, int y) {
        visit[x][y] = true;
        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(x, y, 1));

        while (!q.isEmpty()) {
            Coordinate c = q.remove();

            if (c.x == n - 1 && c.y == m - 1)
                return c.c;

            for (int i = 0; i < 4; i++) {
                int nowX = c.x + dx[i];
                int nowY = c.y + dy[i];

                if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m) {
                    if (!visit[nowX][nowY] && map[nowX][nowY]) {
                        visit[nowX][nowY] = true;
                        q.add(new Coordinate(nowX, nowY, c.c + 1));
                    }
                }
            }
        }
        return 0;
    }

    static class Coordinate {
        int x;
        int y;
        int c;

        public Coordinate(int x, int y, int c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }
}
