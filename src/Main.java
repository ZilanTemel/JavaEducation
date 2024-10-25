import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of employees to add from the user
        System.out.print("How many employees do you want to add? ");
        int employeeCount = scanner.nextInt();
        scanner.nextLine();  // Clear the newline character

        // Loop for employees
        Employee[] employees = new Employee[employeeCount];

        for (int i = 0; i < employeeCount; i++) {
            // Get the employee's name
            System.out.print("Employee's name: ");
            String name = scanner.nextLine();

            // Get the number of days the employee worked
            System.out.print("Number of days worked: ");
            int dayCount = scanner.nextInt();
            scanner.nextLine();  // Clear the newline character

            // Get the working days
            Days[] workingDays = new Days[dayCount];
            for (int j = 0; j < dayCount; j++) {
                System.out.print("Enter day " + (j + 1) + " (MONDAY, TUESDAY...): ");
                workingDays[j] = Days.valueOf(scanner.nextLine().toUpperCase());
            }

            // Create the employee and add to the list
            employees[i] = new Employee(name, workingDays);
        }

        // Print employee information
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }

        // Print total number of employees
        Employee.printTotalEmployees();

        scanner.close();
    }
}
