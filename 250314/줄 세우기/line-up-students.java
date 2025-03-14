import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    int height, weight, index;

    public Student(int height, int weight, int index) {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            
            students[i] = new Student(height, weight, i + 1);
        }
        
        
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.height != b.height) {
                    return b.height - a.height; // 내림차순
                } else if (a.weight != b.weight) {
                    return b.weight - a.weight; // 내림차순
                } else {
                    return a.index - b.index;   // 순서는 오름차순으로 
                }
            }
        });

        for (Student student : students) {
            System.out.println(student.height + " " + student.weight + " " + student.index);
        }
        
        sc.close();
    }
}
