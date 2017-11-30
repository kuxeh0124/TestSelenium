package JavaSamples;

public class loopContinuation {

	public static void main(String[] args) {
		
		for(int Count = 0;Count<=5;Count++){			
			if(Count==3){
				continue;				
				}
			System.out.println("Count is ==> " + Count);
		}		
	}
}
