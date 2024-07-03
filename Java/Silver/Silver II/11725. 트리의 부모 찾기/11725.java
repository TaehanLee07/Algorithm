import java.io.*;  
import java.util.*;  
  
public class Main {  
  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        int n = Integer.parseInt(br.readLine());  
        // 각 노드의 부모 노드를 저장하는 배열  
        int[] parent = new int[n + 1];  
        // 연결 리스트 배열  
        ArrayList<Integer>[] adj = new ArrayList[n + 1];  
        for (int i = 1; i <= n; i++) {  
            adj[i] = new ArrayList<>();  
        }  
        // 방문 체크 배열  
        boolean[] visited = new boolean[n + 1];  
        StringTokenizer st;  
        for (int i = 1; i < n; i++) {  
            st = new StringTokenizer(br.readLine());  
            int a = Integer.parseInt(st.nextToken());  
            int b = Integer.parseInt(st.nextToken());  
            adj[a].add(b);  
            adj[b].add(a);  
        }  
  
        // BFS를 위한 큐  
        Queue<Integer> queue = new LinkedList<>();  
        // 루트 노드인 1을 큐에 넣고 방문 처리  
        queue.add(1);  
        visited[1] = true;  
        // BFS   
while (!queue.isEmpty()) {  
            int cur = queue.poll();  
            // 현재 노드에 연결된 다음 노드들을 탐색  
            for (int next : adj[cur]) {  
                // 방문했던 노드라면 건너뛴다  
                if (visited[next]) {  
                    continue;  
                }  
                // 다음 노드를 방문 처리하고 큐에 넣는다.  
                visited[next] = true;  
                queue.add(next);  
                // 다음 노드의 부모가 현재 노드임을 저장한다.  
                parent[next] = cur;  
            }  
        }  
  
        // 부모 노드를 출력한다.  
        for (int i = 2; i <= n; i++) {  
            System.out.println(parent[i]);  
        }  
    }  
}
