package facade;

public class TheatreSoundSystem implements TheatreFacade{
	public void start() {
		System.out.println("Starting The Sound System...");
		System.out.println("The Sound System has Started");
	}

	public void pause() {
		System.out.println("The Sound System has paused");
	}

	public void stop() {
		System.out.println("Stopping The Sound System...");
		System.out.println("The Sound System has Stopped");
	}
}
