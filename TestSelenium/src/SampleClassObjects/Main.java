package SampleClassObjects;

public class Main {

	public static void main(String[] args) {
		// Object will be created here
		Dog pitBull = new Dog();
		
		pitBull.breed = "pitbull";
		pitBull.gender = "male";
		pitBull.colour = "black";
		
		pitBull.bark();
		pitBull.eat();
		pitBull.sleep();
		pitBull.playDead();
	}

}
