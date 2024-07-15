import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int sum = 0 ;
		for(int i = 0; i < 5; i++) {
			int val = sc.nextInt();
			sum += val > 40 ? val : 40;
		}
		System.out.println(sum/5);
	}
 
}
