import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String targetDay = sc.next();

        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 월마다 일 수 
        String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; // 요일 

        int startDayIndex = getDayIndex(m1, d1, daysInMonth); // 시작 날짜의 요일 인덱스
        int targetDayIndex = getTargetDayIndex(targetDay, dayOfWeek); // 목표 요일의 인덱스

        int appearDays = countAppearDays(m1, d1, m2, d2, startDayIndex, targetDayIndex, daysInMonth);

        System.out.println(appearDays);
    }

    private static int getDayIndex(int month, int day, int[] daysInMonth) {
        int totalDays = 0; // 총 일수 
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day - 1; 
        return totalDays % 7; // 총 일수를 7로 나눈 나머지를 통해 요일 결정하기 
    }

    private static int getTargetDayIndex(String targetDay, String[] dayOfWeek) {
        for (int i = 0; i < dayOfWeek.length; i++) {
            if (dayOfWeek[i].equals(targetDay)) {
                return i;
            }
        }
        return -1; 
    }

    private static int countAppearDays(int m1, int d1, int m2, int d2, int startDayIndex, int targetDayIndex, int[] daysInMonth) {
        int appearDays = 0;
        int currentMonth = m1;
        int currentDay = d1;
        int currentDayIndex = startDayIndex;

        while (!(currentMonth == m2 && currentDay == d2)) {
            if (currentDayIndex == targetDayIndex) {
                appearDays++;
            }

            currentDay++;
            currentDayIndex = (currentDayIndex + 1) % 7;

            if (currentDay > daysInMonth[currentMonth - 1]) {
                currentDay = 1;
                currentMonth++;
            }
        }

        if (currentDayIndex == targetDayIndex) {
            appearDays++;
        }

        return appearDays;
    }
}
