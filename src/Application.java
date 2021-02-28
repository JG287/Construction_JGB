/**
 * A class that showcases the different properties that pertain to a specific type of building.
 * 
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-02-02
 */
public class Application {

	public static void main(String[] args) {

		SingleFamilyHome sfm = new SingleFamilyHome(2, 3, true, 2000.0, "Guinness House", "2346 Basket Drive",
				"Residential", "R1", true);

		System.out.println(sfm.toString() + "\n");

		sfm.setGarage(false);

		System.out.println(sfm.getGarage() + "\n");

		sfm.draw();

		System.out.print("\n");

		System.out.println(sfm.displayData() + "\n");

		SingleFamilyHome sfm2 = new SingleFamilyHome();

		System.out.println(sfm2.toString() + "\n");

		Mall m = new Mall(1, 4, 100.0, 110, 3000.0, "Jefferson Mall", "1346 Forest Hill Lane", "Business", "B"); 

		System.out.println(m.toString() + "\n");

		m.setNumRentedUnits(3);
		m.setMedianUnitSize(150.0);
		m.setNumParkingSpaces(128);

		System.out.println(m.getNumRentedUnits());
		System.out.println(m.getMedianUnitSize());
		System.out.println(m.getNumParkingSpaces() + "\n");

		m.draw();

		System.out.print("\n");

		System.out.println(m.displayData() + "\n");

		Mall m2 = new Mall();

		System.out.println(m2.toString() + "\n");

		Apartment a = new Apartment(2, 1, false, 300.5, 5, false, 1250.0, "Oak Ridge Apartments", "3437 George Road",
				"Residential", "R2");

		System.out.println(a.toString() + "\n");

		a.setNumRentableUnits(7);
		a.setParkingAvailable(true);
		a.setAvgUnitSize(415.0);

		System.out.println(a.getNumRentableUnits());
		System.out.println(a.getParkingAvailable());
		System.out.println(a.getAvgUnitSize() + "\n");

		a.draw();

		System.out.print("\n");

		System.out.println(a.displayData() + "\n");

		Apartment a2 = new Apartment();

		System.out.println(a2.toString() + "\n");

		Residential r = new Residential(2, 3, true, 2800.0, "Stanford's Residence", "1200 Parkinson Drive",
				"Residential", "R1");

		System.out.println(r.toString() + "\n");

		r.setNumBathrooms(3);
		r.setNumBedrooms(4);
		r.setLaundryRoom(false);

		System.out.println(r.getNumBathrooms());
		System.out.println(r.getNumBedrooms());
		System.out.println(r.getLaundryRoom() + "\n");

		Residential r2 = new Residential();

		System.out.println(r2.toString() + "\n");

		Business b = new Business(3, 3300.0, "Big Business Inc.", "4268 Transcontintental Avenue", "Business", "B");

		System.out.println(b.toString() + "\n");

		b.setNumRentableUnits(5);

		System.out.println(b.getNumRentableUnits() + "\n");

		Business b2 = new Business();

		System.out.println(b2.toString() + "\n");

		Building bu = new Building(2200.0, "Luigi's Gambling Casino", "7777 Lucky Street", "Residential", "R4");

		System.out.println(bu.toString() + "\n");

		bu.setTotalSquareFeet(1777.0);
		bu.setProjectName("Luigi's Epic Gambling Casino");
		bu.setCompleteAddress("7777 Super Lucky Street");
		bu.setOccupancyGroup("Business");
		bu.setSubgroup("B" + "\n");

		System.out.println(bu.getTotalSquareFeet());
		System.out.println(bu.getProjectName());
		System.out.println(bu.getCompleteAddress());
		System.out.println(bu.getOccupancyGroup());
		System.out.println(bu.getSubgroup());

		bu.draw();

		System.out.print("\n");

		System.out.println(bu.displayData() + "\n");

		Residential bu2 = new Residential();

		System.out.println(bu2.toString() + "\n");

	}
}