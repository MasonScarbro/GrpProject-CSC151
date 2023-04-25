package house;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;



public class Subdivision {

	private ArrayList<House> houses = new ArrayList<>();
	
	// Add a new house to the subdivision
		public boolean add(House h) {
			if (houses.add(h) == true) {
				return true;
			} else {
				return false;
			} 
		}
		
		// Accessor to fetch the i th house added to the subdivision (zero origin).
		
		public House get(int i) {
			return houses.get(i);
		}
		
		//Accessor to return the list of all houses in the subdivision in the order in which they were added. //
		
		public java.util.ArrayList<House> list(){
			return houses;
		}
		
		//Return a list of houses that are between a given number of square feet. //
		
		public java.util.ArrayList<House> listByArea (double floor, double ceiling){
			ArrayList<House> matchingHouses = new ArrayList<>();
			for (House h : houses) {
				if (h.getTotalArea() >= floor && h.getTotalArea() <= ceiling) {
					matchingHouses.add(h);
				}
			}
			return matchingHouses;
		}
		
		//Return a list of houses that have between the given number of bedrooms (inclusive). //
		
		public java.util.ArrayList<House> listByBedrooms (int floor, int ceiling){
			ArrayList<House> matchingHouses = new ArrayList<>();
			for (House h : houses) {
				if (h.getBedrooms() >= floor && h.getBedrooms() <= ceiling) {
					matchingHouses.add(h);
				}
			}
			return matchingHouses;
		}
		
		//Return a list of houses whose associated plot of land is between two bounds (inclusive). //
		
		public java.util.ArrayList<House> listByPlot (double floor, double ceiling){
			ArrayList<House> matchingHouses = new ArrayList<>();
			for (House h : houses) {
				if (h.getPlot() >= floor && h.getPlot() <= ceiling) {
					matchingHouses.add(h);
				}
			}
			return matchingHouses;
		}
		
		//Returns The number of houses in the subdivision //
		
		public int size() {
			return houses.size();
		}
		
		//A sorted list of all houses, ordered by the total area of the houses. //
	
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
		
		//A sorted list of all houses, ordered by plot acreage. //
	
		public java.util.ArrayList<House> sortByPlot(){
			// for loop that iterates through each house (other than last)
			for (int i = 0; i < houses.size() - 1; i++) {
				// checks if the 'current' house plot is  greater than the next
				if (houses.get(i).getPlot() > houses.get(i + 1).getPlot()) {
					// if it is swap the two places 
					Collections.swap(houses, i, i + 1);
					
					i = -1;
				}
				
			}
			return houses;
		}
		
		public House find(String style) {
			House houseStyle = null;
			for (int i = 0; i < houses.size(); i++) {
				if (houses.get(i).getStyle() == style) {
					houseStyle = houses.get(i);
				} else {
					break;
				}
			}
			return houseStyle;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < houses.size(); i++) {
				sb.append(houses.get(i)).append("\n");
			}
			return sb.toString();
		}
		
		//** STEP 4 FROM THIS POINT ON: **//
		
		public boolean toDisk() {
			try {
			File diskOut = new File("subdivision.txt");
			
		    BufferedWriter writer = new BufferedWriter(new FileWriter(diskOut));
		    
		    for (int i = 0; i < houses.size(); i++) {
			    writer.write(houses.get(i) + "\n");
			    }
		    	writer.close();
		    	return true;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				return false;
			}

		
		}
		
		public boolean fromDisk() {
			try {
				// initially reads the file
				BufferedReader br = new BufferedReader(new FileReader("subdivision.txt"));
				ArrayList<String[]> lines = new ArrayList<>();
				String line;
				// reads the file and stores the "lines" into a seperate array list to count the lines
				while ((line = br.readLine()) != null) {
		
						String[] fieldsT = line.split(",");
						if (fieldsT != null && fieldsT.length > 0 && !fieldsT[0].trim().isEmpty()) {
		                lines.add(fieldsT);
		                }
					
					
				}
				// Creates the new data array with the number of rows equaling the number of lines
				String[][] data = new String[lines.size()][5];
				int i = 0;
				// for each String[] in the lines arrayList iterate i.e the number of lines  
				for (String[] fields : lines) {
					   // then still for each line fill one row and each column from the fields array
			        for (int j = 0; j < fields.length; j++) {
			            data[i][j] = fields[j];
			          
			        }
			        // after create a house object and repeat to fill each house object with the new "data"
			        String name = data[i][0];
			        double arealT = Double.parseDouble(data[i][1]);
			        double areafT = Double.parseDouble(data[i][2]);
			        int bedT = Integer.parseInt(data[i][3]);
			        double plotT = Double.parseDouble(data[i][4]);
			        House hT = new House(name, arealT, areafT, bedT, plotT);
			        houses.add(hT);
			        i++;
			 }
				 br.close();
				 return true;

			} catch (IOException e) {
				System.out.println(e.getMessage());
				return false;
			}
			
		} 
		// remove function
		public void remove(int i){
			houses.remove(i);
		
		}
		// Update function
		public void update(int i, House houseToUpdate) {
		    houses.remove(i);
		    houses.add(i, houseToUpdate);
		}
		
		
		
}
