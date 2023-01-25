import java.util.Scanner;

public class Factorial_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        long factorial = 1;
        if (n < 0) {
            System.out.println("Invalid input. Number must be non-negative.");
        } else if (n == 0) {
            System.out.println("The factorial of 0 is 1");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        }
    }
}
