class Member {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee1 extends Member {
    private String specialization;

    public Employee1(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }

    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    public void printManager() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
    }
}

public class Inheritance14 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1("Prasad", 25, "9067404012", "123 Main St", 50000, "Java");
        emp.printEmployee();

        Manager mng = new Manager("Snehu", 30, "9860684680", "410 Pune Est", 70000, "Computer");
        mng.printManager();
        
    }
}
