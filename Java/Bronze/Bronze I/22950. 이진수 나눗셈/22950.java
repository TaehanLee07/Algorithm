import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        String m = sc.nextLine();
        int k = sc.nextInt();

        if (!m.contains("1")) {
            System.out.println("YES");
            return;
        }

        if (k == 0) {
            System.out.println("YES");
            return;
        }

        int x = -1;
        int cnt = 0;
        while (m.charAt(m.length() + x) == '0') {
            x -= 1;
            cnt += 1;
            if (cnt == n) {
                break;
            }
        }

        if (cnt >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
