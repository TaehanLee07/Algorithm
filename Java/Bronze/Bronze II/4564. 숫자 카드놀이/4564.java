import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int t = sc.nextInt();
            // 탈출
            if (t == 0) break;

            int temp = 1;
            
            while (Integer.toString(t).length() != 1) {
                System.out.print(t + " ");
                String strT = Integer.toString(t);
                temp = 1; // Reset temp for each number

                for (int i = 0; i < strT.length(); i++) 
temp *= (strT.charAt(i) - '0');
                
                t = temp;
            }
            System.out.println(t);
        }
    }
}
