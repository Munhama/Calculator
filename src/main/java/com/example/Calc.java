package com.example;
import java.util.*;

class Calc{
	public static void main(String[] arg){
		double res;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = scan.nextDouble();		
		System.out.print("Enter b: ");
		double b = scan.nextDouble();
		System.out.print("Enter operation: ");
		String op = scan.next();
		switch(op){
			case "+":
				res = a + b;
				break;
			case "-":
				res = a - b;
				break;
			case "*":
				res = a * b;
				break;
			case "/":
				res = a / b;
				break;
			default:
				System.out.println("Operation is not correct");
				return;		
		}
		System.out.println("Result = " + res);
	}
}
