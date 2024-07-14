import java.util.*;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt();
 
        for (int i = 0; i < num; i++) {
            int cnt = sc.nextInt();
            int f = sc.nextInt();
 
            int[] arr = new int[f];
            for (int j = 0; j < f; j++) {
                arr[j] = sc.nextInt() * sc.nextInt();
            }
 
            Arrays.sort(arr);
 
            int answer = 0;
            for (int j = arr.length-1 ; j >= 0; j--) {
                if(cnt > 0){
                    answer++;
                    cnt -= arr[j];
                }
            }
            System.out.println(answer);
        }
    }
}
