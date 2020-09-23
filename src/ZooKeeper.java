
public //Provides implementation for abstract method inherited and has its own methods specific to a zookeeper
class ZooKeeper extends ZooEmployee {

	void goToWork(String day) {
		System.out.println("Zookeeper arrives to zoo on day " + day);
	}

	void wakeUpAnimal(String name) {
		System.out.println("Zookeeper wakes up " + name);
	}

	void sleepAnimal(String name) {
		System.out.println("Zookeeper tells " + name + " to go to bed");
	}

	void feedAnimal(String name) {
		System.out.println("Zookeeper feeds " + name);
	}

	void exerciseAnimal(String name) {
		System.out.println("Zookeeper exercises " + name);
	}

	@Override
	void leaveZoo(String day) {
		System.out.println("Zookeeper leaves zoo on day " + day);
	}
}
