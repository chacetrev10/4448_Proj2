package WakeUpStrategy;
//Animals can wake up in a panic
public class StartledWakeUp implements WakeUpBehavior{
	private String name;
	public StartledWakeUp(String name) {
		this.name = name;
	}
	@Override
	public void wake() {
		System.out.println(name+" has woken up in a startle!");
	}
	

}
