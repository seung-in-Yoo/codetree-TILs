import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph; 
    static boolean[] visited;           
    static int count = 0;               

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 양방향으로 간선 입력
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }
        dfs(1);

        // 1번 정점 제외해야함 
        System.out.println(count - 1);
    }

    // DFS 구현 
    static void dfs(int current) {
        visited[current] = true; 
        count++;             
        for (int next : graph[current]) {   
            if (!visited[next]) {       
                dfs(next);              
            }
        }
    }
}