import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
        int[] socks = new int[5];
        int index;
        int cnt = 0;
        
		for(int i = 0; i < socks.length; i++)
			socks[i] = sc.nextInt();
		
		for(index = 0; index < 5; index++) {
			for(int j = 0; j < 5; j++) 
				if(socks[index] == socks[j])
					cnt++;
			if(cnt % 2 == 1)
				break;
		}
        
		System.out.println(socks[index]);
	}
}
