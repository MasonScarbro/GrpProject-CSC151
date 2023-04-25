package house;

public class HouseTester {

	public static void main(String[] args) {
		
		House house1 = new House("colonial", 100.0, 2.0, 3, 0.4);
		
		House house2 = new House("victorian", 100, 2, 34, 4);
		
		if (house1.compareArea(house2) < 0) {
			System.out.println("The first house's area is less than the second");
		} else if (house2.compareArea(house1) > 0) {
			System.out.println("The first house's area is greater than the second");
		} else {
			System.out.println("The first house's area is equal to the second");
		}
		
		System.out.println(house1.toString());
		System.out.println(house2.toString());
		
		
	}

}
