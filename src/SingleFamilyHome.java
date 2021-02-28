/**
 * A class that represents a single family home with an exclusive garage/laundry
 * room.
 * 
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-02-02
 */
public class SingleFamilyHome extends Residential {

	private boolean garage;
	private String grg;
	private String lR;

	public SingleFamilyHome() {

		this.garage = true;
	}

	public SingleFamilyHome(int numBedrooms, int numBathrooms, boolean laundryRoom, double totalSquareFeet,
			String projectName, String completeAddress, String occupancyGroup, String subgroup, boolean garage) {

		super(numBedrooms, numBathrooms, laundryRoom, totalSquareFeet, projectName, completeAddress, occupancyGroup,
				subgroup);

		this.garage = garage;
	}

	public boolean getGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", totalSquareFeet=" + totalSquareFeet + ", projectName="
				+ projectName + ", completeAddress=" + completeAddress + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}

	public void draw() {

		System.out.println("Drawing code for SingleFamilyHome");
	}

	/**
	 * This method is used to determine whether or not a single family home has a
	 * garage OR laundry room. This method also takes the concatenation of a String
	 * and our instance variables and stores them within a String variable in order
	 * to return them later on.
	 * 
	 * @return This returns all of the String variables that have already been
	 *         created, either through inheritance or being made specifically in
	 *         this class.
	 */
	public String displayData() {

		if (garage == true)
			grg = "Y";
		else
			grg = "N";
		if (laundryRoom == true)
			lR = "Y";
		else
			lR = "N";
		String projectName = "Project Name: " + this.projectName;
		String completeAddress = "Address: " + this.completeAddress;
		String totalSquareFeet = "Total Square Feet: " + this.totalSquareFeet;
		String occupancyGroup = "Occupancy Group: " + this.occupancyGroup;
		String subgroup = "Occupancy Subgroup: " + this.subgroup;
		String numBathrooms = "Number of Bathrooms: " + this.numBathrooms;
		String numBedrooms = "Number of Bedrooms: " + this.numBedrooms;
		String laundryRoom = "Laundry Room: " + this.lR;
		String garage = "Garage: " + this.grg;

		return projectName + "\n" + completeAddress + "\n" + totalSquareFeet + "\n" + occupancyGroup + "\n" + subgroup
				+ "\n" + numBathrooms + "\n" + numBedrooms + "\n" + laundryRoom + "\n" + garage;

	}
}