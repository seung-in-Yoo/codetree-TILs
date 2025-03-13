import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


class HeightArray {
    String name;
    int height;
    int weight;

    public HeightArray(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println(name + " " + height + " " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HeightArray[] person = new HeightArray[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            person[i] = new HeightArray(name,height,weight);
        }

        Arrays.sort(person, new Comparator<HeightArray>() {
            @Override
            public int compare(HeightArray a, HeightArray b) {
                return a.height - b.height;
            }
        });

        for (int i = 0; i < n; i++) {
            person[i].printInfo();  
        }
        sc.close();
    }
}