import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                if (a.height == b.height) {
                    return b.weight - a.weight;
                }
                return a.height - b.height; 
            }
        });

        for (Person p : people) {
            System.out.println(p.name + " " + p.height + " " + p.weight);
        }

        sc.close();
    }
}
