import java.util.Scanner;
public class Main {
    public static final int MAX_K = 100000; // 사용자 입력을 받기 때문에 MAX_K는 충분히 큰 수로 지정 
    public static int n;
    public static int[] a = new int[2 * MAX_K + 1]; // 초기 위치를 중앙으로 설정 
    public static int white, black;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = MAX_K; // 현재 위치 
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d=='L') { // L일때 
                while(x-- > 0) {
                    a[current] = 1; // 흰색으로 뒤집음
                    if(x > 0) current--; // 왼쪽으로 이동하면 현재 위치 감소 
                }
            } else { // R일때 
                while(x-- > 0) {
                    a[current] = 2; // 검은색으로 뒤집음
                    if(x > 0) current++; // 오른쪽으로 이동하면 현재 위치 증가 
                }
            }
        }

        white = 0;
        black = 0;
        for(int i = 0; i <= 2 * MAX_K; i++) {
            if(a[i] == 1) white++; // 1이면 흰색 증가
            else if(a[i] == 2) black++; // 2이면 검은색 증가 
        }

        System.out.print(white + " " + black);
        
    }
}