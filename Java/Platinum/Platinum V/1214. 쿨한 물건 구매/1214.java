import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();                     
        int P = scanner.nextInt();
        int Q = scanner.nextInt();

        int ans;
        if (P < Q) {
            int temp = P;
            P = Q;
            Q = temp;
        }

        if (D % P == 0 || D % Q == 0) {
            System.out.println(D);
            return;
        } else {
            ans = (D / P) * P + P;
        }

        int t = ans;
        for (int i = 1; i <= t / P; i++) {
            int temp = t - P * i;
            if ((D - temp) % Q == 0) {
                System.out.println(D);
                return;
            } else {
                temp += ((D - temp) / Q) * Q + Q;
            }
            if (ans == temp)
                break;
            ans = Math.min(temp, ans);
        }
        System.out.println(ans);
    }
}
