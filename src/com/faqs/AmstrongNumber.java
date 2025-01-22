package com.faqs;

import java.util.Scanner;
public class AmstrongNumber {

	 public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter number ");
		
		int num=sc.nextInt();
		
		//store num to original numbr to overcome mutability issue 
		int original_num = num;
		
		// Step1: read number from digits.
		int digits=String.valueOf(num).length();
		double result=0;
		
		// taking infinte loop
		while(num!=0) {
			
		// read last digit
			int last = num%10;
			
		//do the "last" powr of "digits"
			result = result+Math.pow( last,digits);
			
		// delete last digit
			num = num/10;
			
		}
		if(original_num == result) {
			System.out.println("Armstrong !!!");
		}
		else {
			System.out.println("Not Armstrong !!!");
		}
	 }
	 }
