package bridge;

public abstract class LanguageBridge {
	protected Languages lang;
	
	protected LanguageBridge(Languages lang) {
		this.lang = lang;
	}
	
	public abstract void select();
}
