import java.util.*;

// DFS로 풀기 
// 방문하지 않는 1 발견 -> DFS -> 사람 수 리스트 저장 -> 출력 형식 
public class Main {
    static int n; 
    static int[][] grid;
    static boolean[][] visited; // 방문 여부 체크 
    static int[] dr = {-1,1,0,0}; // 상하 표현
    static int[] dc = {0,0,-1,1}; // 좌우 표현 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n]; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> villages = new ArrayList<>(); // 마을의 사람 수 저장할 리스트 배열

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int people = dfs(i,j);
                    villages.add(people);
                }
            }
        }
                
        Collections.sort(villages);

        System.out.println(villages.size()); // 마을 개수
        for (int count : villages) {
            System.out.println(count); // 각 마을의 사람 수 
        }
    }

    // DFS 구현
    static int dfs(int r, int c) {
        visited[r][c] = true; // 방문 처리 
        int count = 1; 

        for (int d=0; d<4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr<0 || nc<0 || nr>=n || nc>=n) {continue;}

            if (grid[nr][nc] == 0) {continue;}

            if (visited[nr][nc] == true) {continue;}

            count += dfs(nr,nc);
        }

        return count;
    }
}