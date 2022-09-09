package com.Practice;

public class NumberPyramid {

	public static void main(String[] args)
	{
		int n = 5;

	/*	for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
		{
				
			System.out.print(j+" ");
		}
		System.out.println();

	}*/
		
	/*	for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i+1; j++)
		{
				
			System.out.print(j+" ");
		}
		System.out.println();

	}*/
		
		//Floyd's Triangle
		
	/*	int number = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		*/
		
		//0 1 0 1 pattern
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				int sum = i+j;
				if(sum % 2 == 0) //sum is even number
				{
					System.out.print("1 ");
				}
				else  //sum is odd number 
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
	}
}
