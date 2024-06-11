import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 각 자리수 구하기
        int b1 = b % 10;
        int b2 = (b / 10) % 10;
        int b3 = b / 100;

        // 계산하기
        int c1 = a * b1;
        int c2 = a * b2;
        int c3 = a * b3;
        int result = c1 + c2 * 10 + c3 * 100;

        // 출력하기
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(result);
    }
}
