/**
 * A class that represents a business with an exclusive amount of rentable
 * units.
 *
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-02-02
 */
public class Business extends Building {

	protected int numRentableUnits;

	public Business() {

		this.numRentableUnits = 0;
	}

	public Business(int numRentableUnits, double totalSquareFeet, String projectName, String completeAddress,
			String occupancyGroup, String subgroup) {

		super(totalSquareFeet, projectName, completeAddress, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", totalSquareFeet=" + totalSquareFeet
				+ ", projectName=" + projectName + ", completeAddress=" + completeAddress + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}

}