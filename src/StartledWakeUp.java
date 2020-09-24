//Animals can wake up in a panic
public class StartledWakeUp implements WakeUpBehavior{
	@Override
	public void wake() {
		System.out.println("The animal has woken up in a startle!");
	}
	

}
