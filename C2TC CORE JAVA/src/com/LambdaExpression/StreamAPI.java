package com.LambdaExpression;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	

	public static void main(String[] args) {
		
           List<Integer> l= List.of(11,14,15,35,40,95,80,45,23,78,56,55,45,69);
		
		   System.out.println(l);
		   
		   //Using stream API
		   
		   Stream<Integer> stream=l.stream();
		   
		   //for even number
		   
		 /* List<Integer> el=stream.filter(i->i%2==0).collect(Collectors.toList());
		   System.out.print("Even Numbers:");
		   System.out.println(el);
		   */
		   
		   
		   //for odd number
		   
		/*   List<Integer> ol=stream.filter(i->i%2!=0).collect(Collectors.toList());
		   System.out.print("Odd Numbers:");
		   System.out.println(ol);
		   */
		   
		   
		   //Numbers are smaller than 50
		   
		 /*  List<Integer> el=stream.filter(i->i<50).collect(Collectors.toList());   //filter function filter the numbers and give required output
		    System.out.println(el);
		   */
		   
		   
		   //using map
		   
		   List<Integer> el=stream.map(i->i%10).collect(Collectors.toList());  //map function add, subtract, multiply and divide the value 
		   System.out.println(el);
	}

}
