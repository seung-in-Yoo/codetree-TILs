import java.util.Scanner;

public class Main {
    public static final int MAX_T = 1000000;
    
    public static int n, m;
    public static int[] positionA = new int[MAX_T  + 1];
    public static int[] positionB = new int[MAX_T  + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        int timeA = 1;
        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0) {
                if(d == 'R')
                    positionA[timeA] = positionA[timeA - 1] + 1;
                else
                    positionA[timeA] = positionA[timeA - 1] - 1;
                
                timeA++;
            }
        }
        
        int timeB = 1;
        for(int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0) {
                if(d == 'R')
                    positionB[timeB] = positionB[timeB - 1] + 1;
                else
                    positionB[timeB] = positionB[timeB - 1] - 1;
                
                timeB++;
            }
        }
        
        if(timeA < timeB) {
            for(int i = timeA; i < timeB; i++) {
                positionA[i] = positionA[i - 1];
            }
        }
        else if(timeA > timeB) {
            for(int i = timeB; i < timeA; i++) {
                positionB[i] = positionB[i - 1];
            }
        }
        
        int count = 0;
        int maxTime = 0;
        if(timeA < timeB)
            maxTime = timeB;
        else
            maxTime = timeA;
        
        for(int i = 1; i < maxTime; i++) {
            if(positionA[i] == positionB[i] && positionA[i - 1] != positionB[i - 1])
                count++;
        }
        System.out.print(count);
    }
}