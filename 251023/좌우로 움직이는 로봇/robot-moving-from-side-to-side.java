import java.util.Scanner;

public class Main {
    static final int MAX_TIME = 100_000;  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        int[] posA = new int[MAX_TIME + 1]; 
        int[] posB = new int[MAX_TIME + 1];

        int timeA = 0, currA = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            int dir = (d == 'L') ? -1 : 1;

            for (int j = 0; j < t; j++) {
                currA += dir;
                timeA++;
                posA[timeA] = currA;
            }
        }

        
        for (int i = timeA + 1; i <= MAX_TIME; i++) {
            posA[i] = posA[timeA];
        }

        int timeB = 0, currB = 0;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            int dir = (d == 'L') ? -1 : 1;

            for (int j = 0; j < t; j++) {
                currB += dir;
                timeB++;
                posB[timeB] = currB;
            }
        }

        for (int i = timeB + 1; i <= MAX_TIME; i++) {
            posB[i] = posB[timeB];
        }

        int maxTime = Math.max(timeA, timeB);

        int count = 0;
        for (int t = 1; t <= maxTime; t++) {
            if (posA[t] == posB[t] && posA[t - 1] != posB[t - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
