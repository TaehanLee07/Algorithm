package programers.solve;

import java.util.Scanner;

public class 짝지어_제거 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String[] st = new String[sb.length()];

        for (int i = 0; i < sb.length(); i++) {
            st[i] = String.valueOf(sb.charAt(i));
        }

        int CurIndex = 0;
        boolean doDelete = false;
        boolean res = false;
        int resNum;

        if (doDelete) {
            for (int i = 0; i < sb.length(); i++) {
                if (st[CurIndex].equals(st[i])) {
                    sb.deleteCharAt(CurIndex);
                    sb.deleteCharAt(i);
                    doDelete = true;
                } else if (doDelete) {
                    CurIndex = 0;
                    i = 0;
                } else if (st.length == 0) {
                    res = true;
                    break;
                } else {
                    CurIndex++;
                    res = false;
                }
            }

        }

        if (st[0].equals("b"))
            System.out.println(1);
        else System.out.println(0);
    }
    }

