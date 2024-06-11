import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            String s = sc.next(); 
            String reverse = new StringBuilder(s).reverse().toString(); // 문자열 뒤집기

            int sum = Integer.parseInt(s) + Integer.parseInt(reverse); 
            String sumStr = Integer.toString(sum);

            boolean isSymmetric = true; // 대칭인지 확인하기
            for (int j = 0; j < sumStr.length() / 2; j++) {
                if (sumStr.charAt(j) != sumStr.charAt(sumStr.length() - 1 - j)) {
                    isSymmetric = false;
                    break;
                }
            }
            if (isSymmetric) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }           
        }
    }
}
