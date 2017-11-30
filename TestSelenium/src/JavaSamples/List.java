package JavaSamples;

import java.util.*;

public class List {

	public static void main(String[] args) {
		
	      ArrayList<String> a1 = new ArrayList<String>();
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");      

	      LinkedList<String> l1 = new LinkedList<String>();
	      l1.add("Zara");
	      l1.add("Mahnaz");
	      l1.add("Ayan");

	      System.out.println(l1.get(0));
	      System.out.println(a1.get(1));

	}

}
