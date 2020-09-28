package Zoo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ZooFoodServer extends ZooEmployee {
	private String task;
	//Observer pattern:
	//used https://www.baeldung.com/java-observer-pattern to learn about the propertyChangeSupport as observable
	private PropertyChangeSupport support;
	
	public ZooFoodServer() {
		support = new PropertyChangeSupport(this);
	}

	//Handle tasks as passed to the observable
	//These tasks are observed by the observer
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}

	public void setTask(String newTask) {
		if(newTask.equals("making food")) {
			support.firePropertyChange("task", this.task, newTask);
		}
		this.task = newTask;
	}

	
	@Override
	public void goToWork(String day) {
		System.out.println("The ZooFoodServer arrives to zoo on day " + day);
	}
	
	public void makeFood() {
		System.out.println("The ZooFoodServer is making food");
	}
	
	public void serveFood() {
		System.out.println("The ZooFoodServer is serving food");
	}
	
	public void clean() {
		System.out.println("The ZooFoodServer is cleaning");
	}
	
	@Override
	public void leaveZoo(String day) {
		System.out.println("ZooFoodServer leaves zoo on day " + day);
	}
	
	//Keep track of which task executes which function
	public void preformTask(String task) {
		switch (task) {
		case "making food":
			makeFood();
			break;
		case "serve":
			serveFood();
			break;
		case "clean":
			clean();
			break;
		}

	}

}
