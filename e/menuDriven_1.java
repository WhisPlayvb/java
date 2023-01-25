//1.	Write a menu driven Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class menuDriven_1 {
    public static void main(String[] args) {
        int num1, num2, expr;
        char ch;
        Scanner ed = new Scanner(System.in);

        System.out.println("Please select number to perform an operation");
        System.out.println("1 for Addition ");
        System.out.println("2 for Subtraction ");
        System.out.println("3 for Multiplication ");
        System.out.println("4 for Division ");
        System.out.println("4 for Reminder ");
        do{
            System.out.print("Please enter an option = ");
            expr = ed.nextInt();
            switch (expr){
                case 1:
                    System.out.print("Please enter first number  = ");
                    num1 = ed.nextInt();
                    System.out.print("Please enter second number  = ");
                    num2 = ed.nextInt();
                    System.out.println("Total sum = "+  (num1+num2));
                    break;
                case 2:
                    System.out.print("Please enter a number = ");
                    num1 = ed.nextInt();
                    System.out.print("Please enter a number that needs to be subtracted = ");
                    num2 = ed.nextInt();
                    System.out.println("Subtraction result = "+  (num1-num2));
                    break;
                    case 3:
                        System.out.print("Please enter a number = ");
                        num1 = ed.nextInt();
                        System.out.print("Please enter a number that needs to be multiplied = ");
                        num2 = ed.nextInt();
                        System.out.println("Multiplication result = "+  (num1*num2));
                    break;
                case 4:
                    System.out.print("Please enter a dividend = ");
                    num1 = ed.nextInt();
                    System.out.print("Please enter divisor = ");
                    num2 = ed.nextInt();
                    System.out.println("Division result = "+  (num1/num2));
                    break;
                case 5:
                    System.out.print("Please enter number1 = ");
                    num1 = ed.nextInt();
                    System.out.print("Please enter number2 = ");
                    num2 = ed.nextInt();
                    System.out.println("reminder is: = "+  (num1%num2));
                    break;
                default:
                    System.out.println("Please select valid option !");
            }
            System.out.println("Want to continue? y or n ");
            ch=ed.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
}
