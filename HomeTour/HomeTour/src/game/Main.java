package game;

import java.util.Scanner;

public class Main {
	private static final Player Player;

	//create starter variables needed
		//you'll need a house, a player, etc.
		// you can also create these in your main method
	
	
	//main method
	public static void main(String[] args) {
		
		//initialize code
			//your player needs to start somewhere! (Foyer)
		
		String currentRoom;
		System.out.print("\nWelome to House Maze!"
				+"/n/tCoded by Gloria Johnston"
				+"\n"
				+"\nHave fun exploring this eight roomed house!"
				+"\n\t You are in "+(currentRoom)
				+"\n"
				+"\nWhat would you like to do now?"
				+"\n\t 1. Go to Foyer"
				+"\n\t 2. Go to Hallway"
				+"\n\t 3. Go to Kitchen"
				+"\n\t 4. Go to Dinning Room"
				+"\n\t 5. Go to Bedroom"
				+"\n\t 6. Go to Bedrrom Bathroom"
				+"\n\t 7. Go to Living Room"
				+"\n\t 8. Go to Main Bathroom"
				+"\n\t 9. Quit Game"); 
		//print out instructions to user ... 
		// Introduce your game, commands they can use, etc.
		
		
		printRoom();
		collectInput();
		parse(args, Player);
		//create game loop
			// call printRoom, call collectInput, call parse
			//things you want to happen after user quits/exits loop
	}
	
	/** 
	 * This method prints an output to the console depending on the player's current room
	 * @param player: the player object that has a currentRoom property
	 */
	
	public static void printRoom(PlayerRoom) {
		//print out info about current room
		
		//optionally show user current available exits
	}
	
	/**
	 * This method uses a Scanner object to collect input from user and
	 * divide the input into multiple elements gathered into an array.
	 * @return input: An array of words that the user entered into the console
	 */
	
	public static String[] collectInput() {
		//user scanner to get input
		
		//change input into an array of settings
		
		//return array of words to pass into parse
		return /* array of words */;
	}
	
	/**
	 * This method takes in an array of words and makes decisions such as moving
	 * player to another room or quitting the program.
	 * @param input: An array of words returned from the collectInput method
	 * @param player: Player object (you may need to update their currentRoom property)
	 */
	
	public static void parse(String[] input, Player player) {
		//Look at first word in array of input
			//if user want to go/move in a direction
				//look at second word in array of input
				//make decisions (change user's location)
			//else make decision based on user's first word
	}

}
