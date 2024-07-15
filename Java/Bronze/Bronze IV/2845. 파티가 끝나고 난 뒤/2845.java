import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = new int[5];

        int p = sc.nextInt();
        int area = sc.nextInt();
        int cnt = p * area;

        for (int i = 0; i < res.length; i++) {
            int temp = sc.nextInt();
            res[i] = temp - cnt;
        }

        for (int i : res) {
            System.out.println(i);
        }
    }
}
