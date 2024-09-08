import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private String id;
    private String name;
    private String department;

    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class Main {
    private HashMap<String, Employee> employeeMap = new HashMap<>();

    public void addEmployee(String id, String name, String department) {
        Employee employee = new Employee(id, name, department);
        employeeMap.put(id, employee);
        System.out.println("Employee added: " + name);
    }

    public void getEmployeeById(String id) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            System.out.println("Employee Details: " + employee);
        } else {
            System.out.println("Employee not found with ID: " + id);
        }
    }

    public void displayAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees in the system.");
        } else {
            System.out.println("All Employees:");
            for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Main manager = new Main();  // Instantiating the Main class
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    manager.addEmployee(id, name, department);
                    break;
                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    String searchId = scanner.nextLine();
                    manager.getEmployeeById(searchId);
                    break;
                case 3:
                    manager.displayAllEmployees();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();  
        
    }
}
