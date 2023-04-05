// Isaac's Editing Test

package house;

public class House {
	private final int conversion = 43560;
	private int numBedrooms;
	private double areaOfFamRoom;
	private double areaOfLiving;
	private double sizePlot;
	private String style;
	
	// no args constructor //
	public House(){
		numBedrooms = 0;
		areaOfFamRoom = 0;
		areaOfLiving = 0;
		sizePlot = 0;
		style = "";
		
	}
	
	// Constructor Taking the Arguments Style, family room size, living room size, plot size, and number of bedrooms //
	// NOTE: The plot size is in acres so if we end up doing a total we have to convert that to feet //
	
	public House(String style, double areaOfFamRoom, double areaOfLiving, double sizePlot, int numBedrooms){ 
		
		this.style = style;
		this.areaOfFamRoom = areaOfFamRoom;
		this.areaOfLiving = areaOfLiving;
		this.sizePlot = sizePlot;
		this.numBedrooms = numBedrooms;
	}
	
	// Getter fo numBedrooms // 
	public int getNumBedrooms() {
		return numBedrooms;
	}
	
	// Setter fo numBedrooms // 
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	
	// Getter fo Area of the family room // 
	public double getAreaOfFamRoom() {
		return areaOfFamRoom;
	}
	
	// Setter fo Area of the family room // 
	public void setAreaOfFamRoom(double areaOfFamRoom) {
		this.areaOfFamRoom = areaOfFamRoom;
	}
	
	// Getter fo Area of the living room // 
	public double getAreaOfLiving() {
		return areaOfLiving;
	}
	
	// Setter fo Area of the living room // 
	public void setAreaOfLiving(double areaOfLiving) {
		this.areaOfLiving = areaOfLiving;
	}
	
	// Getter fo Size Of The Plot // 
	public double getSizePlot() {
		return sizePlot;
	}
	
	// Setter fo Size Of The Plot //
	public void setSizePlot(double sizePlot) {
		this.sizePlot = sizePlot;
	}
	
	// Getter fo The Style //
	public String getStyle() {
		return style;
	}
	
	// Setter fo The Style //
	public void setStyle(String style) {
		this.style = style;
	}
	
	// This is the getter for the total area //
	// NOTE: This May need to be tampered with //
	public double getTotalArea() {
		return areaOfLiving + areaOfFamRoom + (numBedrooms * 300) + (sizePlot * conversion);
	}
	
	// This is supposed to compare the houses total areas //
	 
	public static int compareArea(House house1,House house2) {
		if (house1.getTotalArea() < house2.getTotalArea()) {
			return -1;
			
		}
		if (house1.getTotalArea() > house2.getTotalArea()) {
			return 1;
			
		}
		else {
			return 0;
		}
	}
	// NOTE: this should be called in the test class I think, the objects I assume will be declared in the test class to//
	
	// I was A little confused about this but this is supposed to return the string of the house params details //
	public String toString() {
		return "House Style = " + getStyle() + "," + "Bedrooms = " + getNumBedrooms()
		+  "," + "family Room area = " + getAreaOfFamRoom() + "," + "area of living = " + 
		getAreaOfLiving() + "," +"plot size = " 
		+ getSizePlot() + "," + "total area = " + getTotalArea(); 
		
		
	}
	// Please change this if you can I dont know how to format this stuff //

	

}
