import java.util.Scanner;
public class IfElseUsingScannerClass {

	public static void main(String[] args) {
		 
		@SuppressWarnings("resource")
		Scanner age = new Scanner(System.in);
		System.out.println("Enter age:");
		int a=age.nextInt();
		
		if(a<=16) 
		{
			System.out.println("I am "+a+ " old.");
			System.out.println("I am in School");
			
		}
		
		else
		{
			System.out.println("I am "+a+ " old.");
			System.out.println("I am in College ");
			
		}
		
	}

}