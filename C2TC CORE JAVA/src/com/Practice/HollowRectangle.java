//Hollow Rectangle

package com.Practice;

public class HollowRectangle {

	public static void main(String[] args) {
		
       for(int i=1; i<=4; i++) { // For loop for row
			
			for(int j=1; j<=5; j++) // for loop for columns
			{
				//boolean condition for printing a rectangle
				if(i==1 || j==1 || i==4 || j==5) 
				{
				    System.out.print("*");
			    }
				else {
		            System.out.print(" ");

	                }

          }
			System.out.println();
       
     }
    }
}
		
      
	

