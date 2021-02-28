/**
 * A class that represents a mall with an exclusive number of rented units, the
 * median size of said units, and the number of parking spaces.
 * 
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-02-02
 */
public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;

	public Mall() {

		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	}

	public Mall(int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces,
			double totalSquareFeet, String projectName, String completeAddress, String occupancyGroup,
			String subgroup) {

		super(numRentableUnits, totalSquareFeet, projectName, completeAddress, occupancyGroup, subgroup);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}

	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", totalSquareFeet=" + totalSquareFeet
				+ ", projectName=" + projectName + ", completeAddress=" + completeAddress + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}

	public void draw() {

		System.out.println("Drawing code for Mall");
	}

	public String displayData() {

		String projectName = "Project Name: " + this.projectName;
		String numRentableUnits = "Number of Rentable Units: " + this.numRentableUnits;
		String numRentedUnits = "Number of Rented Units: " + this.numRentedUnits;
		String medianUnitSize = "Size of Unit: " + this.medianUnitSize;
		String completeAddress = "Address: " + this.completeAddress;
		String numParkingSpaces = "Number of Parking Spaces: " + this.numParkingSpaces;
		String totalSquareFeet = "Total Square Feet: " + this.totalSquareFeet;
		String occupancyGroup = "Occupancy Group: " + this.occupancyGroup;
		String subgroup = "Occupancy Subgroup: " + this.subgroup;

		return projectName + "\n" + completeAddress + "\n" + totalSquareFeet + "\n" + occupancyGroup + "\n" + subgroup
				+ "\n" + numRentableUnits + "\n" + numRentedUnits + "\n" + medianUnitSize + "\n" + numParkingSpaces;

	}
}
