public class EmployeeAbstract {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee();
        Employee employee2 = new PartTimeEmployee();

        employee1.calculateSalary();
        employee1.displayDetails();
        employee2.calculateSalary();
        employee2.displayDetails();

    }

    void printEmployee(Employee emp) {
        
    }
}

abstract class Employee {
    protected String name;
    protected int employeeId;

    abstract void calculateSalary();

    void displayDetails() {
        System.out.println("*** Employee Details ***");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    protected double monthlySalary;

    @Override
    void calculateSalary() {
        System.out.println(monthlySalary);
        return;
    }
}

class PartTimeEmployee extends Employee {
    protected double hourlyWage;
    protected int hoursWorked;

    @Override
    void calculateSalary() {
        System.out.println(hourlyWage * hoursWorked);
        return;
    }
}