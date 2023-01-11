package collectionDemo;


import java.util.HashMap;
import java.util.Map;

public class HasgmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(10, "String");
		hm.put(20, "Poonam");
		hm.put(30, "Vaibhav");
		hm.put(40, "Vaibhav");
		hm.put(30, "Nikita");
		hm.put(45, "Akbar");
		hm.put(50, "Akbar");
		
		gdsakjdhfjSFHKSJVDKJVJZHJKNJCNJNC<nx<MZN MKDFJSNFJ
		
		
		System.out.println(hm);
		
		//hm.remove(50);
		
		//hm.remove(45, "Akbar");
		/* How to iterate a hashmap
		 * 1.For each loop
		 * 2. iteration using keySet() and values() method
		 */
		
		for(Map.Entry<Integer, String> entry : hm.entrySet()) {
			
			System.out.println("Key="+ entry.getKey()+
					" Value="+ entry.getValue());
		}
		
		
		
		for(Integer mrks: hm.keySet()) {
			System.out.println("key=" + mrks);
			
		}
		
		for(String name : hm.values())
		{
			System.out.println("vaule=" + name);
		}
		

	}

}




















