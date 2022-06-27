package decorator;

public class LuxuryHall extends HallDecorator{
	public LuxuryHall(int n) {
		this.noOfTickets = n;
	}
	public void calculatePrice() {
		this.price = 80.0f * this.noOfTickets;
	}
	public void getPrice() {
		System.out.println("Amount to be paid: "+this.price);
	}
	public void getDescription() {
		System.out.println();
		System.out.println("No. of Tickets: "+this.noOfTickets);
		System.out.println("Amount to be paid: "+this.price);
		System.out.println("80.0Rs per head");
	}

}
