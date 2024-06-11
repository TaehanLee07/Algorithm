import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        int totalMinutes = h * 60 + m; 
        int changedMinutes = totalMinutes - 45; 

        if (changedMinutes < 0) { 
            changedMinutes += 24 * 60; 
        }
        int changedH = changedMinutes / 60; 
        int changedM = changedMinutes % 60; 

        System.out.println(changedH + " " + changedM);
    }
}
