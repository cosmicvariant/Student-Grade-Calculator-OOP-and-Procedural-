import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter the number of students: ");
        int numStudents = myScanner.nextInt();
        myScanner.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter data for Student #" + (i + 1));

            System.out.print("Please enter student's name: ");
            String name = myScanner.nextLine();

            System.out.print("Please enter student's ID: ");
            int id = myScanner.nextInt();
            myScanner.nextLine(); // Consume newline

            System.out.print("Please enter the number of grades: ");
            int numGrades = myScanner.nextInt();
            myScanner.nextLine(); // Consume newline

            int[] grades = new int[numGrades];
            for (int j = 0; j < numGrades; j++) {
                System.out.print("Enter grade #" + (j + 1) + ": ");
                grades[j] = myScanner.nextInt();
            }

            students[i] = new Student(name, id, grades);
        }

        System.out.println("\nStudent Information:");
        for (Student student : students) {
            System.out.println(student);
        }

        double classAverage = Student.calculateClassAverage(students);
        System.out.println("\nClass Average Grade: " + classAverage);

        myScanner.close();
    }
}
