import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<String> studentList = new ArrayList<>();

    public void addStudent(String studentName) {
        studentList.add(studentName);
        System.out.println("Student added: " + studentName);
    }

    public void removeStudent(String studentName) {
        if (studentList.remove(studentName)) {
            System.out.println("Student removed: " + studentName);
        } else {
            System.out.println("Student not found: " + studentName);
        }
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("Student List:");
            for (String student : studentList) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Main manager = new Main();  // Instantiate the Main class
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String studentToAdd = scanner.nextLine();
                    manager.addStudent(studentToAdd);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String studentToRemove = scanner.nextLine();
                    manager.removeStudent(studentToRemove);
                    break;
                case 3:
                    manager.displayStudents();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }
}
