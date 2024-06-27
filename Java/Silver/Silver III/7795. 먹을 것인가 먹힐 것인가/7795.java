package wrapperC.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Tex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[M];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int ans = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (b[j] > a[i]) {
                        ans++;
                    }
                }
            }
        }
    }
}
