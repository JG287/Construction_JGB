
public class Building {

	protected double totalSquareFeet;
	protected String projectName;
	protected String completeAddress;
	protected String occupancyGroup;
	protected String subgroup;

	public Building() {

		this.totalSquareFeet = 0.0;
		this.projectName = "";
		this.completeAddress = "";
		this.occupancyGroup = "";
		this.subgroup = "";
	}

	public Building(double totalSquareFeet, String projectName, String completeAddress, String occupancyGroup,
			String subgroup) {

		this.totalSquareFeet = totalSquareFeet;
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public String toString() {
		return "Building [totalSquareFeet=" + totalSquareFeet + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}

	public void draw() {

		System.out.println("Drawing code for Building");
	}

	public String displayData() {

		String totalSquareFeet = "Total Square Feet: " + this.totalSquareFeet;
		String projectName = "Project Name: " + this.projectName;
		String completeAddress = "Complete Address: " + this.completeAddress;
		String occupancyGroup = "Occupancy Group: " + this.occupancyGroup;
		String subgroup = "Subgroup: " + this.subgroup;

		return totalSquareFeet + "\n" + projectName + "\n" + completeAddress + "\n" + occupancyGroup + "\n" + subgroup;

	}
}