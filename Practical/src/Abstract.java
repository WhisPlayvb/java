abstract class SuperClass {
    public SuperClass() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends SuperClass {
    public void a_method() {
        System.out.println("This is abstract method");
    }
}

public class Abstract {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.a_method();
        obj.normalMethod();
    }
}
