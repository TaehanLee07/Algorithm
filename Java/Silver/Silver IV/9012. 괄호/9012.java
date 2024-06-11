import java.util.Scanner;
import java.util.Stack;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			System.out.println(solve(in.next()));	
		}
	}
 
	public static String solve(String s) {
 
		Stack<Character> stack = new Stack<>();
 
		for (int i = 0; i < s.length(); i++) {
 
			char c = s.charAt(i);
 
			if (c == '(') {
				stack.push(c);
			}
 

			else if (stack.empty()) {
				return "NO";
			}
			else {
				stack.pop();
			}
		}
 
 
		if (stack.empty()) {
			return "YES";
		} 
		else {
			return "NO";
		}
	}
}
