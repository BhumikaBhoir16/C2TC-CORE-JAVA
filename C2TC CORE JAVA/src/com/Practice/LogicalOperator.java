package com.Practice;
// to get overall average of the marks

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		 byte m1, m2, m3;
		 
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter your marks in Physics");
       m1 = sc.nextByte();

       System.out.println("Enter your marks in Chemistry");
       m2= sc.nextByte();

       System.out.println("Enter your marks in Mathematics");
       m3 = sc.nextByte();
       
       float avg = (m1+m2+m3)/3.0f;
       System.out.println("Your Overall percentage is: " + avg);
       
       
       if(avg>=40 && m1>=35 && m2>=35 && m3>=35)
       {
           System.out.println("Congratulations!   You have been promoted");
       }
       else
       {
           System.out.println("Sorry, You have not been promoted!    Please try again.");
       }

	}

}
