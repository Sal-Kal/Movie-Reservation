package factoryMethod;

public class Email implements Notifier{
	public void notifyUser() {
		System.out.println("This is an Email");
		System.out.println(Notifier.movieName + " Is playing at " + Notifier.theatreName);
		System.out.println("Go Check it out");
		System.out.println("The above Email was sent to the user");
		System.out.println();
	}
}
