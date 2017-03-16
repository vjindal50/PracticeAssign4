// author : vaibhav jindal

package Assign4;

import java.util.Scanner;

public class MyCalculator  {
	
	public static int power(int a, int b) throws Exception{
		int answer  = a ;		
		if ((a < 0) || (b < 0 )){		 
			throw new IllegalArgumentException("the number a and b should be non negative");			
		} else if(b == 0){
			return 1;
		}
		else {
			for (int i = 1 ; i < b ; i++){
				answer = answer * a;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("enter the integer numbers : ");
		int number = new Scanner(System.in).nextInt();
		int number2 = new Scanner(System.in).nextInt();		
		System.out.println("value is : " + power(number, number2));
	}
}
