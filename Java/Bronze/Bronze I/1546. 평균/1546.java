import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float[] record = new float[N];
		float max = 0;
		float avg = 0;
		
		for(int i=0; i<record.length; i++) {
			record[i] = sc.nextInt();
			if(record[i]>max) {
				max = record[i];
			}
		}
		
		for(int j=0; j<record.length; j++) {
			avg += (record[j]/max*100)/N;
		}
		System.out.println(avg);
	}
}
