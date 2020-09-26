package Zoo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ZooFoodServer extends ZooEmployee {
	private String task;
	//used https://www.baeldung.com/java-observer-pattern to learn about the propertyChangeSupport as observable
	private PropertyChangeSupport support;
	
	public ZooFoodServer() {
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

	
	@Override
	void goToWork(String day) {
		System.out.println("The ZooFoodServer arrives to zoo on day " + day);
	}
	
	void makeFood() {
		System.out.println("The ZooFoodServer is making food");
	}
	
	void serveFood() {
		System.out.println("The ZooFoodServer is serving food");
	}
	
	void clean() {
		System.out.println("The ZooFoodServer is cleaning");
	}
	
	@Override
	public void leaveZoo(String day) {
		System.out.println("ZooFoodServer leaves zoo on day " + day);
	}
	
	public void preformTask(String task, String name) {
		switch (task) {
		case "make":
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
