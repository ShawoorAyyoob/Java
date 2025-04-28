public class EmployeeAbstract {
    public static void main(String[] args) {
        
    }
}

abstract class Employee {
    protected String name;
    protected int employeeId;

    abstract void double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {
    protected double monthlySalary;
    
    @Override
    void calculateSalary() {
        return;
    }
}