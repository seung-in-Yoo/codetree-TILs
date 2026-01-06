import java.util.*;

public class Main {
    static int N,K;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        grid = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        Queue<int[]> q = new LinkedList<>();

        for (int i=0; i<K; i++) {
            int r = sc.nextInt()-1;
            int c = sc.nextInt()-1;

            q.add(new int[]{r,c});
            visited[r][c] = true;
        }

        int count = K;

        while(!q.isEmpty()) {
            int[] current = q.poll();
            int r = current[0];
            int c = current[1];

            for (int d=0; d<4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr<0 || nc<0 || nr>=N || nc>=N) {continue;}

                if (grid[nr][nc] == 1) {continue;}

                if (visited[nr][nc] == true) {continue;}

                visited[nr][nc] = true;
                count++;
                q.add(new int[]{nr,nc});
            }
        }

        System.out.println(count);
    
    }
}