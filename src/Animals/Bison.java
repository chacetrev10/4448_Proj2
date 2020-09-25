package Animals;

public class Bison extends Bovidae{
	public Bison(String name){
		super.name = name;
	}
	@Override
	public void eat() {
		System.out.println(name + " grazes on grass");
	}
}
