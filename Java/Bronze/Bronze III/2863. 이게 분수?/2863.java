import java.io.*;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        double c = Integer.parseInt(st.nextToken());
        double d = Integer.parseInt(st.nextToken());

        int count = 0;

        double answerA = (a / c) + (b / d);
        double answerB = (c / d) + (a / b);
        double answerC = (d / b) + (c / a);
        double answerD = (b / c) + (d / a);

        double totalAnswer = Math.max(Math.max(Math.max(answerA, answerB), answerC), answerD);

        if (totalAnswer == answerA){
            count = 0;
        }else if(totalAnswer == answerB){
            count = 1;
        }else if(totalAnswer == answerC){
            count = 2;
        }else{
            count = 3;
        }
        sb.append(count);
        System.out.println(sb.toString());
    }
}
