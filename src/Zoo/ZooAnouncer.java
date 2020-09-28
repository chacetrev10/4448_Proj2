package Zoo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ZooAnouncer extends ZooEmployee implements PropertyChangeListener {

	@Override
	public void goToWork(String day) {
		System.out.println("The Zoo Anouncer arrives at the zoo on day " + day);
	}
	
	public void propertyChange(PropertyChangeEvent event) {
		if(event.getNewValue().equals("serve")) {
			System.out.println("The zooFoodServer is about to serve food!");
		}
		else if(!event.getNewValue().equals("making food") && !event.getNewValue().equals("clean")) {
			System.out.println("The zookeeper is about to "+ event.getNewValue() + " the animals!");
		}
	}

	@Override
	public void leaveZoo(String day) {
		System.out.println("Zoo Announcer leaves zoo on day " + day);
	}
}
