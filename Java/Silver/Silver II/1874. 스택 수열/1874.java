import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		int num = 1; // 오름차수의 수
		boolean res = true;

		for (int i = 0; i < A.length; i++) {
			int su = A[i]; // 현재 수열의 수
			if (su >= num) { // 현재 수열값 >= 오름차수 자연수 : 값이 같아질때 까지 push() 실행
				while (su >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else { // 혅재 수열값 < 오름차수 자연수 : pop() 을 수행하여 수열 원소를 꺼냄
				int n = stack.pop();
				// 스택의 가장 위의수가 만들어야 하는 수열의수
				if (n > su) {
					System.out.println("NO");
					res = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		if (res)
			System.out.println(bf.toString());

	}
}
