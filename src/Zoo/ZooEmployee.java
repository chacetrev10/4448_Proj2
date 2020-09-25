package Zoo;
//Zoo employee class that contains methods that all zoo employees do.
//Abstract Class: we never instantiate ZooEmployee, but rather create a subclass
//that will inherit from ZooEmployee.
abstract class ZooEmployee {

	//Abstraction: we create this method but provide no functionality so future
	//subclasses can create the functionality. 
	abstract void goToWork(String day);


	void leaveZoo(String day) {
		System.out.println("Employee leaves zoo on day " + day);
	}
}