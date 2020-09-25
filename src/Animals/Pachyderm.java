package Animals;
public class Pachyderm extends Animal{
	
	@Override
	public void roam() {
		//Used this website as a reference to generate random numbers.
		//https://www.javatpoint.com/how-to-generate-random-number-in-java
		double charge_chance = Math.random();
		if (charge_chance <= 0.25) {
			System.out.println(name + " charges");
		} else {
			System.out.println(name + " roams");
		}
	}
	
}