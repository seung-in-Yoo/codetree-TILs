import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        // 2011년의 각 달의 일 수 저장 
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 각 요일 배열로 저장 
        String[] weekInDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        
        int latedate = 0;
        if (m1 == m2) {
            // 같은 달이면 일 차이만 계산하고 
            latedate = d2 - d1;
        } else {
            // 다른 달이면 m1에서 m2까지의 모든 일 더하기
            latedate += daysInMonth[m1 - 1] - d1; 
            for (int i = m1; i < m2 - 1; i++) {
                latedate += daysInMonth[i]; // m1 다음 달부터 m2 전 달까지
            }
            latedate += d2; // m2의 d2일까지
        }
        
        int index = (latedate % 7 + 7) % 7;
        System.out.println(weekInDays[index]);
    }
}
