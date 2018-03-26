/****************************************************************************
 * My assingment1-10
 * Created by: Gavin Zhou 
 * Created on: Mar 2018
 *
 ****************************************************************************/
import java.util.Scanner;
import java.lang.*;


enum PlantesEnum {
	MERCURY,
	VENUS,
	EARTH,
	MARS,
	JUPITER,
	SATURN,
	URANUS,
	NEPTUNE
 
}

public class Plantes {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		
		String input = null;
		boolean Ture = true;
		PlantesEnum selectedPlanet;
	

		while (Ture) {

			System.out.print("which plantes would you like to go ?  ");
			for(PlantesEnum plantes : PlantesEnum.values()) { 
				System.out.print(plantes + "  ");
			}
			
			System.out.println("");
			
			input = scanner.nextLine();
			try {
				selectedPlanet = PlantesEnum.valueOf(input.toUpperCase());
				System.out.println("You wanted " + input);

				
			} catch (IllegalArgumentException x) {  

				System.out.println("Please input a valid planet!");
			}
			
		}
		
	}
  
} 
