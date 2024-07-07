import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) { 
                break;
            }
            int[] arr1 = new int[n];
            int[] arr2 = new int[m]; 
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(br.readLine()); 
            }
            int i = 0 ;
            int j = 0;
            int count = 0; 
            while (i != n && j != m) { 
                if (arr1[i] == arr2[j]) {
                    count++; 
                    i++;
                    j++;
                }
                else if (arr1[i] > arr2[j]) { 
                    j++;
                } else { 
                    i++;
                }
            }
            System.out.println(count); 
        }
    }
}
