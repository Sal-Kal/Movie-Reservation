package facade;

public class Theatre {
	private TheatreFacade projector;
	private TheatreFacade popcorn;
	private TheatreFacade soundSystem;
	
	public Theatre() {
		projector = new TheatreProjector();
		popcorn = new PopcornMachine();
		soundSystem = new TheatreSoundSystem();
	}
	
	public void startProjector() {
		projector.start();
	}

	public void pauseProjector() {
		projector.pause();
	}

	public void stopProjector() {
		projector.stop();
	}


	public void startPopcorn() {
		popcorn.start();
	}

	public void pausePopcorn() {
		popcorn.pause();
	}

	public void stopPopcorn() {
		popcorn.stop();
	}


	public void startSound() {
		soundSystem.start();
	}

	public void pauseSound() {
		soundSystem.pause();
	}

	public void stopSound() {
		soundSystem.stop();
	}
}
