import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int L = Integer.parseInt(br.readLine()); //방학 총 일수
        int koreanP = Integer.parseInt(br.readLine()); //국어 총 페이지
        int mathP = Integer.parseInt(br.readLine()); //수학 총 페이지
        int korean_day = Integer.parseInt(br.readLine()); //국어 하루 최대 페이지
        int math_day = Integer.parseInt(br.readLine()); //수학 하루 최대 페이지
        
        int k = 0;
        int m = 0;
        
        if(koreanP % korean_day != 0) {
        	k = koreanP/korean_day+1;
        }else {
        	k = koreanP/korean_day;
        }
        
        if(mathP % math_day != 0) {
        	m = mathP/math_day+1;
        }else {
        	m = mathP/math_day;
        }
        
        
        System.out.println(k >= m ? L-k : L-m);
        
	}

}
