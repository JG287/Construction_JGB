
public class Apartment extends Residential {

	private boolean parkingAvailable;
	private double avgUnitSize;
	private int numRentableUnits;
	private String lR;
	private String pA;

	public Apartment() {

		this.avgUnitSize = 0.0;
		this.numRentableUnits = 0;
		this.parkingAvailable = true;
	}

	public Apartment(int numBedrooms, int numBathrooms, boolean laundryRoom, double avgUnitSize, int numRentableUnits,
			boolean parkingAvailable, double totalSquareFeet, String projectName, String completeAddress,
			String occupancyGroup, String subgroup) {

		super(numBedrooms, numBathrooms, laundryRoom, totalSquareFeet, projectName, completeAddress, occupancyGroup,
				subgroup);
		this.avgUnitSize = avgUnitSize;
		this.numRentableUnits = numRentableUnits;
		this.parkingAvailable = parkingAvailable;
	}

	public boolean getParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public String toString() {
		return "Apartment [parkingAvailable=" + parkingAvailable + ", avgUnitSize=" + avgUnitSize
				+ ", numRentableUnits=" + numRentableUnits + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", totalSquareFeet=" + totalSquareFeet
				+ ", projectName=" + projectName + ", completeAddress=" + completeAddress + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}

	public void draw() {

		System.out.println("Drawing code for Apartment");
	}

	public String displayData() {

		if(laundryRoom == true)
			lR = "Y";
		else 
			lR = "N";
		if(parkingAvailable == true)
			pA = "Y";
		else 
			pA= "N";
		String projectName = "Project Name: " + this.projectName;
		String completeAddress = "Address: " + this.completeAddress;
		String totalSquareFeet = "Total Square Feet: " + this.totalSquareFeet;
		String occupancyGroup = "Occupancy Group: " + this.occupancyGroup;
		String subgroup = "Occupancy Subgroup: " + this.subgroup;
		String numBathrooms = "Number of Bathrooms: " + this.numBathrooms;
		String numBedrooms = "Number of Bedrooms: " + this.numBedrooms;
		String laundryRoom = "Laundry Room: " + this.lR;
		String parkingAvailable = "Parking Available: " + this.pA;
		String numRentableUnits = "Number of Rentable Units: " + this.numRentableUnits;
		String avgUnitSize = "Average Unit Size: " + this.avgUnitSize;

		return projectName + "\n" + completeAddress + "\n" + totalSquareFeet + "\n" + occupancyGroup + "\n" + subgroup
				+ "\n" + numBathrooms + "\n" + numBedrooms + "\n" + laundryRoom + "\n" + parkingAvailable + "\n"
				+ numRentableUnits + "\n" + avgUnitSize;

	}
}