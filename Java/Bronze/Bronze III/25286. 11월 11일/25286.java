import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dayOfMon = {31, 28, 31, 30,
                          31, 30, 31, 31,
                          30, 31, 30, 31};
        
        
        for (int i = 0; i < T; i++) {
            int year = sc.nextInt();
            int mon = sc.nextInt();
                  
            // 윤년 체킹 및 윤년일시 2월 은 28일이 아닌 29일이기에 바뀌는 로직
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                dayOfMon[1] = 29;
            
            if (mon == 1) {
                year--;      
                mon = 12;
            } else 
                mon--;
            
            System.out.println(year + " " + mon + " " + dayOfMon[mon - 1]);
        }
    }
}
