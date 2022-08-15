//using scanner class we can check our grades

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		
		float marks;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks = sc.nextFloat();
		
	    if (marks>=95.0)
		{
			System.out.println("Your Marks are " +marks );
			System.out.println("Your grade is O");
		}
		else if(marks>=90.0)
		{
			System.out.println("Your Marks are " +marks );
			System.out.println("Your grade is A+");
		}
		else if(marks>=80.0)
		{
			System.out.println("Your Marks are " +marks );
			System.out.println("Your grade is A");
	    }
		else if(marks>=70.0)
		{
			System.out.println("Your Marks are " +marks );
			System.out.println("Your grade is B");
		}
		else if(marks>=60.0)
		{
			System.out.println("Your Marks are " +marks );
			System.out.println("Your grade is C");
		}
		else if(marks>=50.0)
		{
			System.out.println("Your Marks are " +marks );
			System.out.println("Your grade is D");
		}
		else if(marks>=40.0)
		{
			System.out.println("Your Marks are " +marks );
			System.out.println("Your grade is E");
		}
		else if(marks>=35.0)
		{
			System.out.println("Your Marks are " +marks );
			System.out.println("Your are Pass");
		}
		else if(marks<35.0)
		{
			System.out.println("Your Marks are " +marks );
			System.out.println("Your are Fail");
		}
		else
		{
			System.out.println("Thank you!");
		}
		}
			
}	


