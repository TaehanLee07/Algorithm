import java.util.Scanner;

public class Main {
    static int[] button = new int[10]; 
    static String text;
    static char[] click = new char[500]; 
    static int position = 0; 

    public static void typing(int num, int count) { 
        if (position > 0 && click[position - 1] == (char) (num + '0')) { 
            click[position] = '#';
            ++position; 
        }
        for (int i = 0; i < count; ++i) {
            click[position + i] = (char) (num + '0'); 
        }
        position += count; 
    }

    public static int fix_button(int original) { 
        for (int i = 1; i < 10; ++i) {
            if (button[i] == original) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 10; ++i) {
            button[i] = sc.nextInt();
        }
        sc.nextLine(); 
        text = sc.nextLine();
        int temp;
        int len = text.length();
        for (int i = 0; i < len; ++i) {
            switch (text.charAt(i)) {
                case 'a':
                    temp = fix_button(2); 
                    typing(temp, 1); 
                    break;
                case 'b':
                    temp = fix_button(2);
                    typing(temp, 2);
                    break;
                case 'c':
                    temp = fix_button(2);
                    typing(temp, 3);
                    break;

                case 'd':
                    temp = fix_button(3);
                    typing(temp, 1);
                    break;
                case 'e':
                    temp = fix_button(3);
                    typing(temp, 2);
                    break;
                case 'f':
                    temp = fix_button(3);
                    typing(temp, 3);
                    break;

                case 'g':
                    temp = fix_button(4);
                    typing(temp, 1);
                    break;
                case 'h':
                    temp = fix_button(4);
                    typing(temp, 2);
                    break;
                case 'i':
                    temp = fix_button(4);
                    typing(temp, 3);
                    break;

                case 'j':
                    temp = fix_button(5);
                    typing(temp, 1);
                    break;
                case 'k':
                    temp = fix_button(5);
                    typing(temp, 2);
                    break;
                case 'l':
                    temp = fix_button(5);
                    typing(temp, 3);
                    break;

                case 'm':
                    temp = fix_button(6);
                    typing(temp, 1);
                    break;
                case 'n':
                    temp = fix_button(6);
                    typing(temp, 2);
                    break;
                case 'o':
                    temp = fix_button(6);
                    typing(temp, 3);
                    break;
                case 'p':
                    temp = fix_button(7);
                    typing(temp, 1);
                    break;
                case 'q':
                    temp = fix_button(7);
                    typing(temp, 2);
                    break;
                case 'r':
                    temp = fix_button(7);
                    typing(temp, 3);
                    break;
                case 's':
                    temp = fix_button(7);
                    typing(temp, 4);
                    break;
                case 't':
                    temp = fix_button(8);
                    typing(temp, 1);
                    break;
                case 'u':
                    temp = fix_button(8);
                    typing(temp, 2);
                    break;
                case 'v':
                    temp = fix_button(8);
                    typing(temp, 3);
                    break;
                case 'w':
                    temp = fix_button(9);
                    typing(temp, 1);
                    break;
                case 'x':
                    temp = fix_button(9);
                    typing(temp, 2);
                    break;
                case 'y':
                    temp = fix_button(9);
                    typing(temp, 3);
                    break;
                case 'z':
                    temp = fix_button(9);
                    typing(temp, 4);
                    break;
            }
        }
        System.out.print(new String(click, 0, position));
        sc.close();
    }
}
