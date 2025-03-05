import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lcm = findLCM(arr, n);
        System.out.println(lcm);
    }

    // 최대공약수를 구할때는 유클리드 알고리즘 사용 
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 최소공배수 구하기 
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // 최대 공약수 구하는 공식 
    }

    public static int findLCM(int[] arr, int n) {
        if (n == 1) return arr[0];
        return lcm(arr[n - 1], findLCM(arr, n - 1)); // 배열의 재귀 계산 
    }
}
