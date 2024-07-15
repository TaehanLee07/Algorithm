import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];  
        String str = bf.readLine();  
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arr[c - 97]++;  
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
