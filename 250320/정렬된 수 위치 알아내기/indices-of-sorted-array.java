import java.util.Scanner;
import java.util.Arrays;

class Number implements Comparable<Number> {
    int number;
    int index;

    public Number(int number, int index) {
        this.number = number;
        this.index = index;
    }

    @Override
    public int compareTo(Number b) {
        // 숫자가 작으면 정렬할 때 앞으로 
        if(number != b.number)
            return number - b.number;
        // 인덱스가 작으면 정렬할 때 앞으로
        return index - b.index;
    }
};

public class Main {
    public static final int MAX_NUM = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numCache;
        int[] answer = new int[MAX_NUM];

        Number[] numbers = new Number[MAX_NUM];

        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            numCache = sc.nextInt();
            numbers[i] = new Number(numCache, i);
        }

        Arrays.sort(numbers, 0, n);

        for(int i = 0; i < n; i++) 
            answer[numbers[i].index] = i + 1; 


        for(int i = 0; i < n; i++){
            System.out.print(answer[i] + " ");
        }
    }
}
