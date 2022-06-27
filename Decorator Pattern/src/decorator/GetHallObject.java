package decorator;

public class GetHallObject {
	protected HallDecorator hall;
	public static HallDecorator getObj(int n, String type) {
		if(type.equalsIgnoreCase("regular")) {
			return new RegularHall(n);
		}
		if(type.equalsIgnoreCase("deluxe")) {
			return new DeluxeHall(n);
		}
		if(type.equalsIgnoreCase("luxury")) {
			return new LuxuryHall(n);
		}
		return null;
	}
}
