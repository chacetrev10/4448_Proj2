package Animals;

public class Goat extends Bovidae{
	public Goat(String name){
		super.name = name;
	}
	@Override
	public void eat() {
		System.out.println(name + " tries to eat your shoe");
	}
}
