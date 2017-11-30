package SampleClassObjects;

public class Dog {
	String breed;
	String gender;
	String colour;
	
	public void bark(){
		System.out.println("the " + colour + " " + gender + " " + breed + " is barking");
	}
	
	public void eat(){
		System.out.println("the " + colour + " " + gender + " " + breed + " is eating");
	}
	
	public void sleep(){
		System.out.println("the " + colour + " " + gender + " " + breed + " is sleeping");
	}
	
	public void playDead(){
		System.out.println("the " + colour + " " + gender + " " + breed + " is playing dead");
	}
}
