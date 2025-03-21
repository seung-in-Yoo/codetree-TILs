import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

       
        String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        
        int latedate = 0;

        if (m1 == m2) {
            latedate = d2 - d1;
        } else {
            latedate += daysInMonth[m1 - 1] - d1;
            
            for (int i = m1; i < m2 - 1; i++) {
                latedate += daysInMonth[i];
            }
            
            latedate += d2;
        }

        int index = (latedate % 7 + 7) % 7;
        System.out.println(weekDays[(7 + index) % 7]);  
    }
}
