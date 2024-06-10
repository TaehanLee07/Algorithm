import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = A + B;
            System.out.printf("Case #%d: %d + %d = %d%n", i, A, B, C);
        }
    }
}
// printf 배운 기념으로 써봤는데 코드가 더 뭔가 간지나 보임
