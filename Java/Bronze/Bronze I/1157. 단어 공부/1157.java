import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean manyAlpha = false;
        int max = 0;
        int maxIndex = 0;

        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            arr[ch - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            int compare = arr[i] - max;
            if (compare > 0) {
                max = arr[i];
                manyAlpha = false;
                maxIndex = i;
            } else if (compare == 0) 
                manyAlpha = true;
            
        }
        if (manyAlpha) 
            System.out.println("?");
         else 
            System.out.println((char) (maxIndex + 'A'));
        
    }
}
