package com.tns.multithreading;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
       ArrayList l=new ArrayList(); //Growable size
		
		l.add("A");  //heterogeneous datatypes are added
		l.add(1000);
		l.add(4.5);
		l.add(null); //null is also valid
		
		System.out.println(l);
		
		l.remove(2); //remove element from list
		
		System.out.println(l);
		
		l.add(2, "M"); //this can add given value on that position
		l.add("N");
		 System.out.println(l);

	}

}
