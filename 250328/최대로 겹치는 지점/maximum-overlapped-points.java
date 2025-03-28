import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        
        Arrays.sort(start); // 시작점 정렬
        Arrays.sort(end); // 끝점 정렬 

        int maxCount = 0;
        int current = 0;
        int startIndex = 0, endIndex = 0;

        while (startIndex < n) {
            if (start[startIndex] <= end[endIndex]) {  
                current++;
                maxCount = Math.max(maxCount, current);
                startIndex++;
            } else {  
                current--;
                endIndex++;
            }
        }

        System.out.println(maxCount);
    }
}
