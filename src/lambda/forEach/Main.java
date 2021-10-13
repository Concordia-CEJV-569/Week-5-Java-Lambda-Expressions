package lambda.forEach;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();

		namesList.add("Pranav");
		namesList.add("Riccardo");
		namesList.add("James");
		namesList.add("Daniel");
		namesList.add("Kritika");

//		for (String name : namesList) {
//			System.out.println(name);
//		}

		namesList.forEach(name -> System.out.println(name));
	}

}
