
public class Feline extends Animal{	
	
	public Feline() {
		super.wakeUpBehavior = new PeacefulWakeUp();
	}
	@Override
	void sleep() {
		double sleep_chance = Math.random();
		if (sleep_chance <= 0.3) {
			System.out.println(name + " roams");
		} else if (sleep_chance > 0.3 && sleep_chance <= 0.6) {
			System.out.println(name + " makes noise");
		} else {
			System.out.println(name + " goes to sleep");
		}
	}
	
}