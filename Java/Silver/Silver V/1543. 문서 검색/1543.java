import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			
					Scanner sc = new Scanner(System.in);
					String s1 = sc.nextLine();
					String s2 = sc.nextLine();
					
					int size = s1.length();
					int size2 = s2.length();
					
					s1 = s1.replace(s2, "");
					System.out.println((size - s1.length()) / size2);
				

			}
		}
