//Animals can wake up in a peaceful manner 
public class PeacefulWakeUp implements WakeUpBehavior {
	@Override
	public void wake() {
		System.out.println("The animal has woken up peacefully!");
	}

}
