import java.util.Scanner;

public class Main {
    public static final int MAX_T = 1000000;

    public static int n, m;
    public static int[] positionA = new int[MAX_T + 1];
    public static int[] positionB = new int[MAX_T + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while (t-- > 0) {
                if (d == 'R')
                    positionA[timeA] = positionA[timeA - 1] + 1;
                else
                    positionA[timeA] = positionA[timeA - 1] - 1;

                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while (t-- > 0) {
                if (d == 'R')
                    positionB[timeB] = positionB[timeB - 1] + 1;
                else
                    positionB[timeB] = positionB[timeB - 1] - 1;

                timeB++;
            }
        }

        int answer = -1;
        for (int i = 1; i < Math.min(timeA, timeB); i++) {
            if (positionA[i] == positionB[i]) {
                answer = i;
                break;
            }
        }

        System.out.print(answer);
    }
}
