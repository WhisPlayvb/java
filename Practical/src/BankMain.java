abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    int balance = 100;
    public int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    int balance = 150;
    public int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    int balance = 200;
    public int getBalance() {
        return balance;
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Bank A Balance: " + bankA.getBalance());
        System.out.println("Bank B Balance: " + bankB.getBalance());
        System.out.println("Bank C Balance: " + bankC.getBalance());
    }
}
