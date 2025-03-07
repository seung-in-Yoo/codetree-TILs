import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(); // 배열이 동적으로 변하기때문에 arraylist 사용 

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);

            // 인덱스는 0부터 시작하기 때문에 i%2==0으로 조건을 해줘야 홀수번째를 출력 
            if (i % 2 == 0) {
                Collections.sort(list); 
                int median = list.get(list.size() / 2); 
                System.out.print(median + " ");
            }
        }
    }
}
