package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(20);
		hs.add(20);
		hs.add(100);
		hs.add(0);
		
		System.out.println(hs);
		

		System.out.println("*************************");
		
		for(Object obj: hs){
			
			System.out.println(obj);
			
			
		}
		System.out.println("****************************");
		
		
		Iterator<Integer> it = hs.iterator();
		
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		

	}

}
