package JavaSamples;

public class enhancedForLoop {

	public static void main(String[] args) {
		
    	String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};
    	 
    	// Enhanced for loop, this will automatically iterate on the array list 
    	for (String dayName : days) {
      	System.out.println("Days ==> "+ dayName);
    	}
	
	}

}
