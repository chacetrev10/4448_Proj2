
public class Bison extends Bovidae{
	Bison(String name){
		super.name = name;
	}
	@Override
	void eat() {
		System.out.println(name + " grazes on grass");
	}
}
