import java.util.*;

public class Main {
    static int N, M;
    static long X;
    static long[] C; // 보수 비용
    static long[] S; // 예산

    public static boolean calc(int num) { // num개의 동아리에 동방을 주는 것이 가능한가?
        long bal = 0; // 지원해주어야 하는 돈
        for (int i = 0; i < num; i++) {
            if (C[i] > S[M - num + i]) {
                bal += C[i] - S[M - num + i];
            }
        }
        return bal <= X;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextLong();
        
        C = new long[N];
        S = new long[M];

        for (int i = 0; i < N; i++) {
            C[i] = sc.nextLong();
        }

        for (int i = 0; i < M; i++) {
            S[i] = sc.nextLong();
        }

        Arrays.sort(C);
        Arrays.sort(S);

        int st = 0;
        int en = Math.min(N, M);

        while (en - st > 10) {
            int mid = (st + en) / 2;
            if (calc(mid)) {
                st = mid;
            } else {
                en = mid - 1;
            }
        }

        for (int i = en; i >= st; i--) {
            if (calc(i)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1); // unreachable
    }
}
