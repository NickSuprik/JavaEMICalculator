package day4_package;

import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args) {
		
		/*
		 * EMI = [P x R x (1+R)N ]/[(1+R)N-1] 
		 * P = Principal loan amount 
		 * R = Monthly rate of interest divided by 12 
		 * T = Total home loan tenure in years
		 */
			
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your loan amount in USD");
		double principal = scanner.nextDouble();  // value of p
		
		System.out.println("Enter your annual interest rate (in %)");
		double annualInterestRate = scanner.nextDouble();
		
		System.out.println("Enter your loan tenure in years");
		int tenureYears = scanner.nextInt();
		
		int tenureMonths=tenureYears*12;  //value of n
		
		double monthlyInterestRate = annualInterestRate/(12*100);  //value of r
		
		double emi = principal*monthlyInterestRate* Math.pow(1+ monthlyInterestRate, tenureMonths)
		/ (Math.pow(1+ monthlyInterestRate, tenureMonths)-1);
		
		System.out.println("Your Monthly EMI is " +emi);
		
scanner.close();


		

	}

}
