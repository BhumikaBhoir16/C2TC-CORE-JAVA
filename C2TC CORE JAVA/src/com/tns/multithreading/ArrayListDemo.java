package com.tns.multithreading;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	/*	//Array 
		String [] A= new String[500];
		A[0]="Bhumika";
		A[1]="Krutika";
		A[3]= 30; //here we get type mismatch error in array (this is compile type error)
		
		*/
		
/*	// this show erroe at runtime
		ArrayList s =new ArrayList();
		s.add("Bhumika");
		s.add("Krutika");
		s.add(45);
		
		String employee1=(String) s.get(0);
		
		String employee2=(String) s.get(1);
		
		String employee3=(String) s.get(2);
		*/
		
    // when we use generics syntax it will give us compile time error		
		ArrayList<String> s =new ArrayList<String>();
		s.add("Bhumika");
		s.add("Krutika");
		s.add(45);
		
		String employee1=(String) s.get(0);
		
		String employee2=(String) s.get(1);
		
		String employee3=(String) s.get(2);
		
		/*ArrayList l=new ArrayList();
		
		l.add("A");
		l.add(1000);
		l.add(4.5);
		l.add(null);
		
		System.out.println(l);
		
		l.remove(2);
		
		System.out.println(l);
		
		l.add(2, "M");
		l.add("N");
		 System.out.println(l);*/
		 
		
	}

}
