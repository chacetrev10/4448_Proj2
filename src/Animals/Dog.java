package Animals;

public class Dog extends Canine{
	public Dog(String name){
		super.name = name;
	}
	
	@Override
	public void roam() {
		double dig_chance = Math.random();
		if (dig_chance <= 0.25) {
			System.out.println(name + " digs");
		} else {
			System.out.println(name + " roams");
		}
	}
}
