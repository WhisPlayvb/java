package StudentDatabase;

import java.util.Arrays;

class Student1 {
    private String rollNo;
    private String name;
    private int[] marks;

    public Student1(String rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
    }

    public void displayClass() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percentage = (double) totalMarks / marks.length;

        if (percentage >= 80) {
            System.out.println("Student is in First Class");
        } else if (percentage >= 60) {
            System.out.println("Student is in Second Class");
        } else {
            System.out.println("Student is in Third Class");
        }
    }
}

public class Student19 {
    public static void main(String[] args) {
        int[] marks1 = { 85, 90, 80, 75, 70 };
        Student1 student = new Student1("S001", "John", marks1);
        student.displayStudent();
        student.displayClass();
        // Output:
        // Roll Number: S001
        // Name: John
        // Marks: [85, 90, 80, 75, 70]
        // Student is in First Class

        int[] marks2 = { 55, 60, 65, 70, 75 };
        Student1 student2 = new Student1("S002", "Amy", marks2);
        student2.displayStudent();
        student2.displayClass();
        // Output:
        // Roll Number: S002
        // Name: Amy
        // Marks: [55, 60, 65, 70, 75]
        // Student is in Second Class
    }
}
