package Zoo;

//Provides implementation for abstract method inherited and has its own methods specific to a zookeeper
public class ZooKeeper extends ZooEmployee {

	public void goToWork(String day) {
		System.out.println("Zookeeper arrives to zoo on day " + day);
	}

	public void wakeUpAnimal(String name) {
		System.out.println("Zookeeper wakes up " + name);
	}

	public void sleepAnimal(String name) {
		System.out.println("Zookeeper tells " + name + " to go to bed");
	}

	public void feedAnimal(String name) {
		System.out.println("Zookeeper feeds " + name);
	}

	public void exerciseAnimal(String name) {
		System.out.println("Zookeeper exercises " + name);
	}

	@Override
	public void leaveZoo(String day) {
		System.out.println("Zookeeper leaves zoo on day " + day);
	}
	public void countAnimal(String name) {
		System.out.println(name + " is counted for roll call");
	}
}
