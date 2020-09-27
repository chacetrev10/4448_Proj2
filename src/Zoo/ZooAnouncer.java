package Zoo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ZooAnouncer extends ZooEmployee implements PropertyChangeListener {

	@Override
	public void goToWork(String day) {
		System.out.println("The Zoo Anouncer arrives for work");
	}
	
	public void propertyChange(PropertyChangeEvent event) {
		if(event.getNewValue().equals("making food")) {
			System.out.println("The zooFoodServer is making food!");
		}
		else {
			System.out.println("The zookeeper is about to "+ event.getNewValue() + " the animals!");
			}
	}
	

}
