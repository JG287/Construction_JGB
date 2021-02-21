
public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;

	public Residential() {

		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = true;
	}

	public Residential(int numBedrooms, int numBathrooms, boolean laundryRoom, double totalSquareFeet,
			String projectName, String completeAddress, String occupancyGroup, String subgroup) {

		super(totalSquareFeet, projectName, completeAddress, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean getLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", totalSquareFeet=" + totalSquareFeet + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}

}
