import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sumA = 0;
		for (int i = 0; i < 4; i++) {
			sumA += sc.nextInt();
		}

		int sumB = 0;
		for (int i = 0; i < 4; i++) {
			sumB += sc.nextInt();
		}
		
		System.out.println(Math.max(sumA, sumB)); 
	}

}
