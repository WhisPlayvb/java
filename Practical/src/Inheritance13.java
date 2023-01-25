class Parent {
    public void print() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void print() {
        System.out.println("This is child class");
    }
}

public class Inheritance13 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.print(); // Output: This is parent class

        Child child = new Child();
        child.print(); // Output: This is child class

        Parent childRef = new Child();
        childRef.print(); // Output: This is child class
    }
}
