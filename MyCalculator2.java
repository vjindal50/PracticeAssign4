// author : Vaibhav Jindal

package Assign4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator2 {
	
	public static int Division(int a , int b){
		int c = 0;
		try{
			c = a / b;
		} catch(InputMismatchException a1){
			System.out.println("the data type of inputs is not same ");
		} catch(ArithmeticException b1){
			System.out.println("division by 0 is illegal so by default 0 will be returned");
		} catch(UnknownError ae){
			System.out.println(ae);
		}
		
		return c;
	}

	public static void main(String[] args) {
		System.out.println("enter the integer numbers : ");
		int number = new Scanner(System.in).nextInt();
		int number2 = new Scanner(System.in).nextInt();
		System.out.println("Solution of the division is : " + Division(number, number2));
	}
}
