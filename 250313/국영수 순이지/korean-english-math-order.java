import java.util.*;

class Student {
    String name;
    int korean, english, math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();
            students.add(new Student(name, korean, english, math));
        }

        // Collection을 사용하여 정렬 
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.korean != s2.korean) {
                    return s2.korean - s1.korean;
                } else if (s1.english != s2.english) {
                    return s2.english - s1.english;
                } else {
                    return s2.math - s1.math;
                }
            }
        });

        // for each로 출력 
        for (Student s : students) {
            System.out.println(s.name + " " + s.korean + " " + s.english + " " + s.math);
        }
    }
}
