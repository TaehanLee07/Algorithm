import java.io.*;
import java.util.*;
public class Main {
    static class info implements Comparable<info>{
        int node, value;
        public info(int node, int value){
            this.node = node;
            this.value = value;
        }
        @Override
        public int compareTo(info o) {
            return this.value - o.value;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<ArrayList<info>> graph = new ArrayList<>();
        for(int i=0;i<=N;i++)
            graph.add(new ArrayList<>());
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine()," ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            graph.get(s).add(new info(e, value));
        }
        st = new StringTokenizer(br.readLine()," ");
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int answer = search(s, e, graph, N);	
        bw.write(answer + "");
        bw.flush();	
        bw.close();
        br.close();
    }
    static int search(int start, int end, ArrayList<ArrayList<info>> graph, int size){
        PriorityQueue<info> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[size+1];
        pq.add(new info(start, 0));	
        while(!pq.isEmpty()){
            info cur = pq.poll();
            if(cur.node == end)	
                return cur.value;
            visited[cur.node] = true;	
            for(info next : graph.get(cur.node)){
                if(!visited[next.node])	
                    pq.add(new info(next.node, cur.value + next.value));
            }
        }
        return -1;		
    }
}
