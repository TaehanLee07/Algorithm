import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    static int N;
    static int M;
    static HashMap<String, String> map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str1 = br.readLine().split(" "); 

        map = new HashMap<>();

        N = Integer.parseInt(str1[0]);
        M = Integer.parseInt(str1[1]);
        
        while(N-->0){
            String[] str2 = br.readLine().split(" ");

            map.put(str2[0], str2[1]);
        }
        while(M-->0){
            String search = br.readLine();

            bw.write(map.get(search) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
