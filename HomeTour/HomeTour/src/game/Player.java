package game;

import fixtures.Room;

public class Player {
	//Fields
	private Room currentRoom;
	
	//Getters and Setters
	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
