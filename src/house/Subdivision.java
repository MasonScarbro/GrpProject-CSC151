package house;
import java.util.ArrayList;
import java.util.Collections;

// ---NOTES--- //
/* @get Think this is what he wants (theres already a java.lang get and add call so im a little confused) 
 * 
 * @add I don't know if this is right, confused about this being a boolean - Mason //
 * 
 * @BothSort()'s This Should be good, Removing TO DO - Mason //
 */

public class Subdivision {

	private ArrayList<House> houses = new ArrayList<>();
		
		public boolean add(House h) {
			if (houses.add(h) == true) {
				return true;
			} else {
				return false;
			} 
		}
		
		//TO DO: add get(int i) Accessor to fetch the i th house added to the subdivision (zero origin).
		
		public House get(int i) {
			return houses.get(i);
		}
		
		//TO DO: add java.util.ArrayList<House>	list() Accessor to return the list of all houses in the subdivision in the order in which they were added. //
		
		public java.util.ArrayList<House> list(){
			return houses;
		}
		
		//TO DO: add java.util.ArrayList<House>	listByArea (double floor, double ceiling)	Return a list of houses that are between a given number of square feet. //
		
		public java.util.ArrayList<House> listByArea (double floor, double ceiling){
			// -INSERT CODE HERE- //
		}
		
		//TO DO: add java.util.ArrayList<House>	listByBedrooms (int floor, int ceiling)	Return a list of houses that have between the given number of bedrooms (inclusive). //
		
		public java.util.ArrayList<House> listByBedrooms (int floor, int ceiling){
			// -INSERT CODE HERE- //
		}
		
		//TO DO: add java.util.ArrayList<House>	listByPlot (double floor, double ceiling)	Return a list of houses whose associated plot of land is between two bounds (inclusive). //
		
		public java.util.ArrayList<House> listByPlot (double floor, double ceiling){
			// -INSERT CODE HERE- //
		}
		
		//TO DO: add int size()	The number of houses in the subdivision //
		
		public int size() {
			return houses.size();
		}
		
		// java.util.ArrayList<House> sortByArea() A sorted list of all houses, ordered by the total area of the houses. //
	
		public java.util.ArrayList<House> sortByArea(){
			// for loop that iterates through each house (other than last)
			for (int i = 0; i < houses.size() - 1; i++) {
				// checks if the 'current' house area is  greater than the next
				if (houses.get(i).getTotalArea() > houses.get(i + 1).getTotalArea()) {
					// if it is swap the two places 
					Collections.swap(houses, i, i + 1);
					// resets the loop so it can continue to check if the next is greater
					i = -1;
				}
				
			}
			return houses;
		}
		
		//add java.util.ArrayList<House> sortByPlot() A sorted list of all houses, ordered by plot acreage. //
	
		public java.util.ArrayList<House> sortByPlor(){
			// for loop that iterates through each house (other than last)
			for (int i = 0; i < houses.size() - 1; i++) {
				// checks if the 'current' house plot is  greater than the next
				if (houses.get(i).getSizePlot() > houses.get(i + 1).getSizePlot()) {
					// if it is swap the two places 
					Collections.swap(houses, i, i + 1);
					
					i = -1;
				}
				
			}
			return houses;
		}
	
}
