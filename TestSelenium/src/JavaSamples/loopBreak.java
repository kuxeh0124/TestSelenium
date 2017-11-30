package JavaSamples;

public class loopBreak {

	public static void main(String[] args) {
		
		for(int Count = 0;Count<=10;Count++){
			if(Count==6){
				break;
				}
			System.out.println("Count is ==> " + Count );
			}
		System.out.println("You have exited the loop");
	}
}
