package com.Practice;
import java.util.Scanner;

public class ToCalculatePercentage {

		    public static void main(String[] args) {
		    	
	// giving marks as input using variables to calculate percentage
		        int maths = 95;
		        int chem = 80;
		        int phys = 75;
		        int eng = 96;
		        int compsci = 85;
		        float per;
		        float sum = maths + chem + phys + eng + compsci;
		        System.out.println(sum);
		        per = (sum / 500) * 100;

		        System.out.println(per);
		    }
		
// taking input from the user using scanner class to calculate percentage          

           /* Scanner scan = new Scanner(System.in);
                 System.out.println("Enter your Physics marks : ");
                      int physics = scan.nextInt();
                 System.out.println("Enter your English marks : ");
                      int English = scan.nextInt();
                 System.out.println("Enter your Chemistry marks : ");
                      int chemistry = scan.nextInt();
                 System.out.println("Enter your Mathematics marks : ");
                      int mathematics = scan.nextInt();
                 System.out.println("Enter your Computer Science marks : ");
                      int computer = scan.nextInt();

                float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

                   System.out.println("percentage : ");
                   System.out.println(percentage);
}*/
}
		

