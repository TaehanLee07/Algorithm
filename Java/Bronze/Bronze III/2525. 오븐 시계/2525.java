import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        
        int c = scanner.nextInt();

        
        int minute = (b + c) % 60;
        int hour = (a + (b + c) / 60) % 24;

       
        System.out.println(hour + " " + minute);
    }
}
