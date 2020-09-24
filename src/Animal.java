public class Animal{
	
	//Encapsulation: using a protected member variable instead of a public one.
	//This allows us to use the 'name' variable in subclasses of Animal but nothing
	//outside can access.
	protected String name;
	
	//Strategy pattern: define the variable that will hold each animal's wake behavior.
	//The two methods below this comment call the specified behavior's wake method as well as 
	//give you the oppurtunity to change wakeUp behavior at runtime. 
	protected WakeUpBehavior wakeUpBehavior;
	
	void wakeUp() {
		wakeUpBehavior.wake();
	}
	
	void setWakeUpBehavior(WakeUpBehavior wakeUp) {
		this.wakeUpBehavior  = wakeUp;
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