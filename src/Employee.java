import java.util.Arrays;

public class Employee {
    private String name;
    private Days[] workingDays;

    // Static variable to keep track of the total number of employees
    public static int totalEmployees = 0;

    // Constructor method
    public Employee(String name, Days[] workingDays) {
        this.name = name; // Initialize the employee's name
        this.workingDays = workingDays; // Initialize the employee's working days
        totalEmployees++;  // Increment the total employee count each time a new employee is created
    }

    // Method to display the employee's information
    public void displayInfo() {
        System.out.println("Employee Name: " + name); // Print the employee's name
        System.out.println("Working Days: " + Arrays.toString(workingDays)); // Print the working days of the employee
    }

    // Static method to print the total number of employees
    public static void printTotalEmployees() {
        System.out.println("Total Number of Employees: " + totalEmployees); // Print the total number of employees
    }
}
