
public class Goat extends Bovidae{
	Goat(String name){
		super.name = name;
	}
	@Override
	void eat() {
		System.out.println(name + " tries to eat your shoe");
	}
}
