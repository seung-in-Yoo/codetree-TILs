import java.util.Scanner;

public class Main {
    public static final int MAX_K = 100000;
    
    public static int n;
    public static int[] a = new int[2 * MAX_K + 1];
    public static int[] countBlack = new int[2 * MAX_K + 1];
    public static int[] countWhite = new int[2 * MAX_K + 1];
    public static int black, white, gray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int current = MAX_K;
        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'L') {
                while(x-- > 0) {
                    a[current] = 1;
                    countWhite[current]++;
                    if(x > 0) current--;
                }
            }
            else {
                while(x-- > 0) {
                    a[current] = 2;
                    countBlack[current]++;
                    if(x > 0) current++;
                }
            }
        }

        for(int i = 0; i <= 2 * MAX_K; i++) {
            if(countBlack[i] >= 2 && countWhite[i] >= 2) gray++;
            else if(a[i] == 1) white++;
            else if(a[i] == 2) black++;
        }

        System.out.print(white + " " + black + " " + gray);
    }
}
