import java.util.Scanner;

class Person {
    String name;
    String address;
    String city;

    public Person(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public void printInfo() {
        System.out.println("name " + name);
        System.out.println("addr " + address);
        System.out.println("city " + city);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        Person[] people = new Person[n];

        
        String lastName = "";
        Person lastPerson = null;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String city = sc.next();

            people[i] = new Person(name, address, city);

            
            if (lastPerson == null || name.length() > lastName.length() ||
                (name.length() == lastName.length() && name.charAt(0) > lastName.charAt(0))) {
                lastPerson = people[i];
                lastName = name;
            }
        }

        
        if (lastPerson != null) {
            lastPerson.printInfo();
        }

        sc.close();
    }
}
