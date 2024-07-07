import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a == 0 && b == 0) break;
            
            if (a - b > 3) {
                int quotient = (a - b) / 2;
                int remainder = (a - b) % 2;
                if (remainder == 1) quotient -= 1;
                System.out.println(quotient + " " + remainder);
            } else if (a - b == 3) {
                System.out.println("0 1");
            } else if (a - b == 2) {
                System.out.println("1 0");
            } else {
                System.out.println("0 0");
            }
        }
    }
}
