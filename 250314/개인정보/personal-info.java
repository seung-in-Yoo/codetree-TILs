import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class PersonInfo {
    String name;
    int height;
    double weight;

    public PersonInfo(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        PersonInfo[] personInfos = new PersonInfo[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            personInfos[i] = new PersonInfo(name, height, weight);
        }

        Arrays.sort(personInfos, new Comparator<PersonInfo>() {
            @Override
            public int compare(PersonInfo a, PersonInfo b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for (PersonInfo person : personInfos) {
            System.out.println(person.name + " " + person.height + " " + person.weight);
        }

        Arrays.sort(personInfos, new Comparator<PersonInfo>() {
            @Override
            public int compare(PersonInfo a, PersonInfo b) {
                return b.height - a.height; 
            }
        });

        System.out.println("\nheight");
        for (PersonInfo person : personInfos) {
            System.out.println(person.name + " " + person.height + " " + person.weight);
        }

        sc.close();
    }
}
