import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
 
		int d = gcd(a, b);	
 
		System.out.println(d);
		System.out.println(a * b / d);
 
	}
 
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
            
		return gcd(b, a % b);
	}
}
