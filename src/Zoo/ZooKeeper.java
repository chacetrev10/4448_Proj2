package Zoo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import Animals.Animal;

//Provides implementation for abstract method inherited and has its own methods specific to a zookeeper
public class ZooKeeper extends ZooEmployee {

	private String task;
//used https://www.baeldung.com/java-observer-pattern to learn about the propertyChangeSupport as observable
	private PropertyChangeSupport support;

	public ZooKeeper() {
		support = new PropertyChangeSupport(this);
	}

	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}

	public void setTask(String newTask) {
		support.firePropertyChange("task", this.task, newTask);
		this.task = newTask;
	}

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

	public String getTask() {
		return task;
	}

	public void preformTask(String task, String name) {
		switch (task) {
		case "wake":
			wakeUpAnimal(name);
			break;
		case "exercise":
			exerciseAnimal(name);
			break;
		case "feed":
			feedAnimal(name);
			break;
		case "call":
			countAnimal(name);
		case "sleep":
			sleepAnimal(name);
			break;
		}

	}

}
