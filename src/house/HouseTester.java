package house;

public class HouseTester {

	public static void main(String[] args) {
		
		House house1 = new House("colonial", 30, 20, 0.7, 4);
		
		House house2 = new House("victorian", 100, 2, 34, 4);
		
		if (House.compareArea(house1, house2) < 0) {
			System.out.println("The first house's area is less than the second");
		} else if (House.compareArea(house1, house2) > 0) {
			System.out.println("The first house's area is greater than the second");
		} else {
			System.out.println("The first house's area is equal to the second");
		}
		
		System.out.println(house1.toString());
		System.out.println(house2.toString());
		
		
	}

}
