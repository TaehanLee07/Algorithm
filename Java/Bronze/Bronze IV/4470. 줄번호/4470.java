import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();

		String[] arr = new String[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
			System.out.println((i + 1) + ". " + arr[i]);
		}
		sc.close();
	}

}
