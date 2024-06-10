import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

interface Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int len = N/4;
        for(int i=0; i<len; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
