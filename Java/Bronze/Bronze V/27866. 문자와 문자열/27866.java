import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        int b = sc1.nextInt();
        System.out.println(str.charAt(b-1));       
    } 
}
