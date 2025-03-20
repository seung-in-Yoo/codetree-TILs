import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int height;
    int weight;
    int index;

    public Student(int height, int weight, int index) {
        this.height=height;
        this.weight=weight;
        this.index=index;
    }

    @Override
    public int compareTo(Student other) {
        if (this.height != other.height) {
            // this가 더 크면 앞에 배치 (오름차순) => 키는 오름차순으로 배치 
            return Integer.compare(this.height, other.height); // this.height - other.height 
        }
        // this가 더 크면 뒤에 배치 (내림차순) => 몸무게는 내림차순으로 배치 
        return Integer.compare(other.weight, this.weight); // other.height - this.weight
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
            students[i] = new Student(height, weight, i+1); // 번호는 1부터 시작 
        }

        Arrays.sort(students);
        
        for (Student s : students) {
        System.out.println(s.height + " " + s.weight + " " + s.index);
        }

        sc.close();
    }

}