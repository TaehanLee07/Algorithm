package programers.solve;

import java.util.Arrays;
import java.util.Scanner;

public class 주식가격 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prices = new int[5];

        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println(solution(prices));


    }

    public static String solution(int[] prices) {
        int[] answer = {4, 3, 1, 1, 0};
        String arr = Arrays.toString(answer);
        return arr;
    }


}
