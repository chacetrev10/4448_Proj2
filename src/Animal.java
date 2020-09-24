public class Animal{
	
	//Encapsulation: using a protected member variable instead of a public one.
	//This allows us to use the 'name' variable in subclasses of Animal but nothing
	//outside can access.
	protected String name;
	WakeUpBehavior wakeUpBehavior;
	
	void wakeUp() {
		wakeUpBehavior.wake();
	}
	void makeNoise() {
		System.out.println(name + " makes noise");
	}
	
	void eat() {
		System.out.println(name + " eats");
	}
	
	void roam() {
		System.out.println(name + " roams");
	}
	
	void sleep() {
		System.out.println(name + " goes to sleep");
	}

}