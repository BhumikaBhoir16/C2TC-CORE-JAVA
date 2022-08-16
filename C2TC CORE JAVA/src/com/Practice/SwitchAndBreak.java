package com.Practice;

public class SwitchAndBreak {

	public static void main(String[] args) {
		 
		int a = 0;
		
		switch(a) 
		{
		   case 1: //my name
			   System.out.println("My ame is Bhumika Bhoir");
			   break;  //when condition is get true then break statement stop running the code at that point
		
		   case 2: //My age
			   System.out.println("My age is 22");
			   break;
			 
		   case 3: //about study
			   System.out.println("I am Engineer");
			   break;
		
			default:  
				System.out.println("Wrong input");
		}

	}

}
