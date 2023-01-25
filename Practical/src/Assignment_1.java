/*
	Name : Prasad Dhobale
	Roll : 239
	Div  : DSY Computer Engineering MITAOE
*/
import java.util.Scanner;

public class Assignment_1 {	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, sum, sub, mul, div, mod;
		
		System.out.println("Enter Number 1 : ");
		number1 = sc.nextInt();
		
		System.out.println("Enter Number 2 : ");
		number2 = sc.nextInt();
		
		sum = number1 + number2;
		sub = number1 - number2;
		mul = number1 * number2;
		div = number1 / number2;
		mod = number1 % number2;
		
		System.out.println(number1 +" + "+ number2 + " = " + sum);
		System.out.println(number1 +" - "+ number2 + " = " + sub);
		System.out.println(number1 +" * "+ number2 + " = " + mul);
		System.out.println(number1 +" / "+ number2 + " = " + div);
		System.out.println(number1 +" % "+ number2 + " = " + mod);		
		sc.close();
	}
}