package decorator;

public abstract class HallDecorator implements Hall{
	public int noOfTickets;
	public float price;
	public abstract void calculatePrice();
}
