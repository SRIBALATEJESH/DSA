package com.faqs;
import java.util.Scanner;
public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		if(num % 2==0) {
			System.out.println("Even Number");
			}else {
				System.out.println("odd Number");
			}
	}

}
