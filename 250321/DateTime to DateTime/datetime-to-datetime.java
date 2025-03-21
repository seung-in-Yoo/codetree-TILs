import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int startMinutes = 11 * 60 + 11; 
        int endMinutes = (A - 11) * 24 * 60 + B * 60 + C;

        
        int latedTime = endMinutes - startMinutes;

        if (latedTime < 0) {
            System.out.println(-1);
        } else {
            System.out.println(latedTime);
        }  
    }
}