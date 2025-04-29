public class EmployeeAbstract {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee("Roxy", 101, 78000);
        Employee employee2 = new PartTimeEmployee("Max", 109, 900, 10);

        printEmployee(employee1);
        System.out.println();
        printEmployee(employee2);
    }

     static void printEmployee(Employee emp) {
        emp.displayDetails();
    }
}

abstract class Employee {
    protected String name;
    protected int employeeId;

    Employee(String n, int e) {
        this.name = n;
        this.employeeId = e;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("*** Employee Details ***");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String n, int e, double m) {
        super(n, e);
        this.monthlySalary = m;
    }

    @Override
        double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String n, int e, double w, int h) {
        super(n, e);
        this.hourlyWage = w;
        this.hoursWorked = h;
    }

    protected double hourlyWage;
    protected int hoursWorked;

    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}