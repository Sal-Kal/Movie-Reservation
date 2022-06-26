package factoryMethod;

public class SMS implements Notifier{
	public void notifyUser() {
		System.out.println("This is an SMS");
		System.out.println(Notifier.movieName + " Is playing at " + Notifier.theatreName);
		System.out.println("Go check it out");
		System.out.println("The above SMS was sent to the user");
		System.out.println();
	}
}
