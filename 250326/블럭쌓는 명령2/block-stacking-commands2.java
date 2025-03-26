import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int K = sc.nextInt(); 

        int[] blocks = new int[N + 2]; 
        
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            blocks[A] += 1;   
            blocks[B + 1] -= 1; 
        }

        
        int maxBlock = 0;
        int currentBlock = 0;

        for (int i = 1; i <= N; i++) {
            currentBlock += blocks[i];
            maxBlock = Math.max(maxBlock, currentBlock); 
        }

        System.out.println(maxBlock);
    }
}