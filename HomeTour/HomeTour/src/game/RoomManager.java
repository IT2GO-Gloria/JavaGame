package game;

import fixtures.Room;

public class RoomManager<Exits, Exit> {
	private static final int N = 0;
	private static final int NW = 0;
	private static final int NE = 0;
	private static final int W = 0;
	private static final int E = 0;
	private static final int S = 0;
	private static final int SW = 0;
	private static final int SE = 0;
	private Room staringRoom;
	private Room[] room;
	private Exit[] exit;
	private Room startingRoom;
	
	/**
	 * This method is responsible for "loading" our rooms by instantiating
	 * the required room objects, linking them together by their exits, and
	 * designating a startingRoom
	 */
	
	public void init() {
		Room Foyer = new Room(
				"Foyer",
				"A small square room.",
				"You just entered the Foyer, the floor is a light ash hardwood flooring."
				+"\nThe Foyer has an archway to the north, you can see an open hallway."
				+"\nOn the west wall you see a floor plant, a table and a coat rack."
				+"\nOn the east wall you see a floor plant, a table and an umbrella rack."
				+"\nIn the center of the room you see a grey print square rug.");
				this.room[1] = Foyer; // Room #1 (8 total rooms)
				this.startingRoom = Foyer; // Foyer is the starting room.
				this.exit[S] = (Exit) Foyer; // Foyer Exit = S
				
		Room Hallway = new Room(
				"Hallway",
				"A rectangular open hallway.",
				"You just entered the Hallway, the floor is a light ash hardwood flooring."
				+"\nThe Hallway has two doorways to the west and two doorways to the east."
				+"\nTo the north is a window at the end of the hallway."
				+"\nTo the either side of the window sits a floor plant.");
				this.room[2]= Hallway; // Room #2 (8 total rooms)
				this.exit[N]= (Exit) Hallway; // Hallway Exit = N
				
		Room Kitchen = new Room(
				"Kitchen",
				"A huge square room.",
				"You just entered the Kitchen, the floor is a light ash hardwood flooring."
				+"\nAlong the North wall are the appliances, a sink and countertop."
				+"\nAlong the South wall are countertop and cuboards."
				+"\nSitting in the middle of the floor is a table with four chairs."); 
				this.room[3]=Kitchen; // Room #3 (8 total rooms)
				this.exit[SW] = (Exit) Kitchen; // Kitchen Exit = SW
		
		Room Bedroom = new Room(
				"Bedroom",
				"A huge square room.",
				"You just entered the Bedroom, the floor is a light ash hardwood flooring."
				+"\nAt the NW of the room, you see a doorway."
				+"\nThere is a bed with a nightstand on each side of the bed."
				+"\nEach nightstand has a lamp on it."
				+"\n At each side of the bed there are two dressers."
				+"\n on the wall is a huge flat screen TV."); 
				this.room[4]= Bedroom; // Room #4 (8 total rooms)
				this.exit[W] = (Exit) Bedroom;  // Bedroom Exit = W
		
		Room BedroomBath = new Room(
				"BedroomBath",
				"A medium square room.",
				"You just entered the bedroom bathroom."
				+"\nThe floor is lined with a teal colored tile."
				+"\nThe room has a toilet, sink and a corner shower."); 
				this.room[5]= BedroomBath; // Room #5 (8 total rooms)
				this.exit[NW] = (Exit) BedroomBath; //Bedroom Bath Exit = NW
		
		Room DinningRoom = new Room(
				"Dinning Room",
				"A large square room.",
				"You just entered the dinning room."
				+"\nThe floor is a light ash hardwood flooring."
				+"\nThere is a floor lamp in every corner of the room."
				+"\nAlong the north wall is a fireplace."
				+"\nAlong the south wall there are three tall floor plants."
				+"\nIn the center of the room sits a table and six chairs."); 
				this.room[6]= DinningRoom; // Room #6 (8 total rooms)
				this.exit[SE] = (Exit) DinningRoom; // DinningRoom Exit = SE
		
		Room LivingRoom = new Room(
				"Living Room",
				"A large square room.",
				"You just entered the living room."
				+"\nThe floor is a light ash hardwood flooring."
				+"\nAlong the north wall is a teal couch and coffee table."
				+"\nAlong the east wall is a huge flat screen TV."
				+"\nAlong the south wall is a fireplace."); 
				this.room[7]= LivingRoom; // Room #7 (8 total rooms)
				this.exit[E]= (Exit) LivingRoom; // LivingRoom Exit = E
		
		Room MainBathroom = new Room(
				"Main Bathroom",
				"A medium square room.",
				"You just entered the main bathroom."
				+"\nThe floor is lined with a teal colored tile."
				+"\nThe room has a toilet, sink and a corner shower."); 
				this.room[8]= MainBathroom; // Room #8 (8 total rooms)
				this.exit[NE] = (Exit) MainBathroom; //Main Bathroom Exit = NE
				
	/** create however many other rooms you want your house to have.
	For each room, set it's exit to null or another room (use a setter method 
	from your Room class). How you want the exits set up is up to your design 
	for the house. */
	}
	
	//Getters and Setters

	public Room getStaringRoom() {
		return staringRoom;
	}

	public void setStaringRoom(Room staringRoom) {
		this.staringRoom = staringRoom;
	}

	public Room[] getRoom() {
		return room;
	}

	public void setRooms(Room[] rooms) {
		this.room = rooms;
	}
	
	public Exit[] getExit() {
		return exit;
	}
	
	public void setExit(Exit[] exit) {
		this.exit = exit;
	}
	
}
