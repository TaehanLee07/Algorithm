import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[10];
        
        for (int i = 0; i < N; ++i) {
            d[i] = sc.nextInt();
        }

        if (N == 1) {
            if (d[0] == 0) {
                System.out.println("YES");
                System.out.println(0);
                return;
            }
        }

        System.out.println("YES");
        System.out.println("" + d[N - 1] + d[N - 1] + d[N - 1]);
    }
}
