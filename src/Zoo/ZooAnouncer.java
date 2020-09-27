package Zoo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ZooAnouncer extends ZooEmployee implements PropertyChangeListener {

	@Override
	public void goToWork(String day) {
		System.out.println("The Zoo Anouncer arrives for work");
	}
	
	public void propertyChange(PropertyChangeEvent event) {
		System.out.println("\nThe zookeeper is about to "+ event.getNewValue() + " the animals!");
	}
	

}
