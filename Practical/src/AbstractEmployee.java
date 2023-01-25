interface Employee {
    public void assignTask();
    public void work();
    public void deliverTask();
}

class Programmer implements Employee {
    public void assignTask() {
        System.out.println("Assigning programming task to programmer");
    }

    public void work() {
        System.out.println("Programmer is working on the assigned task");
    }

    public void deliverTask() {
        System.out.println("Programmer has delivered the task");
    }
}

class Developer implements Employee {
    public void assignTask() {
        System.out.println("Assigning development task to developer");
    }

    public void work() {
        System.out.println("Developer is working on the assigned task");
    }

    public void deliverTask() {
        System.out.println("Developer has delivered the task");
    }
}

class Tester implements Employee {
    public void assignTask() {
        System.out.println("Assigning testing task to tester");
    }

    public void work() {
        System.out.println("Tester is working on the assigned task");
    }

    public void deliverTask() {
        System.out.println("Tester has delivered the task");
    }
}

class NetworkEngineer implements Employee {
    public void assignTask() {
        System.out.println("Assigning network engineering task to network engineer");
    }

    public void work() {
        System.out.println("Network engineer is working on the assigned task");
    }

    public void deliverTask() {
        System.out.println("Network engineer has delivered the task");
    }
}

public class AbstractEmployee {
    public static void main(String[] args) {
        Employee programmer = new Programmer();
        programmer.assignTask();
        programmer.work();
        programmer.deliverTask();

        Employee developer = new Developer();
        developer.assignTask();
        developer.work();
        developer.deliverTask();

        Employee tester = new Tester();
        tester.assignTask();
        tester.work();
        tester.deliverTask();

        Employee networkEngineer = new NetworkEngineer();
        networkEngineer.assignTask();
        networkEngineer.work();
        networkEngineer.deliverTask();
    }
}
