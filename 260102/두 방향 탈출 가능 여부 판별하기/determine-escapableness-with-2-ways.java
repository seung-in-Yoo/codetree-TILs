import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt(); 
            }
        }

        boolean[][] dp = new boolean[n][m];
        dp[0][0] = true;

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                // 뱀이 있는 곳은 지나가지 못하고 continue 처리
                if (grid[i][j] == 0) {
                    dp[i][j] = false;
                    continue;
                }
                // 시작점도 이미 처리시키기
                if (i==0 && j==0) {
                    continue;
                }
                boolean fromUp = false;
                boolean fromLeft = false;
                // 내려오는 곳 처리하기 (위에서 or 왼쪽에서) 
                if (i>0) { fromUp = dp[i-1][j]; }
                if (j>0) { fromLeft = dp[i][j-1]; }

                dp[i][j] = fromUp || fromLeft;
            }
        }

        if (dp[n-1][m-1]) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}