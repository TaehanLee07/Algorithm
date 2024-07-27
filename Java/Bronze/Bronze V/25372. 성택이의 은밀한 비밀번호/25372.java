import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < N ; i ++){
            String s = sc.next();

            if(s.length() >= 10 || s.length() < 6)
                sb.append("no");
            else
                sb.append("yes");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
