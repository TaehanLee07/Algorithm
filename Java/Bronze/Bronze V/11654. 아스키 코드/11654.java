import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();  //우선 String형으로 입력 ㅂ다기
        char c = s.charAt(0);  
        System.out.print((int)c);  
    }
}
