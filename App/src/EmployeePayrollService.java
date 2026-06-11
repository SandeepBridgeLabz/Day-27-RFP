import java.util.Scanner;

class EmployeePayrollData {
    private int id;
    private String name;
    private double salary;

    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id +
                ", Name=" + name +
                ", Salary=" + salary + "]";
    }
}

public class EmployeePayrollService {

    public static EmployeePayrollData readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        return new EmployeePayrollData(id, name, salary);
    }

    public static void writeEmployeeData(EmployeePayrollData emp) {
        System.out.println(emp);
    }

    public static void main(String[] args) {
        EmployeePayrollData emp = readEmployeeData();
        writeEmployeeData(emp);
    }
}

