package JavaSamples;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		
	  HashMap<String,String> m1 = new HashMap<String, String>(); 
	  m1.put("Zara", "8");
	  m1.put("Mahnaz", "31");
	  m1.put("Ayan", "12");
	  m1.put("Daisy", "14");
	
	  System.out.print(m1.get("Zara"));		
	}

}
