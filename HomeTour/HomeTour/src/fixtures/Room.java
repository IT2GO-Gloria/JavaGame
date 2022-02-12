package fixtures;

public class Room extends Fixture {
	
	//Fields
	private Room[] exits;
	
	//constructors
	public Room(String name, String shortDescription, String longDescription) {
		// these constructors should match the ones in fixture!!!!
		super(name, shortDescription, longDescription);
		
		this.setExits(new Room[8]);
		// 8 exits for just N1, N2, N3, S1, S2, S3, W, E
	}
	
	//create your getters and setters

	public Room[] getExits() {
		return exits;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}

}

