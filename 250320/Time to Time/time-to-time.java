import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int C = sc.nextInt(); 
        int D = sc.nextInt(); 

        int startMinutes = A * 60 + B;
        int endMinutes = C * 60 + D;

        
        int elapsedTime = endMinutes - startMinutes;

        System.out.println(elapsedTime);
    }
}