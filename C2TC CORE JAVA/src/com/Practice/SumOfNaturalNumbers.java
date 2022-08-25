//sum of the enter natural numbers

package com.Practice;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter your input:");
		int num = a.nextInt();
		int sum =0;
		
		for(int i=1; i<=num; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
