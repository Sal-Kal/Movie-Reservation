package decorator;

public class RegularHall extends HallDecorator{
	public RegularHall(int n) {
		this.noOfTickets = n;
	}
	public void calculatePrice() {
		this.price = 60.0f * this.noOfTickets;
	}
	public void getPrice() {
		System.out.println("Amount to be paid: "+this.price);
	}
	public void getDescription() {
		System.out.println();
		System.out.println("No. of Tickets: "+this.noOfTickets);
		System.out.println("Amount to be paid: "+this.price);
		System.out.println("60.0Rs per head");
	}
}
