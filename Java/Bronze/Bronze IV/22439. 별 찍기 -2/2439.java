import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
