package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Map<String, Integer> NameToHeight = new HashMap<>();
		
		NameToHeight.put("Nadim", 71);
		NameToHeight.put("Daniel", 34);
	    NameToHeight.put("Ryan",48);
		NameToHeight.put("Katie", 99);
	    
		boolean isTrue = true;
		
		while (isTrue == true) {
			System.out.println("Name please:");
			String Name = in.next();
			System.out.println(NameToHeight.get(Name));
			if (Name.equals("quit")) {
				System.out.println("I'm done, I don't want to be around anymore");
				System.out.println("This code is stolen, i cheated");
				isTrue = false;
			}
		}
		


		
	}
}
