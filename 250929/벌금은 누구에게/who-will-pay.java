import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int k = sc.nextInt(); 

        int[] penaltyCount = new int[n + 1]; 

        for (int i = 0; i < m; i++) {
            int student = sc.nextInt();
            penaltyCount[student]++;

            if (penaltyCount[student] == k) {
                System.out.println(student);
                return;
            }
        }

        System.out.println(-1);
    }
}
