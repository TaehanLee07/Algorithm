import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int a = 1; a < n + 1; a++) {
            for (int b = 1; b < n + 1; b++) {
                for (int c = 1; c < n + 1; c++) {
                    if (a + b + c == n && a >= b + 2 && c % 2 == 0) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
