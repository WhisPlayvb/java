abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    double sub1, sub2, sub3;
    public A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    public double getPercentage() {
        return (sub1 + sub2 + sub3) / 3;
    }
}

class B extends Marks {
    double sub1, sub2, sub3, sub4;
    public B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }
    public double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4;
    }
}

public class AbstractMarks {
    public static void main(String[] args) {
        A studentA = new A(80, 70, 90);
        B studentB = new B(60, 65, 75, 85);
        System.out.println("Percentage of marks of student A: " + studentA.getPercentage());
        System.out.println("Percentage of marks of student B: " + studentB.getPercentage());
    }
}
