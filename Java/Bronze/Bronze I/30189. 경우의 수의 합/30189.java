import java.util.Scanner;

public class Main {
    
    public static int f(int a, int b, int c) {
        int count = 0;
        for (int x = Math.max(0, c - b); x <= Math.min(a, c); x++) {
            int y = c - x;
            if (0 <= y && y <= b) {
                count++;
            }
        }
        return count;
    }

    public static int calculateSumOfF(int n, int m) {
        int result = 0;
        for (int i = 0; i <= n + m; i++) {
            result += f(n, m, i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();        
        System.out.println(calculateSumOfF(n, m));
    }
}
