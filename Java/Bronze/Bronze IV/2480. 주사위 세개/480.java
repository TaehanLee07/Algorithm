import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        int b = sc.nextInt();  
        int c = sc.nextInt();
        int prize = 0;  
        
        if (a == b && b == c) {
            prize = 10000 + a * 1000;
        } else if (a == b || a == c || b == c) {
            if (a == b || a == c) {
                prize = 1000 + a * 100;
            } else {
                prize = 1000 + b * 100;
            }
        } else {
            int maxNum = Math.max(Math.max(a, b), c);
            prize = maxNum * 100;
        }
        
        System.out.println(prize);
    }
}
