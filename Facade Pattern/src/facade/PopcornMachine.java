package facade;

public class PopcornMachine implements TheatreFacade{
	public void start() {
		System.out.println("Starting Popcorn Machine... ");
		System.out.println("Popcorns can now be served");
	}

	public void pause() {
		System.out.println("Popcorn Machine has paused");
	}

	public void stop() {
		System.out.println("Stopping Popcorn Machine");
		System.out.println("Popcorn Machine has stopped");
	}
}
