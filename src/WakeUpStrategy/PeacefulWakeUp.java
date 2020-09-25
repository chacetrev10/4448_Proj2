package WakeUpStrategy;
//Animals can wake up in a peaceful manner 
public class PeacefulWakeUp implements WakeUpBehavior {
	
	private String name;
	public PeacefulWakeUp(String name) {
		this.name = name;
	}
	@Override
	public void wake() {
		System.out.println(name +" has woken up peacefully!");
	}

}
