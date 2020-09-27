import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Animals.Animal;
import Animals.Bison;
import Animals.Cat;
import Animals.Dog;
import Animals.Elephant;
import Animals.Goat;
import Animals.Hippo;
import Animals.Lion;
import Animals.Rhino;
import Animals.Tiger;
import Animals.Wolf;
import WakeUpStrategy.PeacefulWakeUp;
import WakeUpStrategy.StartledWakeUp;
import Zoo.ZooAnouncer;
import Zoo.ZooClock;
import Zoo.ZooKeeper;

public class Proj2 {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		System.out.println("Please enter the number of days you want to simulate at the zoo");
		Scanner input = new Scanner(System.in);
		int numOfDays = input.nextInt();
		Map<String,String> timeToTask = new HashMap<String,String>();
		timeToTask.put("9:00 AM", "wake");
		timeToTask.put("11:00 AM", "exercise");
		timeToTask.put("1:00 PM", "feed");
		timeToTask.put("5:00 PM", "call");
		timeToTask.put("8:00 PM", "sleep");
		ZooKeeper keeper = new ZooKeeper();
		Animal[] zoo = new Animal[20];

		// Identity: These objects are all created and have a unique location in the
		// zoo array and also have a unique name, giving them a unique identity and
		// spot in memory.
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

// Strategy pattern used to define behavior at instantiation
		for (Animal x : zoo) {
			double wakeup = Math.random();
			if (wakeup < .5) {
				x.setWakeUpBehavior(new StartledWakeUp(x.getName()));
			} else {
				x.setWakeUpBehavior(new PeacefulWakeUp(x.getName()));
			}
		}

//	Uncomment this is you want the output printed to a file
//	Referenced https://stackoverflow.com/questions/1994255/how-to-write-console-output-to-a-txt-file
//		PrintStream out = new PrintStream(new FileOutputStream("dayatthezoo.out"));
//		System.setOut(out);

		for (int day = 0; day < numOfDays; day++) {
			ZooClock dayClock = new ZooClock();
			String strDay = String.valueOf(day + 1);
			keeper.goToWork(strDay);
			
			//define observer and register it to the subject
			ZooAnouncer announcer = new ZooAnouncer();
			keeper.addPropertyChangeListener(announcer);
			while(!dayClock.getCurrentTime().equals("9:00 PM")) {
				String currentTime = dayClock.getCurrentTime();
				dayClock.announceTime();
				if(timeToTask.containsKey(currentTime)) {
				
					for (Animal x : zoo) {
						keeper.setTask(timeToTask.get(currentTime));
						keeper.preformTask(timeToTask.get(currentTime), x.getName());
						// Polymorphism: although all of these objects in the zoo are different species
						// they are all still animals, so can call the same methods.
						x.preformTask(timeToTask.get(currentTime));
					}
				}
				
			}
			keeper.leaveZoo(strDay);
			keeper.removePropertyChangeListener(announcer);
			System.out.println();
		}
	}
}
