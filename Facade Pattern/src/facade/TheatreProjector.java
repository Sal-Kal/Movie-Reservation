package facade;

public class TheatreProjector implements TheatreFacade{
	public void start() {
		System.out.println("Starting Projector...");
		System.out.println("Projector has Started");
	}

	public void pause() {
		System.out.println("Projector has paused");
	}

	public void stop() {
		System.out.println("Stopping Projector...");
		System.out.println("Projector Stopped");
	}
}
