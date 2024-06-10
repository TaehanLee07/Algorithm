import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long sum = a + b + c;
        System.out.println(sum);
        // int 형으로 하니깐 런타임에러라는게 떠서 롱으로 바꿔보니 해결됨
    }
}
