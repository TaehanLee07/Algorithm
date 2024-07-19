import java.util.*;
public class Main{         
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int p, q;
		p = sc.nextInt();
		q = sc.nextInt();
		
        if (p <= 50 && q <= 10)
            System.out.println("White");
        else if (q > 30)
            System.out.println("Red");
        else
            System.out.println("Yellow");
	}
}
