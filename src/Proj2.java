import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Proj2 {
	
	public static void main(String[]args) throws FileNotFoundException {
		System.out.println("Please enter the number of days you want to simulate at the zoo");
		Scanner input = new Scanner(System.in);
		int numOfDays = input.nextInt();
		
		ZooKeeper keeper = new ZooKeeper();
		Animal[] zoo = new Animal[20];
		
		//Identity: These objects are all created and have a unique location in the 
		//zoo array and also have a unique name, giving them a unique identity and
		//spot in memory.
		zoo[0] = new Hippo("Harry the Hippo");
		zoo[1] = new Hippo("Hector the Hippo");
		zoo[2] = new Elephant("Eugene the Elephant");
		zoo[3] = new Elephant("Eric the Elephant");
		zoo[4] = new Rhino("Rory the Rhino");
		zoo[5] = new Rhino("Randy the Rhino");
		zoo[6] = new Tiger("Titus the Tiger");
		zoo[7] = new Tiger("Terry the Tiger");
		zoo[8] = new Lion("Larry the Lion");
		zoo[9] = new Lion("Lenny the Lion");
		zoo[10] = new Cat("Candy the Cat");
		zoo[11] = new Cat("Carol the Cat");
		zoo[12] = new Dog("Donovan the Dog");
		zoo[13] = new Dog("Dax the Dog");
		zoo[14] = new Wolf("Wyatt the Wolf");
		zoo[15] = new Wolf("Willy the Wolf");
		zoo[16] = new Bison("Billy the Bison");
		zoo[17] = new Bison("Brandon the Bison");
		zoo[18] = new Goat("Gary the Goat");
		zoo[19] = new Goat("Grayson the Goat");
		
		
		
//	Uncomment this is you want the output printed to a file
//	Referenced https://stackoverflow.com/questions/1994255/how-to-write-console-output-to-a-txt-file
		
	
		for(int day = 0; day < numOfDays; day++) {
			String strDay = String.valueOf(day+1); 
			keeper.goToWork(strDay);
			//Polymorphism: although all of these objects in the zoo are different species
			//they are all still animals, so can call the same methods. 
			for(Animal x: zoo) {
				keeper.wakeUpAnimal(x.name);
				x.wakeUp();
				keeper.countAnimal(x.name);
				x.makeNoise();
				keeper.feedAnimal(x.name);
				x.eat();
				keeper.exerciseAnimal(x.name);
				x.roam();
				keeper.sleepAnimal(x.name);
				x.sleep();
			}
			keeper.leaveZoo(strDay);
			System.out.println();
		}
	}
}

