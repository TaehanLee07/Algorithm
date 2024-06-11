import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a % 10 == 0) {
				a = 10;
			}else if(a > 10){
				a = a % 10;
			}
			
			if(a == 1 || a == 5 || a == 6 || a == 10) {
				System.out.println(a);
			}else if(a == 4 || a == 9) {
				if(b % 2 == 0) {
					System.out.println((int) ((a * a) % 10));
				}else {
					System.out.println(a);
				}
			}else {
				b %= 4;
				if(b == 0) {
					b = 4;
				}
				System.out.println((int) (Math.pow(a, b) % 10));
			}
		}
	}

}
