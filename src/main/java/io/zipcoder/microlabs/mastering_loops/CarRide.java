package io.zipcoder.microlabs.mastering_loops;
import java.util.Scanner;

public class CarRide {
	
	String response = "";
	
	public String areWeThereYet () {	
		Scanner scanner = new Scanner(System.in);

		while (!(isYes(response))){
			System.out.println("Are we there yet?");
			response = scanner.nextLine();
			}
			
		String good = "Good!";			
		scanner.close();	
		System.out.println("Good!");
		return good;
			
	}
	
	String input = response;
	public boolean isYes(String input){
		return (input.equalsIgnoreCase("Yes"));
	}
	
}
			
