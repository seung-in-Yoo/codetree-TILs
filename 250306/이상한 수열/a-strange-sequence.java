import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(odd_seq(n));
    }

    public static int odd_seq(int n) {
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        return (odd_seq(n*1/3) + odd_seq(n-1));
    }
}