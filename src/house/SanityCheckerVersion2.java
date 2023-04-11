package house;
import java.util.ArrayList;

public class SanityCheckerVersion2 {
	
	public static void main(String[] args) {
		House other = new House();
		House small = new House("small", 3.1, 0.2, 0, .3);
		int g = small.compareArea(other);
		int a = small.getBedrooms();
		double b = small.getFamilyRoomArea();
		double c = small.getLivingRoomArea();
		double d = small.getPlot();
		String e = small.getStyle();
		double f = small.getTotalArea();
		small.setBedrooms(2);
		small.setFamilyRoomArea(2.1);
		small.setLivingRoomArea(3.2);
		small.setPlot(2.3);
		small.setStyle("s");

		Subdivision sd = new Subdivision();
		boolean b2 = sd.add(small);
		other = sd.get(0);
		ArrayList<House> al = sd.list();
		a = sd.size();
	}

}
