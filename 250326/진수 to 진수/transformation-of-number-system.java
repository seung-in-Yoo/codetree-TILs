import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        String N = sc.next(); 
        
        int inputValue = Integer.parseInt(N, A);

        String result = Integer.toString(inputValue, B);

        System.out.println(result);
    }
}
