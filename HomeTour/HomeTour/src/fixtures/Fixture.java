package fixtures;

public abstract class Fixture {

	// Fields
	private String name;
	private String shortDescription;
	private String longDescription;
	
	// Constructors
	public Fixture(String name2, String shortDescription2, String longDescription2) {
		
	}
	
	//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

}
