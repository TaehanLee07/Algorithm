package wrapperC.ex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<String> cannotHear = new ArrayList<>();
            ArrayList<String> cannotSee = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                cannotHear.add(sc.next());

            }

            for (int i = 0; i < m; i++) {
                String name = sc.next();
                if (cannotHear.contains(name) && !cannotSee.contains(name)) {
                    cannotSee.add(name);
                }
            }

            String[] cannotSeeArray = cannotSee.toArray(new String[cannotSee.size()]);

            Arrays.sort(cannotSeeArray);
            System.out.println(cannotSeeArray.length);

            for (String name : cannotSeeArray) {
                System.out.println(name);
            }
        }
    }
}
