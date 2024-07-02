import java.util.Scanner;

public class Main {
	
	static int[] cnt;
	static int start, end, digit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		digit = 1;
		start = 1;
		end = sc.nextInt();
		
		cnt = new int[10];
		
		while(start <= end) {
			while(start % 10 != 0 && start <= end) {
				counting(start, digit);
				start++;
			}
			
			while(end % 10 != 9 && start <= end) {
				counting(end, digit);
				end--;
			}
			
			if(start > end) break;
			
			start /= 10;
			end /= 10;

			for(int i = 0 ; i < 10 ; ++i) {
				cnt[i] += (end - start + 1) * digit;
			}
			digit *= 10;
		}
		
		for(long i : cnt) {
			System.out.print(i + " ");
		}
	}

	private static void counting(int num, int digit) {
		while(num > 0) {
			cnt[num % 10] += digit;
			num /= 10;
		}
	}
}
