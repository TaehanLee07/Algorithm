import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[][] canvas = new int[100][100];
        int n = sc.nextInt();
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    canvas[x + j][y + k]++;
                    if (canvas[x + j][y + k] == 1)
                        cnt++;
                }
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}
