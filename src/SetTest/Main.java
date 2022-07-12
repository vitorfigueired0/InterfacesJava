package SetTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many students in course A? ");
        int course = scan.nextInt();
        Set<Student> studentSet = new HashSet<>();
        Student student;
        for (int i = 0; i<course; i++){
            System.out.printf("Student #%d ID: ", i+1);
            int id = scan.nextInt();
            student = new Student(id);
            studentSet.add(student);
        }
        System.out.print("How many students in course B? ");
        course = scan.nextInt();
        for (int i = 0; i<course; i++){
            System.out.printf("Student #%d ID: ", i+1);
            int id = scan.nextInt();
            student = new Student(id);
            studentSet.add(student);
        }
        System.out.print("How many students in course C? ");
        course = scan.nextInt();
        for (int i = 0; i<course; i++){
            System.out.printf("Student #%d ID: ", i+1);
            int id = scan.nextInt();
            student = new Student(id);
            studentSet.add(student);
        }
        System.out.println();
        System.out.println("Total students:");
        System.out.println(studentSet.size());
    }
}
