// Isaac's Editing Test

package house;
// Isaac added importing of ArrayList and added the Subdivision class we will be working on. I also manually added TO DO comments //
import java.util.ArrayList;


// TO DO: Test the methods added to Subdivision class //
// NOT Tested with SubdivisionTester //
// NOT Tested with SanityCheckerVersion2 //

public class House {
	private final int conversion = 43560;
	private int bedrooms;
	private double familyRoomArea;
	private double livingRoomArea;
	private double plot;
	private String style;
	
	// no args constructor //
	public House(){
		bedrooms = 0;
		familyRoomArea = 0;
		livingRoomArea = 0;
		plot = 0;
		style = "";
		
	}
	
	// Constructor Taking the Arguments Style, family room size, living room size, plot size, and number of bedrooms //
	// NOTE: The plot size is in acres so if we end up doing a total we have to convert that to feet //
	
	public House(String style, double familyRoomArea, double livingRoomArea, int bedrooms, double plot){ 
		
		this.style = style;
		this.familyRoomArea = familyRoomArea;
		this.livingRoomArea = livingRoomArea;
		this.plot = plot;
		this.bedrooms = bedrooms;
	}
	
	// Getter fo bedrooms // 
	public int getBedrooms() {
		return bedrooms;
	}
	
	// Setter fo bedrooms // 
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	
	// Getter fo Area of the family room // 
	public double getFamilyRoomArea() {
		return familyRoomArea;
	}
	
	// Setter fo Area of the family room // 
	public void setFamilyRoomArea(double familyRoomArea) {
		this.familyRoomArea = familyRoomArea;
	}
	
	// Getter fo Area of the living room // 
	public double getLivingRoomArea() {
		return livingRoomArea;
	}
	
	// Setter fo Area of the living room // 
	public void setLivingRoomArea(double livingRoomArea) {
		this.livingRoomArea = livingRoomArea;
	}
	
	// Getter fo Size Of The Plot // 
	public double getPlot() {
		return plot;
	}
	
	// Setter fo Size Of The Plot //
	public void setPlot(double plot) {
		this.plot = plot;
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
		return livingRoomArea + familyRoomArea + (bedrooms * 300) + (plot * conversion);
	}
	
	// This is supposed to compare the houses total areas //
	 
	public int compareArea(House otherHouse) {
		if (getTotalArea() < otherHouse.getTotalArea()) {
			return -1;
			
		}
		if (getTotalArea() > otherHouse.getTotalArea()) {
			return 1;
			
		}
		else {
			return 0;
		}
	}
		// I was A little confused about this but this is supposed to return the string of the house params details //
	public String toString() {
		return  getStyle() +  "," + getFamilyRoomArea() + "," + getLivingRoomArea() + "," + getBedrooms() + "," + getPlot(); 
		
		
	}
	// Please change this if you can I dont know how to format this stuff //

	

}
