class Student_info {
    private String name;
    private int age;
    private int rollNo;

    // constructor with no arguments
    public Student_info() {
        this.name = "Unknown";
        this.age = 0;
        this.rollNo = 0;
    }

    // constructor with arguments
    public Student_info(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // getter method for age
    public int getAge() {
        return age;
    }

    // setter method for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // getter method for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // method to display student details
    
    public void displayDetails() {
        System.out.println(name + "\t" + age + "\t" + rollNo);
    }
}

public class Student {
    public static void main(String[] args) {
        Student_info[] students = new Student_info[5];

        // creating objects and initializing them with data
        students[0] = new Student_info("Alex", 20, 1);
        students[1] = new Student_info("Bob", 21, 2);
        students[2] = new Student_info(); // using constructor with no arguments
        students[3] = new Student_info("Carol", 22, 4);
        students[4] = new Student_info("David", 23, 5);

        // displaying student details
        System.out.println("Student Details:");
        System.out.println("Name\tAge\tRoll No");
        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }
    }
}
