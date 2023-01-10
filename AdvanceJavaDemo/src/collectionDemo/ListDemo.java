package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> lst =new  ArrayList<Object>();
		
		
		LinkedList<Object> lst2 = new LinkedList<Object>();
		
		
		
		

		lst.add("Amit");
		lst.add("ABC");
		lst.add("ABC");
		lst.add(10);
		
		lst.add("testing");
		
		lst.add(2, "XYZ");
		
		//System.out.println(lst);
		
		//lst.remove(2);
		
		//lst.clear();
		
		//boolean b= lst.contains(10);
		//Object obj =lst.get(0);
		//System.out.println(obj);
		
		//int res= lst.indexOf("ABC");
		//System.out.println(res);
		
		//lst.clear();
		
		//boolean emp =lst.isEmpty();
		//System.out.println(emp);
		
		//int last = lst.lastIndexOf("ABC");
		
		
		//System.out.println(b);
		
		//int last=lst.lastIndexOf(10);
		
		
		//System.out.println(last);
		
		
		//lst.set(1, "Indresh");
		
		
		//System.out.println(lst.size());

		//Printing of ArrayList
		
		System.out.println(lst);
		
		
		/* How to iterate Arraylist
		 	1. Using For loop
		 	2. For each loop
		 	3. Using Iterator Method
		 
		 */
		
		for(int i=0; i<lst.size(); i++) {
			
			
			System.out.println(lst.get(i));
		}
		System.out.println("*************************");
		
		for(Object obj: lst){
			
			System.out.println(obj);
			
			
		}
		System.out.println("****************************");
		
		
		Iterator<Object> it = lst.iterator();
		
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
