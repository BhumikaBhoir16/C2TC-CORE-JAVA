package com.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class NumberIsEvenOrOdd {
       
	public static void main(String[] args) {
		
		List<Integer> l= List.of(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(l);
		
		//conventional code
		//even number
		List<Integer> evenList= new ArrayList<>();
		for(Integer i: l)             //foreach loop concept
		{
			if (i%2==0)
			{
				evenList.add(i);
				
			}
		}	
		  System.out.print("Even Numbers:");
		System.out.println(evenList);

		//for odd number
		List<Integer> oddList= new ArrayList<>();	
	    for(Integer i: l)             //foreach loop concept
	    {
		    if (i%2!=0)
	     	{
			    oddList.add(i);
			
		    }
	    }		
	    System.out.print("Odd Numbers:");
     	System.out.println(oddList);
	
}}