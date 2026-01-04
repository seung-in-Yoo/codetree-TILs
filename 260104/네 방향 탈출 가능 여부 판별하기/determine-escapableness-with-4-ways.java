import java.util.*;

public class Main {
    static int n,m;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        if (bfs()) { 
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static boolean bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0}); // 시작점 정의 (0,0)
        visited[0][0] = true; 

        while(!q.isEmpty()) {
            int[] current = q.poll();
            int r = current[0];
            int c = current[1];

            if (r==n-1 && c==m-1) {return true;} // 도착점에 도달

            //상하좌우 이동
            for (int d=0; d<4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d]; 

                if (nr<0 || nc<0 || nr>=n || nc>=m) {continue;} // 범위 밖

                if (grid[nr][nc] == 0) {continue;} // 뱀이 있는 곳

                if (visited[nr][nc]) {continue;} // 이미 방문한 곳 

                visited[nr][nc] = true; // 방문 처리
                q.add(new int[]{nr,nc});
            }
        }

        return false;
    }
}