import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int num[]=new int[N];
		for(int i=0; i<N; i++)
			num[i]=Integer.parseInt(br.readLine());

		//평균값 구하기
		int sum=0;
		for(int i=0; i<N; i++) {
			sum+=num[i];
		}
		System.out.println(Math.round(sum/(float)N));
			
		//CountingSort
		int count[]=new int[8001];
		
		for(int i=0; i<N; i++) 
			count[num[i]+4000]++;
		int value[]=count.clone();
		for(int i=1; i<8001; i++)
			count[i]=count[i]+count[i-1];
		
		int result[]= new int[N];
		for(int i=N-1; i>=0; i--) {
			int temp=count[num[i]+4000]-1;
			result[temp]=num[i];
			count[num[i]+4000]=temp;
		}
		//중앙값
		System.out.println(result[N/2]);
		//최빈값
		int max=0;
		int cnt=0,mode=0;
		for(int i=0; i<8001; i++) {
			if(max<value[i])
				max=value[i];
		}
		for(int i=0; i<8001; i++) {
			if(max==value[i]) {
				cnt++;
				mode=i-4000;
			}
			if(cnt==2)
				break;
		}
		System.out.println(mode);
		//범위
		System.out.println(result[N-1]-result[0]);
		
	}

}
