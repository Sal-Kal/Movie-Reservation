package decorator;

public class DeluxeHall extends HallDecorator{
	public DeluxeHall(int n) {
		this.noOfTickets = n;
	}
	public void calculatePrice() {
		this.price = 70.0f * this.noOfTickets;
	}
	public void getPrice() {
		System.out.println("Amount to be paid: "+this.price);
	}
	public void getDescription() {
		System.out.println();
		System.out.println("No. of Tickets: "+this.noOfTickets);
		System.out.println("Amount to be paid: "+this.price);
		System.out.println("70.0Rs per head");
	}
}
